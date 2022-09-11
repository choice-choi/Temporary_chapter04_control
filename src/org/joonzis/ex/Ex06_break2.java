package org.joonzis.ex;

import java.util.Scanner;

public class Ex06_break2 {

	public static void main(String[] args) {

		// id를 입력 받아 id가 "admin"이면
		// "ID 일치" 출력 후 종료
		// 일치하지 않으면 "다시 입력하세요" 출력 후 반복

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID를 입력하세요");
			String id = sc.next();
			
			
		}
		
	}

	
	!! --------------------------------------------------------- !!
}

public static void main(String[] args) {
// 회원가입 시스템
// 로그인, 회원가입, 종료
// 1.회원가입 - 아이디, 패스워드, 닉네임을 입력받아 각각 배열에 저장
// 2.로그인 - 아이디, 패스워드를 입력받아 일치하면 닉네임님 환영합니다 출력
// 3.종료 - 프로그램 종료

// 회원의 정보를 저장할 배열
String[] ids = new String[5]; // 아이디 저장 배열
String[] pws = new String[5]; // 비밀번호 저장 배열
String[] nicks = new String[5]; // 닉네임 저장 배열
int cnt = 0;
int sum = 0;

Scanner sc = new Scanner(System.in);

while (true) {
	System.out.print("1.회원가입 2.로그인 3.종료 >> ");
	int choice = sc.nextInt();
	
	if (choice == 1) {
		
		if(cnt<5) {

		System.out.print("아이디 입력 : ");
		 String id = sc.next();
		 ids[cnt] = id;
		 
		 System.out.print("비밀번호 입력 : ");
		 String pw = sc.next();
		 pws[cnt] = pw;
		 
		 System.out.print("닉네임 입력 : ");
		 String nick = sc.next();
		 nicks[cnt] = nick;
		 
		 //lottoNumber[i] = r.nextInt(6) + 1;
		 //문제
		 //입력받은 아이디, 비밀번호, 닉네임을 배열에 저장
		 //회원가입시 배열의 다음칸에 이어서 저장을 해야 하며
		 //5명의 회원가입이 다 되었다면 추가로 회원가입을 할 시
		 //더이상 회원가입이 불가능합니다를 출력해주세요
		 //힌트. 현재 회원이 몇명 가입되어있는지 기억할 변수 필요
		 
		 cnt++;
		}else {
			System.out.println("더 이상 회원가입이 불가능합니다.");
		}

	} else if (choice == 2) {
		System.out.print("아이디 입력 : ");
		String id=sc.next();
		System.out.print("비밀번호 입력 : ");
		String pw=sc.next();
		//문제.
		//아이디와 비밀번호 일치하는 회원이 있다면
		//닉네임+"님 환영합니다!!"를 출력
		//일치하는 회원이 없다면
		//"로그인에 실패했습니다..."를 출력
		//
		for(int i = 0; i<cnt; i++) {
			if(id.equals(ids[i])&&pw.equals(pws[i])) {
					System.out.println(nicks[i]+"님 환영합니다!!");
					break;
				}else {
					System.out.println("로그인에 실패했습니다...");
				}
			} 
		}

	 else if (choice == 3) {
		System.out.println("프로그램을 종료합니다...");
		break;
	}
}

}
