package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
		
		System.out.println("=== Teste 01: Department findById ===");
		Department department = departmentDao.findById(3);	
		System.out.println(department);
		
		System.out.println("\n=== Teste 02: department findByDepartment ===");
		department = new Department(2,null);
		List<Department> list = departmentDao.findByDepartment(department);
		for(Department obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Teste 03: Department findAll ===");
		list = departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Teste 04: Department Insert ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== Teste 05: Department Update ===");
		department = departmentDao.findById(1);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Update Completed!");
		
		
		System.out.println("\n=== Teste 06: seller Delete ===");
		System.out.println("Enter Id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
		
	}

}
