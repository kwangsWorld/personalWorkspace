-- JOIN

/*
    <JOIN>
        두 개의 이상의 테이블에서 데이터를 조회하고자 할 때 사용하는 구문이다.
        
        1. 등가 조인(EQUAL JOIN) / 내부 조인(INNER JOIN)
            연결시키는 칼럼의 값이 일치하는 행들만 조인되서 조회한다.(일치하는 값이 없는 행은 조회 X)
            
            1) 오라클 전용 구문
                [표현법]
                    SELECT 칼럼, 칼럼, ...
                    FROM 테이블1, 테이블2
                    WHERE 테이블1.칼럼명 = 테이블2.칼럼명;
                
                - FROM 절에 조회하고자 하는 테이블들을 콤마(,)로 구분하여 나열한다.
                - WHERE 절에 매칭 시킬 칼럼명에 대한 조건을 제시한다.
            
            2) ANSI 표준 구문
                [표현법]
                    SELECT 칼럼, 칼럼, ...
                    FROM 테이블1
                    [INNER] JOIN 테이블2 ON (테이블1.칼럼명 = 테이블2.칼럼명);
                
                - FROM 절에 기준이 되는 테이블을 기술한다.
                - JOIN 절에 같이 조회하고자 하는 테이블을 기술 후 매칭 시킬 칼럼에 대한 조건을 기술한다.
                - 연결에 사용하려는 칼럼명이 같은 경우 ON 구문 대신에 USING(칼럼명) 구문을 사용한다.
*/

--사원명, 부서코드 조회
SELECT EMP_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE
JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
;

--사원명, 직급코드, 직급명 조회
SELECT EMP_NAME, E.JOB_CODE, JOB_NAME
FROM EMPLOYEE E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE;

/*
    2. 다중 JOIN
        여러 개의 테이블 조인하는 경우에 사용한다.
*/

-- 사원이름, 부서코드, 부서명, 국가코드
SELECT EMP_NAME, DEPT_CODE, DEPT_TITLE, NATIONAL_CODE
FROM EMPLOYEE
JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
JOIN LOCATION ON LOCATION_ID = LOCAL_CODE;

/*
    3. 외부 조인 (OUTER JOIN)
        테이블 간의 JOIN 시 일치하지 않는 행도 포함시켜서 조회가 가능하다.
        단, 반드시 기준이되는 테이블(컬럼)을 지정해야 한다. (LEFT/RIGHT/(+))
*/

--사원명, 부서이름
SELECT EMP_NAME, DEPT_TITLE
FROM EMPLOYEE
LEFT OUTER JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID;

/*
    4. 카테시안곱(CARTESIAN PRODUCT) / 교차 조인(CROSS JOIN)
        조인되는 모든 테이블의 각 행들이 서로서로 모두 매핑된 데이터가 검색된다.
        테이블의 행들이 모두 곱해진 행들의 조합이 출력 -> 과부화의 위험
*/

--부서이름, 국가코드
SELECT DEPT_TITLE, NATIONAL_CODE
FROM DEPARTMENT
CROSS JOIN LOCATION;

/*
    5. 비등가 조인(NON EQUAL JOIN)
        조인 조건에 등호(=)를 사용하지 않는 조인문을 비등가 조인이라고 한다.
        지정한 컬럼 값이 일치하는 경우가 아닌, 값의 범위에 포함되는 행들을 연결하는 방식이다.
        ( = 이외에 비교 연산자 >, <, >=, <=, BETWEEN AND, IN, NOT IN 등을 사용한다.)
        
        -- ANSI 구문으로는 JOIN ON 구문으로만 사용이 가능하다. (USING 사용 불가)
*/

--사원명, 급여, 급여등급
SELECT EMP_NAME, SALARY, SAL_LEVEL
FROM EMPLOYEE
JOIN SAL_GRADE ON SALARY BETWEEN MIN_SAL AND MAX_SAL;

/*
    6. 자체 조인(SELF JOIN)
        같은 테이블을 다시 한번 조인하는 경우에 사용한다.
*/
--사원번호, 사원명, 사수번호, 사수명 
SELECT 
    E1.EMP_ID       AS 사원번호
    , E1.EMP_NAME   AS 사원이름
    , NVL(E1.MANAGER_ID,'사수없음') AS 사수번호
    , NVL(E2.EMP_NAME, '사수없음') AS 사수이름
