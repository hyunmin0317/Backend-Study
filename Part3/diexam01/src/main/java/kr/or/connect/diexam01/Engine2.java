package kr.or.connect.diexam01;

import org.springframework.stereotype.Component;

@Component
public class Engine2 {
	public Engine2() {
		System.out.println("Engine 생성자");
	}
	
	public void exec() {
		System.out.println("엔진이 동작합니다.");
	}
}