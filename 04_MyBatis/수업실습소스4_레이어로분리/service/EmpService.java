package com.service;

import java.util.HashMap;
import java.util.List;

import com.dao.EmpDAO;
import com.dto.EmpDTO;

public interface EmpService {

	public abstract void setDao(EmpDAO dao);
	public abstract List<EmpDTO> findAll();
	public abstract List<EmpDTO> findByLikeEname(String ename);
	public abstract int insert(EmpDTO dto);
	public abstract int update(HashMap<String, Integer> map);
	public abstract int delete(int empno);
}
