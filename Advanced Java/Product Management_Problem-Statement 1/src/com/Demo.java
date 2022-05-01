package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		List<Product> c =new ArrayList<Product>();
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		int ch ;
		do {
			System.out.println("1.Display");
			System.out.println("2.INSERT");
			System.out.println("3.UPDATE");
			System.out.println("4.DELETE");
			System.out.println("5.SEARCH");
			System.out.println("0.EXIT");
			System.out.println("Enter The Your Choice :");
			ch=s.nextInt();
			
			
			switch(ch) {
			case 1:
				System.out.println("Enter the Productid:");
				int Productid = s.nextInt();
				
				System.out.println("Enter The Productname :");
				String Productname = s1.nextLine();
				
				System.out.println("Enter the Productprice :");
				int  Productprice = s.nextInt();
				
				c.add(new Product(Productid ,Productname , Productprice));
			break;
			case 2:
				System.out.println("------------------");
				Iterator<Product> i= c.iterator();
				while(i.hasNext()) {
					Product e =i.next();
					System.out.println(e);
				}
				System.out.println("------------------");
				break;
			case 3:
				boolean found = false;
				System.out.println("Enter The Productid to search the record");
				 int Productid1 =s.nextInt();
				System.out.println("------------------");
				 i= c.iterator();
				while(i.hasNext()) {
					Product p =i.next();
					if(p.getProductid() == Productid1) {
						System.out.println(p);
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record is not found");
				}
				System.out.println("------------------");
				break;
			case 4:
				 found = false;
				System.out.println("Enter The Productid to Delete  the record");
				  Productid1 =s.nextInt();
				System.out.println("------------------");
				 i= c.iterator();
				while(i.hasNext()) {
					Product p =i.next();
					if(p.getProductid() == Productid1) {
						i.remove();
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record is not found");
				}else {
					System.out.println("Record is Deleted Successfully-----!");
				}
					
				System.out.println("------------------");
				break;
			case 5:
				 found = false;
				System.out.println("Enter The Productid to Update the record");
				  Productid1 =s.nextInt();
				System.out.println("------------------");
				ListIterator<Product>li = c.listIterator();
				while(li.hasNext()) {
					Product p =li.next();
					if(p.getProductid() == Productid1) {
						System.out.println("Enter The New ProductName :");
						Productname =s1.nextLine();
						
						System.out.println("Enter The New Productprice :");
						Productprice =s.nextInt();
						li.set(new Product(Productid1,Productname,Productprice));
						found = true;
					}
				}
				if(!found) {
					System.out.println("Record is not found");
				}else {
					System.out.println("Record is Updated Successfully-----!");
				}
					
				System.out.println("------------------");
				break;
			}
		
		}while(ch!=0);
	}
}