package org.com.classes;

import java.util.Scanner;

public class MainEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employees name");
		e.name=sc.nextLine();
		System.out.println("Enter Employees post");
		e.post=sc.nextLine();
		System.out.println("Enter Employees sallary");
		e.sallary=sc.nextDouble();

	}

}
