package org.com.classes;

import java.util.Scanner;

public class MainDog {
	public static void main(String[] args) {
        
		Dog e = new Dog();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name of dog");
		e.name=sc.nextLine();
		System.out.println("Enter the color of dog");
		e.color=sc.nextLine();
		System.out.println("Enter the breed of dog");
		e.breed=sc.nextLine();
		System.out.println("Enter the age of dog");
		e.age=sc.nextInt();
		System.out.println("Enter the sound of dog");
		e.sound=sc.next();
	}

}
