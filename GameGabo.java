package net.hb.day0616;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameGabo {
	private int win=0;
	private int lose=0;
	private int draw=0;
	private int user=0;
	private int com=0;
	private int sum=0;
	public Scanner scan = new Scanner(System.in);
	
	public GameGabo(){
		
	}
	
	public GameGabo(int user) {
	}
	
//	public void user() {
//		int user=0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("가위(1) 바위(2) 보(3)");
//		scan.nextInt();
//	}
	
	public void user() {
		int user = 0;
		System.out.println("가위(1) 바위(2) 보(3)");
		while(true) {
			if (scan.hasNextInt()) {
				user = Integer.parseInt(scan.nextLine());
				break;
			} else {
				System.out.println("숫자가아님");
				scan.nextLine();
			}
		}
		while(true) {
			if (user == 1) {
				System.out.println("당신은 '가위'를 골랐습니다");
			} else if (user == 2) {
				System.out.println("당신은 '바위'를 골랐습니다");
			} else if (user == 3) {
				System.out.println("당신은 '보'를 골랐습니다");
			} else {
				System.out.println("1부터 3사이의 숫자를 입력해주세요");
				scan.nextLine();
			}	
			this.user = user;
		}
	}
	
	public void com() {
		double com1 = Math.random() * 3;
		com = (int) com1 + 1;
		if(com==1) {
			System.out.println("컴퓨터는 '가위'를 골랐습니다");
		} else if(com==2) {
			System.out.println("컴퓨터는 '바위'를 골랐습니다");
		} else if(com==3) {
			System.out.println("컴퓨터는 '보'를 골랐습니다");
		}
	}
	
	public void RSP() {
		//try {
			while(true) {
				if(sum==7) {
					break;
				}
				if(user-com == 0) {
					draw++;
				}
//				else if((user<1) || (user>3) ) {
//					System.out.println("1,2,3 중 하나를 입력해주세요");
//					user = Integer.parseInt(scan.nextLine());
//					continue;	
//				}
				else if(user==1&&com==3 || user==2 && com==1 || user==3 && com==1) {
					win++;
				}
				else {
					lose++;
				}
				user();
				com();
				sum = (win+lose+draw);
				result();
			}
		//}
		//catch (Exception e) {
		//	if (user != 1 || user != 2 || user != 3) {
		////		System.out.println("예외");
		//		scan.nextInt();
		//	}
		//
		//}
		//finally {
			
		//}
	}
	
	public void result() {
		System.out.println("게임수= "+(sum) +" 승리:" +win +" 패배:"+ lose + " 무승부:" + draw);
	}
	

	public static void main(String[] args) {
		GameGabo abc = new GameGabo();
		abc.RSP();
	}//main end
	
	
	

}//class END

//interface구현안함, 상속X, 그림안나옴
//필드,생성자
//메소드 3개이상 구현
//난수발생 Math.random(), Random r = new Random()
//총7게임 4승리 2무승부 1패
//Scanner클래스 예외처리
//게임시간 2023-06-16-금요일 시:분:초
//반복문 if문...