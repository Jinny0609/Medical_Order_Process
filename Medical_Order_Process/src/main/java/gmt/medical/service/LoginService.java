package gmt.medical.service;

import gmt.medical.model.LoginVO;

public interface LoginService {
	// 회원가입 정보 저장
	public void signup(LoginVO loginVO);
	// 로그인 정보 검증
	public LoginVO login_Success(LoginVO loginVO);
	
	public String findpasswordByEmailId(String emailId);
}