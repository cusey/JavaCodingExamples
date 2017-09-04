package org.cusey.AbstractClass;

public class Square extends Shape {
	 
	private double width = 0;
	private double length = 0;

	public Square(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public double getWidth() {return width;}
	public void setWidth(double width) {this.width = width;}

	public double getLength() {return length;}
	public void setLength(double length) {this.length = length;}

	@Override
	public double area() {
		return this.width * this.length;
	}
	
	public double perimeter() {
		return 2* ( this.width + this.length);
	}

	@Override
	public String toString() {
		return "Square [width=" + width + ", length=" + length + ", color="+ this.getColor() +"]";
	}


}
