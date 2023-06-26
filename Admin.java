package net.hb.day0616;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Admin {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in ;
		PrintStream ps = System.out ;

		String name ="홍길동";
		int age = 21 ;
		System.out.println("우리나라 3:17 3:20");
		ps.println("이름 " + name);
		ps.println("나이 " + age);
		ps.println();
		
		int dan=0;
		ps.print("단입력>> ");
		//dan = System.in.read(); //byte처리=ascii인식 예외처리
		//dan = is.read();        //byte처리=ascii인식 예외처리
		
		Scanner sc = new Scanner(System.in); //Scanner(3번째 생성자 InputStream)
		dan = sc.nextInt(); //입력한 내용그대로 인식 숫자/문자
		for(int i=1; i<10; i++) {
			ps.println(dan+"*"+i+"="+(dan*i));
			if(i==6) {
				break;
			}
		}

	}

}
