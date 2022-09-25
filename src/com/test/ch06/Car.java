package com.test.ch06;

import java.util.ArrayList;

public class Car {
	private String company = "기아";
	private String model = "카니발";
	private String color = "흰색";
	private int maxSpeed = 350;
	private int speed;
	private int price;
	private String[] dueDate;
	private String realDate;
	static int count = 0;
	
	public String[] getDueDate() {
		
		
		return dueDate;
	}

	public void setDueDate(String[] dueDate) {
		for(int i = 0 ; i < dueDate.length; i++) {
			String value = dueDate[i];
		}
		
		
		switch (count) {
		   case 1 : 
			   this.realDate = dueDate[0];
			   break;
		   case 2 : 
			   this.realDate = dueDate[1];
			   break;
		   case 3 : 
			   this.realDate = dueDate[2];
			   break;
		   case 4 : 
			   this.realDate = dueDate[3];
			   break;
		   case 5 : 
			   this.realDate = dueDate[4];
			   break;   
		}
		
		for(String value : dueDate) {
			// 10명이 요청
			//dueDate 늦어
			// 1명 : 제일 빠른 날짜
			
		}
		this.dueDate = dueDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Car(){
		count ++;
	}
	
	public Car(String company) {
		this.company = company;
		count ++;
	}
	
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
		count ++;
	}
	
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
		count ++;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		
		// Speed 따라서 가격 책정
		decisionPriceCase(maxSpeed);
		this.maxSpeed = maxSpeed;
	}
	
	
	private void decisionPrice(int maxSpeed) {
		if(maxSpeed < 150) {
			this.price = 1000;
		}else if(maxSpeed < 200){
			this.price = 2000;
		}else if(maxSpeed < 250){
			this.price = 3000;
		}else {
			this.price = 0;	
		}
	}
	
	private void decisionPriceCase(int maxSpeed) {
		
		switch(maxSpeed){
		  case 100 :
			  this.price = 500;
			  break;
		  case 150:
			  this.price = 1000;
			  break;
		  case 200:
			  this.price = 1500;
			  break;
		  case 250:
			  this.price = 2000;
			  break;
		  case 300:
			  this.price = 2500;
			  break;
		  default :
			  this.price = 0;
			  break;
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String toString() {
		String returnVal = "";
		returnVal = "company :" + this.company +"\n"
				   + "model :" + this.model + "\n"
				   + "color :" + this.color + "\n"
				   + "maxSpeed :" + this.maxSpeed + "\n"
				   + "speed :" + this.speed + "\n"
				   + "price :" + this.price + "\n"
				   + "count :" + this.count;
		/*		
		company : company
		model : model
		color : color
		maxSpeed :maxSpeed
		speed : speed
			*/
		return returnVal;
	}
}
