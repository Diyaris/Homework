package com.gmail.diyaris1995;

public class Main {

	public static int cointer = 0; // счетчик времени сек

	public static void main(String[] args) {

		Cat one = new Cat("Fedor", "metees", "man", 38);
		Cat two = new Cat("Senya", "metees", "man", 7);

		while (one.isLive() || two.isLive()) {
			if (!timer(1000)) {
				System.out.println("                   " + cointer);
				System.out.println("_______________________________________");
				one.info();
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				two.info();
				System.out.println("_______________________________________");
				cointer++;

				if (cointer % 5 == 0)
					one.setEnergy(one.getEnergy() - 1);
				if (cointer % 2 == 0)
					one.setThirsty(one.getThirsty() + 1);
			}
		}
	}

	private static long timerStart = 0; // переменная начала таймера
	private static long timerStop = 0; // переменная конца таймера

	public static boolean timer(long time) {
		if (timerStart == 0) {
			timerStart = System.currentTimeMillis();
			timerStop = timerStart + time;
		}
		if (timerStop <= System.currentTimeMillis()) {
			timerStart = 0;
			return false;
		}
		return true;
	}

	public static int getCointer() {
		return cointer;
	}
}
