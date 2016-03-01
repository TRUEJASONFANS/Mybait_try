package com.zhxie.mybaitstry.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.zhxie.mybaitstry.db.DBAccess;

public class MessageDao {
	
	private SqlSession sqlSession;

	public void queryMessageList(String command,String description) {
		DBAccess dbAcess = new DBAccess();
		try {
			sqlSession = dbAcess.getSqlSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sqlSession == null)
				sqlSession.close();
		}
	}
}
