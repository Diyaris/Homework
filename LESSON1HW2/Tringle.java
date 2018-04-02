package com.gmail.diyaris1995;

public class Tringle {

	private int a;
	private int b;
	private int c;

	public Tringle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void sTringle() {
		if (a + b <= c || c + b <= a || a + c <= b) {
			System.out.println("The tringle does not can be");
		} else {
			int p = (a + b + c) / 2;
			double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println("Tringle S = "+ s + " sm^2");
		}
	}
}
