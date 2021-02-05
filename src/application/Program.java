package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department departmentobj = new Department (1, "Books");
		System.out.println(departmentobj);
		
		Seller sellerobj = new Seller (21, "Bob", "bob@gmail.com", new Date (), 3000.0, departmentobj);
		System.out.println(sellerobj);
		
	}

}
