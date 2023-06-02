package com.greedy.section01.remixconfig.common;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransaction;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.greedy.section01.remixconfig.dao.PostDAO;



public class Template {
	
	private static SqlSessionFactory sessionFactory; // 세션 팩토리 선언 계속사용하려고 밖에 선언
	private static final String DRIVER ="oracle.jdbc.driver.OracleDriver"; // 드라이버선언
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "TEST"; //
	private static final String PASSWORD = "TEST";// 사용하려는 패스워드
	
	//자바 config 사용방식
	public static SqlSession getSesstion() { //메소드 생성
		if(sessionFactory == null) { //처음 값이 null이라 if문 실행
			Environment environment = new Environment("dev", new JdbcTransactionFactory(), new PooledDataSource(DRIVER,URL,USER,PASSWORD));
			Configuration configuration = new Configuration(environment);
			configuration.addMapper(PostDAO.class);
			
			sessionFactory = new SqlSessionFactoryBuilder().build(configuration);
			
		}
		return sessionFactory.openSession(false);   // 세션 생성
	}
}
