package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

// 비즈니스 로직 처리 및 트랜잭션 처리 담당.
public class EmpServiceImpl 
         implements EmpService {

	EmpDAO dao;

	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<EmpDTO> findAll() {
		List<EmpDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
		    list = dao.findAll(session);
//		}catch(Exception e) {
//			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public List<EmpDTO> findByLikeEname(String ename) {
		List<EmpDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			list = dao.findByLikeEname(session, ename);
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public int insert(EmpDTO dto) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
		   n = dao.insert(session, dto);
		   session.commit();
		}finally {
			session.close();
		}
		return n;
	}

	@Override
	public int update(HashMap<String, Integer> map) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
		  n = dao.update(session, map);
		  session.commit();
		}finally {
			session.close();
		}
		return n;
	}

	@Override
	public int delete(int empno) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
		   n = dao.delete(session, empno);
		   session.commit();
		}finally {
			session.close();
		}
		return n;
	}

}
