package com.kh.app.home;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kh.app.board.vo.BoardVo;


@WebServlet("/test")
public class Test extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet 호출됨!");
		String str = req.getParameter("str");
		System.out.println("str : " + str);
		resp.getWriter().write("{\"msg\":\"good\"}");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost 호출됨!");
		
		//Body에 담김 데이터 읽기
		BufferedReader br = req.getReader();
		//읽기 준비
		String bodyData = "";
		//읽기 위한 변수
		String temp = "";
		//담은 데이터에 합칠 변수
		
		while(( temp = br.readLine()) != null) {
			bodyData += temp;
		}
		System.out.println("bodyData : " + bodyData);
		
		//읽어들인 문자열(JSON형태) 가공하기
		//Gson객체준비
		Gson gson = new Gson();
		//JSON 문자열로 객체 만들기
		BoardVo vo = gson.fromJson(bodyData, BoardVo.class);
		System.out.println("JSON 문자열을 이용해서 만들어진 객체 : " + vo);
		
		resp.getWriter().write("{\"msg\":\"good\"}");
	}
	

}
