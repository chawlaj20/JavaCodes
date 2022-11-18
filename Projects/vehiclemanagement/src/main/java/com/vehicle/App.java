package com.vehicle;

import java.util.List;
import com.dao.AdminDao;
import com.entity.Admin;
import com.entity.Admindetails;


public class App {

	public static void main(String[] args) {
		
		//save two admins
		
		Admin admin=new Admin("Varun","Sharma","varun@gmail.com");
		Admindetails admindetails=new Admindetails("Car","Nano");
		admindetails.setAdmin(admin);
		admin.setAdmindetails(admindetails);
		
		Admin admin1=new Admin("kiran","Varma","kiran@gmail.com");
		Admindetails admindetails1=new Admindetails("Bike","pulsur");
		admindetails1.setAdmin(admin1);
		admin1.setAdmindetails(admindetails1);
		
		Admin admin2=new Admin("sanu","ahire","sanu@gmail.com");
		Admindetails admindetails2=new Admindetails("Bike","pulsur");
		admindetails2.setAdmin(admin2);
		admin2.setAdmindetails(admindetails2);
		
		AdminDao admindao=new AdminDao();
		admindao.saveAdmin(admin);
		admindao.saveAdmin(admin1);
		admindao.saveAdmin(admin2);
		
		admindao.updateAdmin(admin);
	    
		admindao.deleteAdmin(2);
		
		
		List<Admin> admins=admindao.getAllAdmin();
		admins.forEach(admintemp->System.out.println(admintemp.getFirstName()));
	}
	

}