FROM EMPLOYEE E1
LEFT OUTER JOIN EMPLOYEE E2 ON E1.MANAGER_ID = E2.EMP_ID
ORDER BY E1.EMP_ID;

-------------------------------------------------------------------------------
-- 1. DEPARTMENT 테이블과 LOCATION 테이블의 조인하여 부서 코드, 부서명, 지역 코드, 지역명을 조회 -> INNER JOIN
SELECT 
    DEPT_ID
    , DEPT_TITLE
    , LOCATION_ID
    , LOCAL_NAME
FROM DEPARTMENT D 
JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE;

-- 2. EMPLOYEE 테이블과 DEPARTMENT 테이블을 조인해서 보너스를 받는 사원들의 사번, 사원명, 보너스, 부서명을 조회 -> INNER JOIN, NOT NULL
SELECT 
    E.EMP_ID
    , E.EMP_NAME
    , E.BONUS
    , D.DEPT_TITLE
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
WHERE BONUS IS NOT NULL;

-- 3. EMPLOYEE 테이블과 DEPARTMENT 테이블을 조인해서 인사관리부가 아닌 사원들의 사원명, 부서명, 급여를 조회 -> INNER JOIN + NOT 인사관리부
SELECT
    E.EMP_NAME
    , D.DEPT_TITLE
    , E.SALARY
FROM EMPLOYEE E
LEFT JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
WHERE D.DEPT_TITLE != '인사관리부' OR D.DEPT_TITLE IS NULL;

-- 4. EMPLOYEE 테이블, DEPARTMENT 테이블, LOCATION 테이블의 조인해서 사번, 사원명, 부서명, 지역명 조회 -> 다중 JOIN
SELECT 
    E.EMP_ID
    , E.EMP_NAME
    , D.DEPT_TITLE
    , L.LOCAL_NAME
FROM EMPLOYEE E
LEFT JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE;


-- 5. 사번, 사원명, 부서명, 지역명, 국가명 조회 -> 다중 JOIN
SELECT
    E.EMP_ID            AS 사번
    ,E.EMP_NAME         AS 사원명
    ,D.DEPT_TITLE       AS 부서명
    ,L.LOCAL_NAME       AS 지역명
    ,N.NATIONAL_NAME    AS 국가명
FROM EMPLOYEE E
LEFT JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
LEFT JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE
LEFT JOIN NATIONAL N ON L.NATIONAL_CODE = N.NATIONAL_CODE;

-- 6. 사번, 사원명, 부서명, 지역명, 국가명, 급여 등급 조회 -> 다중 JOIN
SELECT
    E.EMP_ID            AS 사번
    ,E.EMP_NAME         AS 사원명
    ,D.DEPT_TITLE       AS 부서명
    ,L.LOCAL_NAME       AS 지역명
    ,N.NATIONAL_NAME    AS 국가명
    ,S.SAL_LEVEL        AS 급여등급
FROM EMPLOYEE E
LEFT JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
LEFT JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE
LEFT JOIN NATIONAL N ON L.NATIONAL_CODE = N.NATIONAL_CODE
LEFT JOIN SAL_GRADE S ON E.SALARY BETWEEN MIN_SAL AND MAX_SAL;

------------------------- 종합 실습 문제 -------------------------
-- 1. 직급이 대리이면서 ASIA 지역에서 근무하는 직원들의 사번, 사원명, 직급명, 부서명, 근무지역, 급여를 조회하세요.
SELECT 
    E.EMP_ID
    , E.EMP_NAME
    , J.JOB_NAME
    , D.DEPT_TITLE
    , L.LOCAL_NAME
    , E.SALARY
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE
WHERE JOB_NAME = '대리' AND SUBSTR(LOCAL_NAME,1,4) = 'ASIA';

