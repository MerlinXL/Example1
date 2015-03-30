package com.company;

public class Car {
//state
	public int speed;
	private int gear;
	
	public Car() {
		super();
	}
	public Car(int speed, int gear) {
		super();
		this.speed = speed;
		this.gear = gear;
	}
	public void applyBrake(int decrement){
		speed -=decrement;
	}
	public int getGear() {
		return gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void speedup(int increment){
		speed +=increment;
	}
	
	
	
}
