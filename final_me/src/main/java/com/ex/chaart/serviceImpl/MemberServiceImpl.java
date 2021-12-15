package com.ex.chaart.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.chaart.Service.MemberService;
import com.ex.chaart.VO.MemberVO;
import com.ex.chaart.dao.MemberDao;
import com.ex.chaart.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
    private MemberDao memberDao;

    
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		
		return memberDao.login(vo);
		
	}
	@Override
	public int register(MemberVO vo) throws Exception {
		
		return memberDao.register(vo);
		
	}
}
