package net.hb.day0616;

public interface AdminImp {
	//interface는 메서드를 선언만 함
	//interface상속키워드 implements
	//abstract키워드 생략됨, 기술해도 에러없음
	//interface에 static/default 함수구현
	
	//interface, 추상클래스는 객체화불가능 new연산자 사용못함
	//java.sql팩키지에서 interface를 타입처럼 사용 
	public boolean connect(int port);
	public String manager();
}
