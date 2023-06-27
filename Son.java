package net.hb.day0616;

public class Son extends Father { //자식클래스=subclass=서브클래스 
	public static void main(String[] args) {
		Son sn = new Son();
		sn.display();	
	}//end
		
	@Override
	public void bank() {
	  System.out.println("Son자식클래스 bank");
	  System.out.println("Son자식클래스 bank 제로화");	
	}//end

	public  void display() { //non-static메서드
	  super.bank(); //부모클래스껏 접근 super
	  this.bank(); //자식클래스껏 접근 this
	  //bank(); //super,this없으면 this=현재클래스
	  //super,this키워드는 static키워드에서 사용불가 
	  System.out.println();
	  System.out.println("Son아들 클래스 display");
	}//end 
}//Son class END






