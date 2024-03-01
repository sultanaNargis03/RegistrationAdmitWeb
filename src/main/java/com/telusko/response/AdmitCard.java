package com.telusko.response;

import java.time.LocalDate;

public class AdmitCard 
{
	private String sname;
	private String rollNo;
	private Integer regNum;
	private String yearOfReg;
	private String department;
	private String instituteName;
	private String boardName;
	private LocalDate dob;
	
	public AdmitCard() 
	{
		
	}
	public AdmitCard(String sname, String rollNo, Integer regNum, String yearOfReg, String department,
			String instituteName, String boardName, LocalDate dob) 
	{
		
		this.sname = sname;
		this.rollNo = rollNo;
		this.regNum = regNum;
		this.yearOfReg = yearOfReg;
		this.department = department;
		this.instituteName = instituteName;
		this.boardName = boardName;
		this.dob = dob;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public Integer getRegNum() {
		return regNum;
	}
	public void setRegNum(Integer regNum) {
		this.regNum = regNum;
	}
	public String getYearOfReg() {
		return yearOfReg;
	}
	public void setYearOfReg(String yearOfReg) {
		this.yearOfReg = yearOfReg;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "AdmitCard [sname=" + sname + ", rollNo=" + rollNo + ", regNum=" + regNum + ", yearOfReg=" + yearOfReg
				+ ", department=" + department + ", instituteName=" + instituteName + ", boardName=" + boardName
				+ ", dob=" + dob + "]";
	}
		
}