-- 2. 70년대생 이면서 여자이고, 성이 전 씨인 직원들의 사원명, 주민번호, 부서명, 직급명을 조회하세요.
SELECT 
    E.EMP_NAME
    , E.EMP_NO
    , D.DEPT_TITLE
    , J.JOB_NAME
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
WHERE SUBSTR(EMP_NO,1,1) = '7' AND SUBSTR(EMP_NO,8,1) = '2' AND SUBSTR(EMP_NAME,1,1) = '전';

-- 3. 보너스를 받는 직원들의 사원명, 보너스, 연봉, 부서명, 근무지역을 조회하세요.
SELECT
    E.EMP_NAME, 
    E.BONUS, 
    E.SALARY, 
    D.DEPT_TITLE, 
    L.LOCAL_NAME
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE
WHERE E.BONUS IS NOT NULL;

-- 4. 한국과 일본에서 근무하는 직원들의 사원명, 부서명, 근무지역, 근무 국가를 조회하세요.
SELECT 
    E.EMP_ID
    , D.DEPT_TITLE
    , L.LOCAL_NAME
    , N.NATIONAL_NAME
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N ON L.NATIONAL_CODE = N.NATIONAL_CODE
WHERE NATIONAL_NAME = '한국' OR NATIONAL_NAME = '일본';

-- 5. 각 부서별 평균 급여를 조회하여 부서명, 평균 급여(정수 처리)를 조회하세요. 
--질문: SELECT 절이 2개의 열을 출력하는데 왜 하나의 조건만 만족해도 출력되는지?
--그룹바이를 2개로해서 모두 충족시켜야되는거 아닌지?
SELECT 
        D.DEPT_TITLE            AS 부서명
        , ROUND(AVG(E.SALARY))  AS 평균급여
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
GROUP BY D.DEPT_TITLE;

-- 6. 각 부서별 총 급여의 합이 1000만원 이상인 부서명, 급여의 합을 조회하시오.
SELECT 
        D.DEPT_TITLE            AS 부서명
        , ROUND(AVG(E.SALARY))  AS 평균급여
        , SUM(E.SALARY)         AS 총급여
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
GROUP BY D.DEPT_TITLE
HAVING SUM(E.SALARY) >= 10000000;

-- 7. 사번, 사원명, 직급명, 급여 등급, 재직여부를 조회
SELECT 
    E.EMP_ID AS 사번
    , E.EMP_NAME AS 사원명
    , J.JOB_NAME AS 직급명
    , S.SAL_LEVEL AS 급여등급
    , DECODE(E.ENT_YN, 'N', 'Y', 'Y', 'N') AS 재직여부
FROM EMPLOYEE E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
JOIN SAL_GRADE S ON E.SALARY BETWEEN S.MIN_SAL AND S.MAX_SAL;

-- 8. 보너스를 받지 않는 직원들 중 직급 코드가 J4 또는 J7인 직원들의 사원명, 직급명, 급여를 조회하시오.
SELECT 
    E.EMP_NAME
    ,J.JOB_NAME
    ,E.SALARY
FROM EMPLOYEE E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
WHERE J.JOB_CODE IN ('J4', 'J7');

-- 9. 부서가 있는 직원들의 사원명, 직급명, 부서명, 근무 지역을 조회하시오.
--질문 : 조건문 있고 없고 차이가 뭔지? DEPARTMENT 테이블의 DEPT_ID 값중  NULL값이 없어서 그런건지?
SELECT 
    E.EMP_NAME
    , J.JOB_NAME
    , D.DEPT_TITLE
    , L.LOCAL_NAME
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE
WHERE E.DEPT_CODE IS NOT NULL;

-- 10. 해외영업팀에 근무하는 직원들의 사원명, 직급명, 부서 코드, 부서명을 조회하시오
SELECT
    E.EMP_NAME
    , J.JOB_NAME
    , D.DEPT_ID
    , D.DEPT_TITLE
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
WHERE SUBSTR(D.DEPT_TITLE, 1, 4) = '해외영업';


-- 11. 이름에 '형'자가 들어있는 직원들의 사번, 사원명, 직급명을 조회하시오.
SELECT 
    E.EMP_ID AS 사번
    , E.EMP_NAME AS 사원명
    , J.JOB_NAME AS 직급명
FROM EMPLOYEE E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
WHERE E.EMP_NAME LIKE '%형%';