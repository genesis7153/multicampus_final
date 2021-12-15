package com.ex.chaart.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ex.chaart.VO.MemberVO;
import com.ex.chaart.mapper.MemberMapper;

@Repository
public class MemberDao {
	
	 
	@Autowired
	private MemberMapper mapper;
	
	public MemberVO login(MemberVO vo) throws Exception{
		MemberVO member = mapper.getLoginMember(vo.getId(), vo.getPassword());
		return member;
	}
	
	public int register(MemberVO vo) throws Exception{
		int result = mapper.insertMember(vo);

		return result;
	}

	

	
	
	
	

}
