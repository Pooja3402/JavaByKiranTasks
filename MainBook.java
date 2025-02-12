package org.com.classes;

import java.util.Scanner;

public class MainBook {
	
	public static void main(String[] args) {
	
		Book b = new Book ();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the name of book:");
	    b.name= sc.nextLine();
	    System.out.println("Enter the price of book:");
	    b.price=sc.nextInt();
	    System.out.println("Enter the quantity of book:");
	    b.quantity = sc.nextInt();
	    System.out.println("Enter the author of book:");
	    b.author = sc.next();
	    System.out.println("Enter the pages of book:");
	    b.pages = sc.nextInt();
	    b.total = b.quantity*b.price;
	    System.out.println("The total of book is: " + b.total);
	    
	}

}
