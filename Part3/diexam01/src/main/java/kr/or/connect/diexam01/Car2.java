package kr.or.connect.diexam01; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Component;

@Component 
public class Car2
{ 
	@Autowired
	private Engine v8; 
	
	public Car2() { 
		System.out.println("Car 생성자");
	}
	
	public void run() { 
		System.out.println("엔진을 이용하여 달립니다."); 
		v8.exec();
	}
}