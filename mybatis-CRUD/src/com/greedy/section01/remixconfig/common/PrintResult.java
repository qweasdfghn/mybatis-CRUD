package com.greedy.section01.remixconfig.common;

import java.util.List;

import com.greedy.section01.remixconfig.DTO.PostDTO;

public class PrintResult {

	public void printPostList(List<PostDTO> postList) {
		for (PostDTO post : postList) {
			System.out.println(post);
		}

	}

	public void printPostList(PostDTO post) {

		System.out.println(post);
	}

	public void printErrorMessage(String string) {
		if (string.equals("findAllPosts")) {
			System.out.println("조회를 할 수없습니다");
		} else if (string.equals("findPosts")) {
			System.out.println("해당코드에 존재하는 글이 없습니다.");
		}else if (string.equals("notModify")) {
			System.out.println("수정에 실패 했습니다.");
		}else if (string.equals("notDelete")) {
			System.out.println("삭제를 실패하였습니다.");
		}

	}

	public void printSuccessMessage(String string) {
		if (string.equals("modifyPost")) {
			System.out.println("수정에 성공하였습니다.");
		} else if (string.equals("deletePost")) {
			System.out.println("삭제를 성공했습니다.");
		}
	}
}
