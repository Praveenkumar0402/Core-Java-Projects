package com;

import java.util.Scanner;

public class TestBook {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Book title");
		String booktitle=sc.nextLine();
		
		System.out.println("Enter the Book price");
		float price=sc.nextFloat();
		String str = String.format("%.2f",price);
		sc.nextLine();
		
		Book n=new Book();
		n.setBooktitle(booktitle);
		n.setBookprice(price);
		System.out.println("Book Details");
		System.out.println("Book Title :"+n.getBooktitle());
		System.out.println("Book Price :"+n.getBookprice());
		
	}

}
