package com.telusko.response;

import java.time.LocalDate;

public class RegCard 
{
	private Integer regNum;
	private String sname;
	private String yearOfReg;
	private String instituteName;
	private String boardName;
	private LocalDate dob;
	
	
	public RegCard() 
	{
		
	}

	public RegCard(Integer regNum,String sname, String yearOfReg, String instituteName, String boardName, LocalDate dob) {
		super();
		this.regNum = regNum;
		this.sname = sname;
		this.yearOfReg = yearOfReg;
		this.instituteName = instituteName;
		this.boardName = boardName;
		this.dob = dob;
	}

	public Integer getRegNum() {
		return regNum;
	}

	public void setRegNum(Integer regNum) {
		this.regNum = regNum;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getYearOfReg() {
		return yearOfReg;
	}

	public void setYearOfReg(String yearOfReg) {
		this.yearOfReg = yearOfReg;
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
		return "RegCard [regNum=" + regNum + ", sname=" + sname + ", yearOfReg=" + yearOfReg
				+ ", instituteName=" + instituteName + ", boardName=" + boardName + ", dob=" + dob + "]";
	}
	
}
