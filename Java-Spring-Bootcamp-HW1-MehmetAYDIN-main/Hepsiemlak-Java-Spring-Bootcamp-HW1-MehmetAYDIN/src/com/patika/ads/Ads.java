package com.patika.ads;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.patika.message.Message;
import com.patika.realestate.RealEstate;
import com.patika.users.Users;

public class Ads {
	
	private RealEstate realEstate;
	private String title;
	private Users user; // hem bireysel & kurumsal
	private String[] photoList = new String[5];
	private BigDecimal prise;
	private int realEstateTime;
	private boolean oneCikarilsinMi = false;
	private boolean review = false;
	private Date createDate;
	private boolean active;
	public List<Message> messageBox;//Ýlan ait mesajlarý listelemek için
	Set<RealEstate> postedRE ;//Mesajalarýn yapýldýðý gayrýmenkuller
	List<Ads> adsList;//
	
	public Ads() {
		
	}



	public Ads(RealEstate realEstate, String title, Users user, String[] photoList) {
		super();
		this.realEstate = realEstate;
		this.title = title;
		this.user = user;
		this.photoList = photoList;
	}


	

	public Ads(RealEstate realEstate, String title, Users user, String[] photoList, BigDecimal prise,
			int realEstateTime, boolean oneCikarilsinMi, boolean review, Date createDate, boolean active) {
		super();
		this.realEstate = realEstate;
		this.title = title;
		this.user = user;
		this.photoList = photoList;
		this.prise = prise;
		this.realEstateTime = realEstateTime;
		this.oneCikarilsinMi = oneCikarilsinMi;
		this.review = review;
		this.createDate = createDate;
		this.active = active;
	}



	public RealEstate getRealEstate() {
		return realEstate;
	}


	

	public List<Ads> getAdsList() {
		return adsList;
	}



	public void setAdsList(List<Ads> adsList) {
		this.adsList = adsList;
	}



	public void setRealEstate(RealEstate realEstate) {
		this.realEstate = realEstate;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public Users getUser() {
		return user;
	}



	public void setUser(Users user) {
		this.user = user;
	}



	public String[] getPhotoList() {
		return photoList;
	}



	public void setPhotoList(String[] photoList) {
		this.photoList = photoList;
	}



	public BigDecimal getPrise() {
		return prise;
	}



	public void setPrise(BigDecimal prise) {
		this.prise = prise;
	}



	public int getRealEstateTime() {
		return realEstateTime;
	}



	public void setRealEstateTime(int realEstateTime) {
		this.realEstateTime = realEstateTime;
	}



	public boolean isOneCikarilsinMi() {
		return oneCikarilsinMi;
	}



	public void setOneCikarilsinMi(boolean oneCikarilsinMi) {
		this.oneCikarilsinMi = oneCikarilsinMi;
	}



	public boolean isReview() {
		return review;
	}



	public void setReview(boolean review) {
		this.review = review;
	}



	public Date getCreateDate() {
		return createDate;
	}



	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public List<Message> getMessageBox() {
		return messageBox;
	}



	public void setMessageBox(List<Message> messageBox) {
		this.messageBox = messageBox;
	}



	public Set<RealEstate> getPostedRE() {
		return postedRE;
	}



	public void setPostedRE(Set<RealEstate> postedRE) {
		this.postedRE = postedRE;
	}








	
}
