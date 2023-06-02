package com.greedy.section01.remixconfig.DTO;

public class ModifyPostDTO {
	
	private String postNo;
	private String fileContent;
	public ModifyPostDTO() {
		
		
	}
	public ModifyPostDTO(String postNo, String fileContent) {
		super();
		this.postNo = postNo;
		this.fileContent = fileContent;
	}
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public String getFileContent() {
		return fileContent;
	}
	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}
	@Override
	public String toString() {
		return "ModifyPostDTO [postNo=" + postNo + ", fileContent=" + fileContent + "]";
	}
	
	

}
