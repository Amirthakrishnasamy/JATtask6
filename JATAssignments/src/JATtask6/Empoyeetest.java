package JATtask6;

import java.util.Scanner;

public class Empoyeetest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID:");
		int id= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the first name:");
		String firstname=sc.nextLine();
		System.out.println("Enter the last name:");
		String lastname=sc.nextLine();
		System.out.println("Enter the salary of the employee");
		int salary=sc.nextInt();		
			Employee emp= new Employee(id, firstname, lastname, salary);
			System.out.println("Before Salary raise:");
			System.out.println(emp);
			emp.raiseSalary(18);
			System.out.println("After Salary raise:");
			System.out.println(emp);
			System.out.println("Annual Salary of the employee"+emp.getAnnualSalary());
			

	}

}
