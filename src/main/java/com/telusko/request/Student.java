package com.telusko.request;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Student 
{
	private Integer sid;
	private String sname;
	private String yearOfReg;
	private String department;
	private String instituteName;
	private String boardName;
	//@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dob;
	
	public Student()
	{
		
	}

	public Student(Integer sid, String sname,String yearOfReg,String department, String instituteName,
			String boardName, LocalDate dob) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.yearOfReg = yearOfReg;
		this.department=department;
		this.instituteName = instituteName;
		this.boardName = boardName;
		this.dob = dob;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
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
		return "Student [sid=" + sid + ", sname=" + sname + ", yearOfReg=" + yearOfReg + ", department=" + department
				+ ", instituteName=" + instituteName + ", boardName=" + boardName + ", dob=" + dob + "]";
	}

}
