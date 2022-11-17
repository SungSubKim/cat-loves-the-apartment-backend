package com.ssafy.vue.model.service;

import java.util.Map;

import com.ssafy.vue.model.MemberDto;

public interface MemberService {

	public MemberDto login(MemberDto memberDto) throws Exception;
	public MemberDto userInfo(String userid) throws Exception;

	void joinMember(MemberDto memberDto) throws Exception;
}
