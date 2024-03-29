package com.kh.app.member;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.kh.app.db.util.JDBCTemplate;

public class MemberDao {

	
	//회원가입
	public int join(Connection conn, MemberVo vo) throws Exception {
		
		//sql
		String sql = "INSERT INTO MEMBER(ID, PWD, NICK) VALUES(?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getMemberId());
		pstmt.setString(2, vo.getMemberPwd());
		pstmt.setString(3, vo.getMemberNick());
		int result = pstmt.executeUpdate();
		
		//close
		JDBCTemplate.close(pstmt);
		
		return result;
	}
}
