package com.aurionpro.model;

public class Demo {
  private int a;
  private int b;
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}

public Demo(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}
@Override
public String toString() {
	return "Demo [a=" + a + ", b=" + b + "]";
}


}
