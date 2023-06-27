package net.hb.day0616;

import java.text.DecimalFormat;

public class Restaurant {
	public static void main(String[] args) {
		 Restaurant rt = new Restaurant();
		 rt.setting();
	}//main end
	
	public void setting() {
		System.out.println("Restaurant클래스 setting()메소드 12:31");
		Menu pizza = new Menu("피자", 7500);
		Menu steak = new Menu("T본", 9000);
		Menu cola = new Menu("콜라", 250);
		Menu[] menuArray = { pizza, steak, cola };
		Order cal = new Order(1200, menuArray);
		
		DecimalFormat df = new DecimalFormat("##,###");
		System.out.println("---------------------");
		System.out.println("주문합계 " + df.format(cal.totalPrice()) + "원 입니다");
	}//settings end	
}//Restaurant class END

  class Order{ //Order.java없음  Order.class 
	int tot=0;
	int orderNum;
	Menu[] menus; 
	
	public Order() { }
	public Order(String kind){ }
	public Order(int num, Menu[] marr) {
		this.orderNum = num ;
		this.menus = marr;
	}
	
	public int  totalPrice() {
	     //Menu pizza = new Menu("피자", 7500);
		 //Menu[] menuArray = { pizza, steak, cola };
		 //Order cal = new Order(1200, menuArray);
	  for(int i=0; i<menus.length ; i++) {
		  tot = tot + menus[i].price;
	  }
	  return tot;
	}//end
  }//Order class END

 class Menu{  //Menu.java없음  Menu.class 
	 String name;  //접근지정자 생략하면 public 
	 int price;    //접근지정자 생략하면 public 
	
	public Menu() { }
	public Menu(String ss, int cc) {
	    this.name=ss;
	    this.price=cc;
		System.out.println(this.name+ " " + this.price+"원 주문성공");
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;	}
	public int getPrice() {	return price;	}
	public void setPrice(int price) {this.price = price;}
}//Menu class END


 class  MyExit{
	
 }// MyExit class END
