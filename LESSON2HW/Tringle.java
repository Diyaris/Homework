package com.gmail.diyaris1995;

public class Tringle extends Shape {

	private Point pointA = new Point();
	private Point pointB = new Point();
	private Point pointC = new Point();

	public Tringle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	private double a = tringleSideLength(pointA, pointB);
	private double b = tringleSideLength(pointB, pointC);
	private double c = tringleSideLength(pointC, pointA);

	public double tringleSideLength(Point pointOne, Point pointTwo) {
		double sideLength = Math
				.sqrt(Math.pow(pointTwo.getX() - pointOne.getX(), 2) + Math.pow(pointTwo.getY() - pointOne.getY(), 2));
		return sideLength;

	}
	@Override
	double getArea() {
		double p = (a + b + c) / 2;
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return s;
	}

	@Override
	double getPerimetr() {
		return a + b + c;
	}


}
