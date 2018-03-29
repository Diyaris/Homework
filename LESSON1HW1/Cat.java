package com.gmail.diyaris1995;

public class Cat {

	private String name;
	private String breed;
	private String gender;
	private int ageInMounth;
	private boolean live;
	private int energy;
	private int hunger;
	private int thirsty;
	private int mood;
	private int smell;

	public Cat(String name, String breed, String gender, int ageInMounth) {
		super();
		this.name = name;
		this.breed = breed;
		this.gender = gender;
		this.ageInMounth = ageInMounth;
		this.live = true;
		this.energy = 100;
		this.hunger = 0;
		this.thirsty = 0;
		this.mood = 100;
		this.smell = 0;
	}

	public boolean isLive() {
		return live;
	}

	public int getEnergy() {
		return energy;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirsty() {
		return thirsty;
	}

	public int getMood() {
		return mood;
	}

	public void setLive(boolean live) {
		this.live = live;
	}

	public int getSmell() {
		return smell;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public void setThirsty(int thirsty) {
		this.thirsty = thirsty;
	}

	public void setMood(int mood) {
		this.mood = mood;
	}

	public void setSmell(int smell) {
		this.smell = smell;
	}

	void die() {
		live = false;
	}

	void eat(int eatPoint) {
		hunger = hunger - eatPoint;
		if (hunger < 0)
			hunger = 0;
	}

	void drink(int drinkPoint) {
		thirsty = thirsty - drinkPoint;
		if (thirsty < 0)
			thirsty = 0;
	}

	void sleap(double time) {
		energy = energy + (int) (Math.round(5 * time));
		if (energy > 100)
			energy = 100;
	}

	void say() {
		System.out.println("Meow!");
	}

	void played(double time) {
		mood = mood + (int) (Math.round(50 * time));
		if (mood > 100)
			mood = 100;
	}

	void wash(double time) {
		smell = smell - (int) (Math.round(75 * time));
		if (smell < 0)
			smell = 0;
	}

	void info() {

		if (!live) {
			System.out.println("Cat is die!");
		} else {
			System.out.println("NAME - " + name);
			System.out.println("BREED - " + breed);
			System.out.println("GENGER - " + gender);
			System.out.println("AGE IN MOUNTH - " + ageInMounth);
			System.out.println();
			System.out.println("THIRSTY = " + thirsty);
			System.out.println("HUNGER = " + hunger);
			System.out.println("ENERGY = " + energy);
			System.out.println("MOOD = " + mood);
			System.out.println("SMELL = " + smell);
		}
		if (smell > 80)
			System.out.println("Cat is smell!");
	}
}