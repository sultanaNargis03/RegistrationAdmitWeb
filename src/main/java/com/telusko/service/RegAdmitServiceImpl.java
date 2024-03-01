package com.telusko.service;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.telusko.request.Student;
import com.telusko.response.AdmitCard;
import com.telusko.response.RegCard;

@Service
public class RegAdmitServiceImpl implements IRegAdmitService 
{

	private static final String POST_URL = "http://localhost:9091/registration/getRegNo";
	private static final String GET_URL = "http://localhost:9091/registration/getRegCard/{regNum}";
	private static final String ADMIT_URL = "http://localhost:9091/registration/getAdmitCard/{regNum}";

	@Override
	public RegCard registerStudents(Student student) 
	{
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<RegCard> response = restTemplate.postForEntity(POST_URL,student,RegCard.class);
		return response.getBody();
	}

	@Override
	public RegCard fetchRegistrationCardInfo(Integer regNum) 
	{
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<RegCard> response =restTemplate.getForEntity(GET_URL, RegCard.class, regNum);
		return response.getBody();
	}

	@Override
	public AdmitCard fetchAdmitCardInfo(Integer regNum) 
	{
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<AdmitCard> response =restTemplate.getForEntity(ADMIT_URL, AdmitCard.class, regNum);
		return response.getBody();
	}

}
