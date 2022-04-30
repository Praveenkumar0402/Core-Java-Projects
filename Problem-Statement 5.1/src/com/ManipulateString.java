package com;

public class ManipulateString {

	public static void main(String[] args) {
		String txt= "JAVA is Simple";
		
		System.out.println(txt.toUpperCase()); //UpperCase
		
		System.out.println(txt.toLowerCase()); //LowerCase
		
		
		String[] s1=txt.split("\\s");	//1st words of letter
		for(String w:s1){  
			System.out.print(w.charAt(0)); 
			System.out.print(" ");
		}
		System.out.println(" ");
		
		//String Builder reverse
		StringBuilder s3= new StringBuilder("Simple is JAVA");
		
		Object words21;
		System.out.println("String = " + s3.toString());
		StringBuilder reverseStr = s3.reverse();
		System.out.println("Reverse String = " + reverseStr.toString());
		
		//Total Length
		System.out.println("length of string:" + txt.length());
	}

}
