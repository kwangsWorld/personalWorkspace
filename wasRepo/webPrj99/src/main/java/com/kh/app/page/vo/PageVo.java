package com.kh.app.page.vo;

public class PageVo {
	
	private int listCount;		// 총 게시글 갯수
	private int currentPage;	// 현재 페이지
	private int pagelimit;		// 페이징 영역 페이지 갯수
	private int boardLimit;		// 한 페이지에 보여줄 게시글 갯수
	
	private int maxPage;		// 가장 마지막 페이지
	private int startPage;		// 페이징 영역 시작값
	private int endPage;		// 페이징 영역 마지막값
	
	private int startRow;		// 조회할 첫번째 행 번호 (ROWNUM)
	private int lastRow;		// 조회할 마지막 행 번호 (ROWNUM)

	//생성자
	public PageVo(int listCount, int currentPage, int pageLimit, int boardLimit) {
		this.listCount = listCount;
		this.currentPage = currentPage;
		this.pagelimit = pageLimit;
		this.boardLimit = boardLimit;
		
		this.maxPage = (int) Math.ceil((double)listCount/boardLimit); //ceil은 올림 함수, 소수점 계산을 위해 double 형변환
		this.startPage = (currentPage - 1) / pageLimit * pageLimit + 1; //6,7,8,9,10으로 페이징이 제한되었을 때 6을 구하는 식, 순서대로 연산
		this.endPage = startPage + pageLimit -1;
		
		if(endPage > maxPage) {
			endPage = maxPage;
		}
		
		this.startRow = (currentPage - 1) * boardLimit + 1;
		this.lastRow = startRow + boardLimit - 1;
	}

	
	
	public int getStartRow() {
		return startRow;
	}



	public int getLastRow() {
		return lastRow;
	}



	public int getListCount() {
		return listCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getPagelimit() {
		return pagelimit;
	}

	public int getBoardLimit() {
		return boardLimit;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}
	
	
}
