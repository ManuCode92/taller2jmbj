package com.bootcamp.taller2jmbj.respository;

import java.math.BigDecimal;

public class Product {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public String name;
	public BigDecimal price;
	public Tax tax;

	public Product(String name, BigDecimal price, Tax tax) {
	this.name = name;
	this.price = price;
	this.tax = tax;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}
	
	


}
