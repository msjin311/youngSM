package net.hb.day0616;

import java.util.Date;

public class Test extends Father implements GuestImp, AdminImp {
	public static void main(String[] args) {
		System.out.println("Test.java Father상속 2개 GuestImp/AdminImp");
	}//main end

	@Override
	public boolean connect(int port) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String manager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String login() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getWDate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}//class END
