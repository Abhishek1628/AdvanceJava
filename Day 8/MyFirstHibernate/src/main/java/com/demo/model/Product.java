package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy;

@Entity
@Table(name="product333")
public class Product {
	@Id
	@GeneratedValue
   private int pid;
   private String pname;
   private int qty;
   private float price;
public Product() {
	super();
}
public Product(int pid, String pname, int qty, float price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.qty = qty;
	this.price = price;
}
public Product( String pname, int qty, float price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.qty = qty;
	this.price = price;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + "]";
}
   
}
