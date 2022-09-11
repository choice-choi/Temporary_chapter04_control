package org.joonzis.ex;

public class Ex02_switch {

	public static void main(String[] args) {
		
		// 성인과 미성년자를 구분하는 코드
		int age = 25;
		
		if(age >= 20) {
			System.out.println("성인");
		}else {
			//System.out.println("미성년자");
		}
		
		
		
		
		String gender = "남";
		
		//if랑 다르게 switch는 값을 딱 맞춰야 함
		switch(gender) {
			case "남": System.out.println("남자!!"); //실행문 (정수를 갖고 미성년자인지 성인인지를 구분할 수 있는걸 찾기)
				break; //해당 구문이 끝날 때 사용
			case "여": System.out.println("여자!!");
				break;
		}
}
}



