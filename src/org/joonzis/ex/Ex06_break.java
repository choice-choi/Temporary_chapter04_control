package org.joonzis.ex;

import java.util.Scanner;

public class Ex06_break {

	public static void main(String[] args) {

		// id를 입력 받아 id가 "admin"이면
		// "ID 일치" 출력 후 종료
		// 일치하지 않으면 "다시 입력하세요" 출력 후 반복

		// 1) ID를 입력해주세요
		// 2) String id = "admin";
		// 3) 입력한 id를 "admin"이 맞는지 비교
		// 4) 아이디가 일치하지 않으면
		// 5) 다시 입력하는 1~4번 무한루프, 따라서 반복문 while 사용

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("ID를 입력하세요 : ");
			String id = sc.next();
			if (id.equals("admin")) {	//String은 .equals로 비교함
				System.out.println("ID 일치");
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
		}

	}

}
