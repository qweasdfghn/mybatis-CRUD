package com.greedy.section01.remixconfig.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static com.greedy.section01.remixconfig.common.Template.getSesstion;

import com.greedy.section01.remixconfig.DTO.ModifyPostDTO;
import com.greedy.section01.remixconfig.DTO.PostDTO;
import com.greedy.section01.remixconfig.dao.PostDAO;

public class PostService {

	public List<PostDTO> findAllPost() {

		SqlSession sqlSession = getSesstion(); // 세션 열어주기
		PostDAO postDAO = sqlSession.getMapper(PostDAO.class);
		List<PostDTO> postList = postDAO.selectAllPost();
		sqlSession.close();
		return postList; // 리턴 값 null을 변경 post List
	}

	public PostDTO findPost(String code) {
		SqlSession sqlSession = getSesstion(); // 세션 열어주기
		PostDAO postDAO = sqlSession.getMapper(PostDAO.class);
		PostDTO post = postDAO.selectPost(code);
		sqlSession.close();
		return post;

	}

	public int modifyPost(ModifyPostDTO postDTO) {// update라 다름
		SqlSession sqlSession = getSesstion(); // 세션 열어주기
		PostDAO postDAO = sqlSession.getMapper(PostDAO.class);
		int result = postDAO.modifyPost(postDTO);

		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}

	public int deletePost(String code) {
		SqlSession sqlSession = getSesstion(); // 세션 열어주기
		PostDAO postDAO = sqlSession.getMapper(PostDAO.class);
		int result = postDAO.deletePost(code);

		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();

		return result;
	}

}
