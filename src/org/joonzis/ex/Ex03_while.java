package org.joonzis.ex;

public class Ex03_while {

	public static void main(String[] args) {
		
		int num = 0; //초기화
		// while을 이용하여 정수 0~9까지 총 10회 반복하여 출력하기
		while(num <= 9) {
			System.out.println(num);
			num++; //num=num+1;
		}
		
		
		int num2 = 0;
		while(true) {
			System.out.println(num2);
			num2++;
			if(num2 == 10) { //출력9번해야 num2가 10됨
				break;
			}
		}
	}
	

