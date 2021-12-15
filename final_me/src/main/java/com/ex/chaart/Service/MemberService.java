package com.ex.chaart.Service;

import com.ex.chaart.VO.MemberVO;

public interface MemberService {
	
	public MemberVO login(MemberVO vo) throws Exception;
	
	public int register(MemberVO vo) throws Exception;
	



}
