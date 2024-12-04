package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

// DAO 패턴 ( Data Access Object)
// DB 또는 파일등 데이터를 가지고 있는 외부자원과 연동하는 클래스. 
public class EmpDAO {

	public List<EmpDTO> findAll(SqlSession session) {
		List<EmpDTO> list = session.selectList("com.config.EmpMapper.findAll");
		return list;
	}
	
	public List<EmpDTO> findByLikeEname(SqlSession session, String ename) {
		List<EmpDTO> list = session.selectList("com.config.EmpMapper.findByLikeEname", ename);
		return list;
	}
	
	public int insert(SqlSession session, EmpDTO dto) {
		int n = session.insert("com.config.EmpMapper.insert", dto);
		return n;
	}
	public int update(SqlSession session, HashMap<String, Integer> map) {
		int n = session.update("com.config.EmpMapper.update", map);
		return n;
	}
	public int delete(SqlSession session,int empno) {
		int n = session.delete("com.config.EmpMapper.delete", empno);
		return n;
	}
}
