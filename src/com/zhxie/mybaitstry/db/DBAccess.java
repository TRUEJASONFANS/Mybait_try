package com.zhxie.mybaitstry.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBAccess {
	
	/**
	 * get the SqlSession
	 * @return a SqlSession
	 * @throws IOException a exception of IO
	 */
	public SqlSession getSqlSession() throws IOException {
		Reader reader = Resources.getResourceAsReader("com/zhxie/mybaitstry/config/Configuration.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		return sqlSessionFactory.openSession();
	}
}
