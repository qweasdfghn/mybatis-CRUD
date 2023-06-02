package com.greedy.section01.remixconfig.controller;

import java.util.List;
import java.util.Map;

import com.greedy.section01.remixconfig.DTO.ModifyPostDTO;
import com.greedy.section01.remixconfig.DTO.PostDTO;
import com.greedy.section01.remixconfig.common.PrintResult;
import com.greedy.section01.remixconfig.service.PostService;

public class PostController {
	
	private final PostService postService; //전역공간에 생성 service패키지
	private final PrintResult printResult; //common 패키지
	
	public PostController() { //기본생성자 생성
		this.postService = new PostService(); //생성자를 통해서 초기화
		this.printResult = new PrintResult();
	}
	
	

	public void findAllPost() {
		List<PostDTO> postList = postService.findAllPost(); //쿼리를 불러왓을때 값이 여러개라 리스트로 받기위해서 만듬
		
		if (postList != null) {
			printResult.printPostList(postList);
		}else {
			printResult.printErrorMessage("findAllPosts");
		}
		
		
		
	}



	public void findPost(Map<String, String> inputPostNo) {
		
		String code = inputPostNo.get("code");
		
		PostDTO post = postService.findPost(code);
		
		if (post != null) {
			printResult.printPostList(post);
		}else {
			printResult.printErrorMessage("findPosts");
		}
		
	}



	public void modifyPost(Map<String, String> modifyPostContent) { // 사용자 입력해서 dto에 넣어줌
		
		ModifyPostDTO postDTO = new ModifyPostDTO();
		
		postDTO.setPostNo(modifyPostContent.get("code"));
		postDTO.setFileContent(modifyPostContent.get("content"));
		
		int result = postService.modifyPost(postDTO); //update는 인트형으로 서비스에 있는 modify호출
		
		if (result > 0) {
			printResult.printSuccessMessage("modifyPost");
		}else {
			printResult.printErrorMessage("notModify");
		}
	}



	public void deletePost(Map<String, String> deletePostState) {
		
		String code = deletePostState.get("code");
		
		int result = postService.deletePost(code);
		
		if (result > 0) {
			printResult.printSuccessMessage("deletePost");
		}else {
			printResult.printErrorMessage("notDelete");
		}
	}
	
	

}
