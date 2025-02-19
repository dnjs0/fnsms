package com.fnsms.ticket;

import java.util.Calendar;

/**
 * 이용권의 기본정보가 담긴 클래스 입니다.
 * @author 1조
 */
public class Ticket {
	
	private int ticketNo;
	private String ticketClassify;
	private int ticketUseDays;
	private Calendar regDate;
	private Calendar sellEndDate;
	private int classTimes;
	private int price;
	
	
	public Ticket(int ticketNo, String ticketClassify, int ticketUseDays, Calendar regDate, Calendar sellEndDate,
			int classTimes, int price) {
		super();
		this.ticketNo = ticketNo;
		this.ticketClassify = ticketClassify;
		this.ticketUseDays = ticketUseDays;
		this.regDate = regDate;
		this.sellEndDate = sellEndDate;
		this.classTimes = classTimes;
		this.price = price;
	}


	public int getTicketNo() {
		return ticketNo;
	}


	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}


	public String getTicketClassify() {
		return ticketClassify;
	}


	public void setTicketClassify(String ticketClassify) {
		this.ticketClassify = ticketClassify;
	}


	public int getTicketUseDays() {
		return ticketUseDays;
	}


	public void setTicketUseDays(int ticketUseDays) {
		this.ticketUseDays = ticketUseDays;
	}


	public Calendar getRegDate() {
		return regDate;
	}


	public void setRegDate(Calendar regDate) {
		this.regDate = regDate;
	}


	public Calendar getSellEndDate() {
		return sellEndDate;
	}


	public void setSellEndDate(Calendar sellEndDate) {
		this.sellEndDate = sellEndDate;
	}


	public int getClassTimes() {
		return classTimes;
	}


	public void setClassTimes(int classTimes) {
		this.classTimes = classTimes;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ticket [ticketNo=");
		builder.append(ticketNo);
		builder.append(", ticketClassify=");
		builder.append(ticketClassify);
		builder.append(", ticketUseDays=");
		builder.append(ticketUseDays);
		builder.append(", regDate=");
		builder.append("" + regDate.get(Calendar.YEAR) + (regDate.get(Calendar.MONTH)+1) + regDate.get(Calendar.DATE));
		builder.append(", sellEndDate=");
		builder.append("" + sellEndDate.get(Calendar.YEAR) + (sellEndDate.get(Calendar.MONTH)+1) + sellEndDate.get(Calendar.DATE));
		builder.append(", classTimes=");
		builder.append(classTimes);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	
	

}
