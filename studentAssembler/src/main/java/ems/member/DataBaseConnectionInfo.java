package ems.member;

public class DataBaseConnectionInfo {
	
	private String jdbcUrl; // jdbc 경로 
	private String userId;	// 사용자 아이디 
	private String userPw;	// 사용자 비밀번호 
	
	// jdbc 경로 
	public String getJdbcUrl() {return jdbcUrl;} 
	public void setJdbcUrl(String jdbcUrl) {this.jdbcUrl = jdbcUrl;}
	
	// 사용자 아이디
	public String getUserId() {return userId;}
	public void setUserId(String userId) {this.userId = userId;}
	
	// 사용자 비밀번호
	public String getUserPw() {return userPw;}
	public void setUserPw(String userPw) {this.userPw = userPw;}
	
}
