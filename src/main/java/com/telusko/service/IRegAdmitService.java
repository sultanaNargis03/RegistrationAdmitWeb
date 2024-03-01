package com.telusko.service;

import com.telusko.request.Student;
import com.telusko.response.AdmitCard;
import com.telusko.response.RegCard;

public interface IRegAdmitService
{

	public RegCard registerStudents(Student student);
	public RegCard fetchRegistrationCardInfo(Integer regNum);
	public AdmitCard fetchAdmitCardInfo(Integer regNum);
}
