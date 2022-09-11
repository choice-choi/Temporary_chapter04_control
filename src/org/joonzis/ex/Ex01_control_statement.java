package org.joonzis.ex;

public class Ex01_control_statement {

	public static void main(String[] args) {
		
		
		int num = 20;
		
		// 정수 값이 "양수" 인지 "음수" 인지 0 인지를 확인하여 출력
		
		
		if(num > 0) {
			System.out.println("양수");
		}else if(num < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		

	}

}

