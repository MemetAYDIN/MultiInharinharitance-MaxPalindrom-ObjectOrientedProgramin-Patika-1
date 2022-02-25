package com.patika.realestate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.patika.ads.Ads;
import com.patika.message.Message;
import com.patika.users.Users;

public class RealEstate {

	String city;
	String district;
	String realEstateType;
	String roomCount;
	int m2;
	int floorNumber;
	private boolean favorite;//is favorite realEstate 
	private Users user;
	private Ads ads;
	Set<Ads> favoriteAds;
	List<Ads> postedAds;
	public List<Message> messageBox;
	List<RealEstate> realEstateList;

	


	public RealEstate(String city, String district, String realEstateType, String roomCount, int m2, int floorNumber,
			boolean favorite) {
		super();
		this.city = city;
		this.district = district;
		this.realEstateType = realEstateType;
		this.roomCount = roomCount;
		this.m2 = m2;
		this.floorNumber = floorNumber;
		this.favorite = favorite;
	}
	public RealEstate() {
		
	}

	
	
	public List<RealEstate> getRealEstateList() {
		return realEstateList;
	}
	public void setRealEstateList(List<RealEstate> realEstateList) {
		this.realEstateList = realEstateList;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getRealEstateType() {
		return realEstateType;
	}
	public void setRealEstateType(String realEstateType) {
		this.realEstateType = realEstateType;
	}
	public String getRoomCount() {
		return roomCount;
	}
	public void setRoomCount(String roomCount) {
		this.roomCount = roomCount;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Ads getAds() {
		return ads;
	}
	public void setAds(Ads ads) {
		this.ads = ads;
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
	

}
