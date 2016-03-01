package com.zhxie.mybaitstry.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.google.common.collect.Lists;
import com.zhxie.mybaitstry.db.DBAccess;
import com.zhxie.mybaitstry.domain.Message;

public class MessageDao {
	
	private SqlSession sqlSession;

	public void queryMessageList(String command,String description) {
		DBAccess dbAcess = new DBAccess();
		List<Message> messageList = Lists.newArrayList();
		try {
			sqlSession = dbAcess.getSqlSession();
			Message message = new Message();
			message.setCommand(command);
			message.setDescription(description);
			messageList = sqlSession.selectList("Message.queryMessageList",
					message);
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sqlSession == null)
				sqlSession.close();
		}
	}
}
