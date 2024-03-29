package com.kh.app.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.member.service.MemberService;

@WebServlet("/member/check/id")
public class MemberCheckIdDupController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//catch에서 out변수명 인식하기 위해서
		PrintWriter out = resp.getWriter();
		try {
			// data
			String memberId = req.getParameter("memberId");
			System.out.println(memberId);
			
			// service
			MemberService ms = new MemberService();
			boolean isOk = ms.checkIdDup(memberId);
			
			// result
			if(isOk) {
				out.write("{\"msg\" : \"ok\"}"); 
			}else {
				throw new Exception();
			}
		}catch(Exception e){
			System.out.println("[ERROR-M011] 아이디 중복체크 중 에러 발생...");
			e.printStackTrace();
			out.write("{\"msg\" : \"no\"}"); 
		}
	}
}
