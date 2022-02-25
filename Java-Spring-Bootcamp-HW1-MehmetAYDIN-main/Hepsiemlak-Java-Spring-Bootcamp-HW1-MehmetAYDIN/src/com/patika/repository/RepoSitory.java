package com.patika.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;


import com.patika.ads.Ads;
import com.patika.message.Message;
import com.patika.realestate.RealEstate;
import com.patika.users.Users;

public class RepoSitory {
	
	
	
	@SuppressWarnings("unused")
	private static List<Message> prepareMessageBox(String str) {
		List<Message> messageBox = new ArrayList<>();
		
		messageBox.add(new Message(str));
		/*
		mesajKutusu.add(new Message("baslik1"));
		mesajKutusu.add(new Message("deneme"));
		mesajKutusu.add(new Message("selam"));
		*/
		
		return messageBox;
	}

	@SuppressWarnings("unused")
	private static Ads prepareAds(String tittle, Users user) {
		Ads ads = new Ads();
		ads.setTitle(tittle);
		ads.setRealEstate(makeRealEstate());
		
		
		/*
		//kullanici.mesajKutusu.add(new Mesaj("acil dönüþ")); // NPE

		ads.setUser(user);

		ads.setActive(true);

		ads.setPhotoList(makeResimList());
		
		for (Message message :user.messageBox) {
			System.out.println(message.title);
		}
		*/
		return ads;
	}

	public String[] makeResimList() {
		
		String[] resimList = new String[5];
		resimList[0] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
		resimList[1] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
		return resimList;
		
	}

	private static RealEstate makeRealEstate() {
		return new RealEstate();
	}
	
	
	//Filtreleme fonksiyonu
	
	public void findAds(RealEstate realEstate,Ads ads,String city, String district, BigDecimal min, BigDecimal max, String roomType) {
		
		
		realEstate.setPostedAds(new ArrayList<>());
		ads.setRealEstate(realEstate);
		realEstate.getPostedAds().add(ads);
		
		ads.setPostedRE(new HashSet<>());
		realEstate.setAds(ads);
		ads.getPostedRE().add(realEstate);
		
		
		for(Ads ads1:realEstate.getPostedAds()) {
			for(RealEstate rE:ads.getPostedRE()) {
				//Arama kriterleri aþaðýdaki if() else yapsýnda yapýldý
				//Filtre parametreleri; Þehir, Min-Max aralýk, Oda sayýsý
				if(rE.getCity()==city&&ads.getPrise().compareTo(min)==1
						&&ads.getPrise().compareTo(max)==-1
						&&realEstate.getRoomCount()==roomType
						&&realEstate.isFavorite()) {
					System.out.println(
							"Ýlan basligi        :\t"+ads1.getTitle()+"\n"
							+"ilanda kalma suresi :\t"+ads1.getRealEstateTime()+" gun\n"
							+"Fiyati              :\t"+ads1.getPrise()+"TL\n"
							+"Olusutulma tarihi   :\t"+ads1.getCreateDate()+" \n"
							+"Sehir               :\t"+rE.getCity()+"\n"
							+"ilce                :\t"+rE.getDistrict()+" \n"
							+"Kat numarasi        :\t"+rE.getFloorNumber()+"\n"
							+"Metrer Kare         :\t"+rE.getM2()+" m2\n"
							+"Oda sayisi          :\t"+rE.getRoomCount());
				}else {
					System.out.println("Kosullara uygun ilan bulunamadi");
				}
			}
		}
		
		
	}
	
	
	
	
	//Favori ilanlarý listeleme
	public void favoriteAds(Users user, RealEstate realEstate,Ads ads) {//Yeni kullanýcý ekleme

		if(realEstate.isFavorite()==true)
		{
			user.setFavoriteAds(new HashSet<>());
			user.setFavoriteRE(new HashSet<>());
			
			ads.setUser(user);
			user.getFavoriteAds().add(ads);
			realEstate.setUser(user);
			user.getFavoriteRE().add(realEstate);
			
			System.out.println(user.getEmail()+" mailene kayýtlý\t"+user.getName()+" kullanýcýya ait fvori ilanlar:\n ");
			
			for(Ads ads1:user.getFavoriteAds()) {
				for(RealEstate rE:user.getFavoriteRE()) {
					System.out.println(
							"Ýlan basligi        :\t"+ads1.getTitle()+"\n"
							+"ilanda kalma suresi :\t"+ads1.getRealEstateTime()+" gun\n"
							+"Fiyati              :\t"+ads1.getPrise()+"TL\n"
							+"Olusutulma tarihi   :\t"+ads1.getCreateDate()+" \n"
							+"Sehir               :\t"+rE.getCity()+"\n"
							+"ilce                :\t"+rE.getDistrict()+" \n"
							+"Kat numarasi        :\t"+rE.getFloorNumber()+"\n"
							+"Metrer Kare         :\t"+rE.getM2()+" m2\n"
							+"Oda sayisi          :\t"+rE.getRoomCount());
				}
			}
			
			
			
		
		}else {//Ýlan favori olarak iþaretlnemiþse aþaðýdaki yanýt döner
			System.out.println("Ýlan kullanýcýnýn Favori ilanlar listesinde deðil!!!!");
		}
		
		
	}
	
	//Kullanýcýlar arasýndaki mesajlaþmalarýn tutulduðu liste
	public void listAllMassege(Users sender, Users client, Message message) {
		
		sender.setMessageBox(new ArrayList<>());
		message.setClient(sender);
		sender.getMessageBox().add(message);
		
		System.out.println(sender.getName()+" tarafýndan "+client.getName()+" gönderildi\n");
		for(Message msSender:sender.getMessageBox()) {
				if(msSender.getReadDate()!=null) {
					System.out.println(
							"Mesaj basligi        :\t"+msSender.getTitle()+"\n"
							+"Mesaj içeriði       :\t"+msSender.getTitle()+" \n"
							+"Mesaj tarihi        :\t"+msSender.getSendDate()+"\n"
							+"Okunma tarihi       :\t"+msSender.getReadDate()+" tarihinde okundu \n"
							);
				}else {
					System.out.println(
							"Mesaj basligi        :\t"+msSender.getTitle()+"\n"
							+"Mesaj içeriði       :\t"+msSender.getTitle()+" \n"
							+"Mesaj tarihi        :\t"+msSender.getSendDate()+"\n"
							+"Okunma tarihi       :\t"+msSender.getReadDate()+" daha okunmadý \n"
							);
				}

		}
		
	}

	/*	
	public void ListUser() {
		

		Users user1 = new Users("Bireysel", "Cem", "cemdrman@gmailc.om");
		user1.messageBox = prepareMesajKutusu();
		

		Users user2 = new Users("Bireysel", "Kadir", "cilgin.kadir@gmail.com");
		user2.messageBox = prepareMesajKutusu();
		

		Users user3 = new Users("Bireysel", "Hatice", "hatice.dev@gmail.com");
		user3.messageBox = prepareMesajKutusu();
		
		
		Users user4 = new Users("Bireysel", "Hatice", "hatice.dev@gmail.com");
		user4.messageBox = prepareMesajKutusu();

		List<Ads> ilanListesi = new ArrayList<>();
		ilanListesi.add(prepareAds("Sahibinden Acil Satýlýk", user1));
		ilanListesi.add(prepareAds("Dosta GÝDERRR ACÝLLL!!!", user2));
		ilanListesi.add(prepareAds("Metroya Koþarak 5 dk", user3));
		ilanListesi.add(prepareAds("Öðrenciye ve Bekar uygun", user4));
		
	}
	*/
	

}
