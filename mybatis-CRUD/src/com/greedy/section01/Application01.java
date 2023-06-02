package com.greedy.section01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.greedy.section01.remixconfig.controller.PostController;

public class Application01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PostController postController = new PostController();
		boolean sta = true;
		do {
			System.out.println("블로그 관리");
			System.out.println("1. 전체 글 조회하기");
			System.out.println("2. 단일 글 조회하기");
			System.out.println("3. 글 수정하기");
			System.out.println("4. 글 삭제하기(비활성화)");
			System.out.println("5. 종료");
			System.out.println("번호를 입력해 주세요");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				postController.findAllPost(); // 메소드 없음
				break;

			case 2:
				postController.findPost(inputPostNo()); // inputPostNo 메소드 있음
				break;

			case 3:
				postController.modifyPost(ModifyPostContent());
				break;
				
			case 4:
				postController.deletePost(DeletePostState());
				break;
			case 5:
				sta = false;
				System.out.println("종료되었습니다.");
				break;
			default :
				System.out.println("잘못 입력했습니다.");
			}
		} while (sta);

	}

	private static Map<String, String> inputPostNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("글 번호를 입력하세요 : ");
		String code = sc.nextLine();

		Map<String, String> parameter = new HashMap<String, String>();
		parameter.put("code", code);
		return parameter;
	}

	private static Map<String, String> ModifyPostContent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("글 번호를 입력해주세요");
		String code = sc.nextLine();
		System.out.println("수정할 내용을 적어주세요");
		String content = sc.nextLine();
		
		
		Map<String, String> parameter = new HashMap<String, String>();
		parameter.put("code", code);
		parameter.put("content", content);
		return parameter;

	}
	private static Map<String, String> DeletePostState() {
		Scanner sc = new Scanner(System.in);
		System.out.println("글 번호를 입력해주세요.");
		String code = sc.next();
		
		Map<String, String> parameter = new HashMap<String, String>();
		parameter.put("code", code);
		return parameter;
	}

}
