package com.greedy.section01.remixconfig.DTO;

import java.sql.Date;

public class PostDTO {
	
	private String postNo;
	private String fileNo;
	private String fileTitle;
	private String fileContent;
	private Date fileTime;
	private String fileState;
	private String cateNo;
	private String blogNo;
	public PostDTO() {
		
	}
	public PostDTO(String postNo, String fileNo, String fileTitle, String fileContent, Date fileTime, String fileState,
			String cateNo, String blogNo) {
		super();
		this.postNo = postNo;
		this.fileNo = fileNo;
		this.fileTitle = fileTitle;
		this.fileContent = fileContent;
		this.fileTime = fileTime;
		this.fileState = fileState;
		this.cateNo = cateNo;
		this.blogNo = blogNo;
	}
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public String getFileNo() {
		return fileNo;
	}
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}
	public String getFileTitle() {
		return fileTitle;
	}
	public void setFileTitle(String fileTitle) {
		this.fileTitle = fileTitle;
	}
	public String getFileContent() {
		return fileContent;
	}
	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}
	public Date getFileTime() {
		return fileTime;
	}
	public void setFileTime(Date fileTime) {
		this.fileTime = fileTime;
	}
	public String getFileState() {
		return fileState;
	}
	public void setFileState(String fileState) {
		this.fileState = fileState;
	}
	public String getCateNo() {
		return cateNo;
	}
	public void setCateNo(String cateNo) {
		this.cateNo = cateNo;
	}
	public String getBlogNo() {
		return blogNo;
	}
	public void setBlogNo(String blogNo) {
		this.blogNo = blogNo;
	}
	@Override
	public String toString() {
		return "PostDTO [postNo=" + postNo + ", fileNo=" + fileNo + ", fileTitle=" + fileTitle + ", fileContent="
				+ fileContent + ", fileTime=" + fileTime + ", fileState=" + fileState + ", cateNo=" + cateNo
				+ ", blogNo=" + blogNo + "]";
	}
	
	
	// 기본생성자 , 매개변수 있는 생성자// 게터 세터// toString 생성
	
	
	

}
