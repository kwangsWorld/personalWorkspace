package com.kh.app.gallery.service;

import java.sql.Connection;
import java.util.List;

import com.kh.app.db.util.JDBCTemplate;
import com.kh.app.gallery.dao.GalleryDao;
import com.kh.app.gallery.vo.GalleryVo;

public class GalleryService {

	public List<GalleryVo> getGalleryList() throws Exception{
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//dao
		GalleryDao dao = new GalleryDao();
		List<GalleryVo> galleryVoList = dao.getGalleryList(conn);
		
		//tx
		
		//close
		JDBCTemplate.close(conn);
		
		return galleryVoList;
	}

}
