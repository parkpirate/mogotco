package com.mogotco.mentoringoption;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mogotco.dto.MentoringOptionDTO;
import com.mogotco.service.MentoringOptionService;

@SpringBootTest
	class UpdateMentoringOption {
	@Autowired
	MentoringOptionService service;
	
	@Test
	void contextLoads() {
		MentoringOptionDTO moption = new MentoringOptionDTO(404,203,"17:00",0);
		try {
			service.modify(moption);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
