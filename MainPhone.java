package org.com.classes;

import java.util.Scanner;

public class MainPhone {

	public static void main(String[] args) {
		Phone p = new Phone();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter phone's name");
		p.name=s.next();
		
		System.out.println("Enter phone's color");
		p.color=s.next();
		
		System.out.println("Enter phone's price");
		p.price=s.nextDouble();
		
		System.out.println("Enter phone's os");
		p.os=s.next();

	}

}
