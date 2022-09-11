package org.joonzis.ex;

public class Ex04_do_while {

	public static void main(String[] args) {

		//while은 조건 먼저 비교하고 실행하거나 실행 안 하거나
		//do while은 무조건 실행한 뒤 조건에 따라 실행(쓰이는 빈도 적음)
		
		int num = 0;
		
		do {
		System.out.println(num);
		num++;
		}while(num < 10); //(num <= 9) 도 가능하지만 사용 빈도 적음
		

		//10번 반복은 0~9를 뜻
		
	}
}
