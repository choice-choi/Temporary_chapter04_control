package org.joonzis.ex;

public class Ex05_for {

	public static void main(String[] args) {
		
		//while(무한루프에 최적)보다 for문이 자주 쓰임
		//주로 배열과 함께 쓰임
		
		//1씩 증가 : num++; / num=num+1; / num+=1;
		//2씩 증가 : num=num+2; / num+=2;
		
		for(int num=0 ; num < 10 ; num++ )/*초기값,조건(끝값이 될수 있는 자리),실행이 끝난 다음에 증감*/ {
			System.out.println(num);
		}
		
		/*for문 하면 아래 식 자동으로 외워 작성하기*/
		/*1*/
		for(int num=0 ; num < 10 ; num++ ) {	// 변수를 for문 안에서 선언&초기화 해도 된다.
			System.out.println(num);
		}
		//System.out.println(num);	// num이 소멸되는 시점(for문을 벗어나며 num 소멸)
		
		/*2*/
		// for문마다 동일한 변수를 선언해도 무방하다.
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}	
		for(int i=0; i<10; i++) {
			System.out.println(i);	// 바로 위 for문의 i와 해당 i는 다른 i
		}

		/*3*/
		for(int i=0; i<5; i++) {
			System.out.println("*");
		}
		
		/*3-1, 자동for문*/
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<i+1; j++) {
				System.out.println("*");	// ln x(라인 넘기는 것 아님)
			}
			
			System.out.println();
			
			}
		
		
		
		
	}
}
