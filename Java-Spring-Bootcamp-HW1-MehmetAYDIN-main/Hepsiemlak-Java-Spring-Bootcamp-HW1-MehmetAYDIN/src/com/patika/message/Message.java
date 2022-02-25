package com.patika.message;

import java.util.Date;

import com.patika.users.Users;

public class Message {
	public String title;
	private String contents;
	private Date sendDate;
	private Date readDate;
	private boolean gorulduMu;
	private Users sender;
	private Users client;
	
	
	public Message(String title) {
		super();
		this.title = title;
	}


	
	
	public Message() {
		super();
	}




	public Message(String title, String contents, Date sendDate, Date readDate, boolean gorulduMu, Users sender,
			Users client) {
		super();
		this.title = title;
		this.contents = contents;
		this.sendDate = sendDate;
		this.readDate = readDate;
		this.gorulduMu = gorulduMu;
		this.sender = sender;
		this.client = client;
	}




	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}


	public Date getSendDate() {
		return sendDate;
	}


	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}


	public Date getReadDate() {
		return readDate;
	}


	public void setReadDate(Date readDate) {
		this.readDate = readDate;
	}


	public boolean isGorulduMu() {
		return gorulduMu;
	}


	public void setGorulduMu(boolean gorulduMu) {
		this.gorulduMu = gorulduMu;
	}


	public Users getSender() {
		return sender;
	}


	public void setSender(Users sender) {
		this.sender = sender;
	}


	public Users getClient() {
		return client;
	}


	public void setClient(Users client) {
		this.client = client;
	}

	
	
	
	
}
