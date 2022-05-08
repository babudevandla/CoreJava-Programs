package com.java8.practice;

public class WeekdayDemo {

	public static void main(String[] args) {

		int inputNumber =15;
		String inputWeekDay="SATURDAY";
		
		int givenWeekdaynum=0;
		
		if(inputNumber>7) {
			inputNumber=inputNumber%7;
		}
		WeekdayDemo demo= new WeekdayDemo();
		givenWeekdaynum =demo.getWeekdayNumber(inputWeekDay);
		
		givenWeekdaynum=givenWeekdaynum+inputNumber;
		if(givenWeekdaynum>7) {
			givenWeekdaynum=givenWeekdaynum%7;
		}
		System.out.println(demo.getWeekdayName(givenWeekdaynum));
		
		
	}
	
	public int getWeekdayNumber(String inputWeekDay) {
		int givenWeekdaynum=0;
		if(inputWeekDay.equals("SUNDAY")) {
			givenWeekdaynum=1;
		}else if(inputWeekDay.equals("MONDAY")) {
			givenWeekdaynum=2;
		}else if(inputWeekDay.equals("TUESDAY")) {
			givenWeekdaynum=3;
		}else if(inputWeekDay.equals("WEDNESDAY")) {
			givenWeekdaynum=4;
		}else if(inputWeekDay.equals("THURSDAY")) {
			givenWeekdaynum=5;
		}else if(inputWeekDay.equals("FRIDAY")) {
			givenWeekdaynum=6;
		}else if(inputWeekDay.equals("SATURDAY")) {
			givenWeekdaynum=7;
		}
		
		return givenWeekdaynum;
	}
	
	public String getWeekdayName(int number) {
		
		String weekdayName="";
		if(number==1) {
			weekdayName="SUNDAY";
		}else if(number==2) {
			weekdayName="MONDAY";
		}else if(number==3) {
			weekdayName="TUESDAY";
		}else if(number==4) {
			weekdayName="WEDNESDAY";
		}else if(number==5) {
			weekdayName="THURSDAY";
		}else if(number==6) {
			weekdayName="FRIDAY";
		}else if(number==7) {
			weekdayName="SATURDAY";
		}
		
		return weekdayName;
	}

}
