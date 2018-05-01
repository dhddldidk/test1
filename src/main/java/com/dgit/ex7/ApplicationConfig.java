package com.dgit.ex7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dgit.ex4.Report;
import com.dgit.ex4.StudentInfo;
import com.dgit.ex6.Family;

@Configuration

public class ApplicationConfig {

	@Bean
	public Family family1(){
		Family family = new Family("멋쟁이 아빠", "멋쟁이 엄마");
		family.setSister("멋쟁이 동생");
		
		return family;
	}
	
	@Bean
	public Report report1(){
		Report report = new Report();
		report.setGrade1(91);
		report.setGrade1(81);
		report.setGrade1(71);
		report.setGrade1(61);
		return report;
	}
	
	@Bean
	public StudentInfo student1(){
		StudentInfo s = new StudentInfo(report1(), family1());
		s.setName("멋쟁이");
		s.setClassGrade(2);
		s.setEng(88);
		s.setKor(56);
		s.setMath(100);
		return s;
		
	}
	
	@Bean
	public StudentInfo student2(){
		StudentInfo s = new StudentInfo();
		s.setReport(report1());
		s.setName("신사");
		s.setClassGrade(4);
		s.setEng(78);
		s.setKor(98);
		s.setMath(66);
		return s;
		
	}
}
