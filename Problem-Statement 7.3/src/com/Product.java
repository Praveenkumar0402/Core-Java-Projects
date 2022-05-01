package com;

public class Product implements java.io.Serializable {

	private int m_prodID;
	private String m_prodName;

	Product() {
		m_prodID = -1;
		m_prodName = "";
	}

	Product(int newID, String newName) {
		m_prodID = newID;
		m_prodName = newName;
	}

	public int GetID() {
		return m_prodID;
	}

	public String GetName() {
		return m_prodName;
	}

	public void SetID(int newID) {
		m_prodID = newID;
	}

	public void SetName(String newName) {
		m_prodName = newName;
	}

	// Method to print out our data
	public void PrintValues() {
		System.out.println(m_prodID + " " + m_prodName);
	}

	public boolean equals(Object otherProduct) {
		Product p = (Product) otherProduct;
		return (this.m_prodID == p.m_prodID);
	}

}
