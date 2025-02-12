package org.com.classes;

import java.util.Scanner;

public class MainFlower {

	public static void main(String[] args) {
        Flower e = new Flower();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Flower name");
		e.name=sc.nextLine();
		System.out.println("Enter Flower color");
		e.color=sc.nextLine();
		System.out.println("Enter Flower smell");
		e.smell=sc.next();

	}

}
