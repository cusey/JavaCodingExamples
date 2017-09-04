package org.cusey.AbstractClass;

public abstract class Shape {
	
	private String color;
	
	public Shape() {}
	
	public void setColor(String color) {this.color = color;}
	public String getColor() {return this.color;}
	
	abstract public double area();

}
