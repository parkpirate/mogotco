package com.mogotco.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MentorDTO {
	private int mentorid;
	private String userid;
	private String adminid;
	private String mentorcom;
	private String mentorcon;
	private String mentorimg;
	private String mcardimg;
	private int mentorok;
	private Date mentordate;
	private int cancelmentoring;
}
