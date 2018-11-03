package ems.member;

public class Student {
	
	private String sNum;	// 학번 
	private String sId;		// 학생 아이디 
	private String sPw;		// 학생 비밀번호 
	private String sName;	// 학생 이름 
	private int sAge;		// 학생 나이 
	private String sGender;	// 학생 성별 
	private String sMajor;	// 학생 전공
	
	
	// 생성자 
	public Student(
		String sNum,	
		String sId,	
	    String sPw,
	    String sName,	
        int sAge,
        String sGender,	
        String sMajor
    ) 
	{
		this.sNum = sNum;
		this.sId = sId;
		this.sPw = sPw;
		this.sName = sName;
		this.sAge = sAge;
		this.sGender = sGender;
		this.sMajor = sMajor;
	}
	
	//학번 
	public String getsNum() {return sNum;}
	public void setsNum(String sNum) {this.sNum = sNum;}
	//학생 아이디 
	public String getsId() {return sId;}
	public void setsId(String sId) {this.sId = sId;}
	//학생 비밀번호 
	public String getsPw() {return sPw;}
	public void setsPw(String sPw) {this.sPw = sPw;}
	//학생 이름 
	public String getsName() {return sName;}
	public void setsName(String sName) {this.sName = sName;}
	//학생 나이 
	public int getsAge() {return sAge;}
	public void setsAge(int sAge) {this.sAge = sAge;}
	//학생 성별 
	public String getsGender() {return sGender;}
	public void setsGender(String sGender) {this.sGender= sGender;}
	//학생 전공 
	public String getsMajor() {return sMajor;}
	public void setsMajor(String sMajor) {this.sMajor = sMajor;}
}