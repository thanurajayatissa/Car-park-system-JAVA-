package com.car_park_management;

//prepared by EN19379616

public class DateTime {
	
	//variables to hold attributes of the date
	private int day;
	private int month;
	private int year;
	
	
	public int getday() {
		return day;
	}
	
	public void setday(int day) {
		this.day = day;
	}
	
	public int getmonth() {
		return month;
	}
	
	public void setmonth(int month) {
		this.month = month;
	}
	
	 public int getyear() {
	        return year;
	    }
	 
	 public void setyear(int year) {
	        this.year = year;
	    }

	 //variables to hold attributes of the time
	 private int hour;
	 private int minute;
	 private int second;
	 
	 public int gethour() {
		 return hour;
	 }
	 public void sethour(int hour) {
		 this.hour = hour;
	 }
	 
	 public int getminute() {
		 return minute;
	 }
	 public void setminute(int minute) {
		 this.minute = minute;
	 }
	 
	 public int getsecond() {
		 return second;
	 }
	 public void setsecond(int second) {
		 this.second = second;
	 }
	 
	 @Override
	 public String toString() {
		 return day+"."+month+"."+year+"/"+hour+":"+minute+":"+second;
		 
	 }
	 
}
