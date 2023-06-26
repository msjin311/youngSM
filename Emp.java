package net.hb.day0616;

import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Emp {

	public static void main(String[] args) {
		//문법에러 Mother mm = new Mother();
		//문법에러 Calendar cal = new Calendar();
		//문법에러 InputStream is == new InputStream();
		
		Calendar cal = Calendar.getInstance();
		GregorianCalendar child = new GregorianCalendar() ;

		

		
		int year = child.get(Calendar.YEAR);
		int yyyy = cal.get(Calendar.YEAR);
		
		System.out.println();

	}//main end
}//class END
