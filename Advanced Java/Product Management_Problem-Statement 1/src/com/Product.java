package com;

 public class Product{
	private int Productid;
	private String Productname;
	private int Productprice;
	
	Product(int Productid , String Productname ,int Productprice){
		this.Productid =Productid;
		this.Productname=Productname;
		this.Productprice=Productprice;
		
		
	}

	public int getProductid() {
		return Productid;
	}
	public String getProductname() {
		return Productname;
	}
	public int getProductprice() {
		return Productprice;
	}

	public String toString(){
		return Productid + "" + Productname + "" + Productprice;
	}
	
	
}