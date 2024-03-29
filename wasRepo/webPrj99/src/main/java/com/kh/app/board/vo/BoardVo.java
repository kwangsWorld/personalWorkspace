package com.kh.app.board.vo;

public class BoardVo {

	private String no;
	private String categoryNo;
	private String title;
	private String content;
	private String writerNo;
	private String writerNick;
	private String hit;
	private String enrollDate;
	private String modifyDate;
	private String status;
	private String categoryName;
	
	
	
	public BoardVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardVo(String no, String categoryNo, String title, String content, String writerNo, String writerNick,
			String hit, String enrollDate, String modifyDate, String status, String categoryName) {
		super();
		this.no = no;
		this.categoryNo = categoryNo;
		this.title = title;
		this.content = content;
		this.writerNo = writerNo;
		this.writerNick = writerNick;
		this.hit = hit;
		this.enrollDate = enrollDate;
		this.modifyDate = modifyDate;
		this.status = status;
		this.categoryName = categoryName;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriterNo() {
		return writerNo;
	}
	public void setWriterNo(String writerNo) {
		this.writerNo = writerNo;
	}
	public String getWriterNick() {
		return writerNick;
	}
	public void setWriterNick(String writerNick) {
		this.writerNick = writerNick;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", categoryNo=" + categoryNo + ", title=" + title + ", content=" + content
				+ ", writerNo=" + writerNo + ", writerNick=" + writerNick + ", hit=" + hit + ", enrollDate="
				+ enrollDate + ", modifyDate=" + modifyDate + ", status=" + status + ", categoryName=" + categoryName
				+ "]";
	}
}

	
