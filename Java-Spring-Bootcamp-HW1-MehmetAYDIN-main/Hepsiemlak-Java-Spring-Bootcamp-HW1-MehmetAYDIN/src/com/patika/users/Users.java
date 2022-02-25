package com.patika.users;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.patika.ads.Ads;
import com.patika.message.Message;
import com.patika.realestate.RealEstate;

public class Users {
	private String userType; // bireysel & kurumsal & yeniTip
	private String name;
	private String email;
	private String photo;
	private String biography;
	private String taxNum;
	Set<Ads> favoriteAds;//Kullanýcýya ait tekrar etmeyen ilanlarý tutmak için
	List<Ads> postedAds;//Kullanýcýya ait yayýnlanan ilanlar
	public List<Message> messageBox;//Kullanýcýya ait yayýnlana mesajlar
	Set<RealEstate> favoriteRE;//Kullanýcya ait gayrý menkuller
	
	public Users() {
		super();
	}
	
	



	public Users(String userType, String name, String email, String biography, String taxNum,
			Set<Ads> favoriteAds, List<Ads> postedAds, List<Message> messageBox) {
		super();
		this.userType = userType;
		this.name = name;
		this.email = email;
		this.biography = biography;
		this.taxNum = taxNum;
		this.favoriteAds = favoriteAds;
		this.postedAds = postedAds;
		this.messageBox = messageBox;
	}
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public String getTaxNum() {
		return taxNum;
	}
	public void setTaxNum(String taxNum) {
		this.taxNum = taxNum;
	}
	public Set<Ads> getFavoriteAds() {
		return favoriteAds;
	}
	public void setFavoriteAds(Set<Ads> favoriteAds) {
		this.favoriteAds = favoriteAds;
	}
	public List<Ads> getPostedAds() {
		return postedAds;
	}
	public void setPostedAds(List<Ads> postedAds) {
		this.postedAds = postedAds;
	}
	public List<Message> getMessageBox() {
		return messageBox;
	}
	public void setMessageBox(List<Message> messageBox) {
		this.messageBox = messageBox;
	}

	public Set<RealEstate> getFavoriteRE() {
		return favoriteRE;
	}

	public void setFavoriteRE(Set<RealEstate> favoriteRE) {
		this.favoriteRE = favoriteRE;
	}

}
