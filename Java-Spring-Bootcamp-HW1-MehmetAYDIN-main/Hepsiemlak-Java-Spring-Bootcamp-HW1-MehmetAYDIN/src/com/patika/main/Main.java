package com.patika.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import com.patika.ads.Ads;
import com.patika.message.Message;
import com.patika.realestate.RealEstate;
import com.patika.repository.PalindromRepository;
import com.patika.repository.RepoSitory;
import com.patika.users.Users;


public class Main {
	public static void main(String[] args) {

		RepoSitory repoSitory=new RepoSitory();
		//repoSitory.ListUser();
		
		
		 BigDecimal Thousand800 = new BigDecimal(1800);
		 BigDecimal twoThousand500 = new BigDecimal(2500);
		 BigDecimal twoThousand850= new BigDecimal(2850);
		 BigDecimal twoThousand900 = new BigDecimal(2900);
		 BigDecimal threeThousand100= new BigDecimal(3100);
		 BigDecimal threeThousand400 = new BigDecimal(3400);
		 BigDecimal fourThousand500 = new BigDecimal(4500);
		 BigDecimal fiveThousand = new BigDecimal(5000);
		 BigDecimal sixThousand = new BigDecimal(6000);
		 BigDecimal nineThousand = new BigDecimal(9000);
		 BigDecimal threeThousand = new BigDecimal(3000);
		 

		//tarih datas�
		Date d1=new Date();
		Date d2=new Date(2022);
		
		
		//ilan datas�
		
		Users user1 = new Users("Bireysel","Ay�e", "ayse.sar�@gmail.com", "2 y�ll�k temiz kullan�lm��", "12312893l", null, null, null);
		Users user2 = new Users("Bireysel","Ali", "ali@gmail.com", "4 y�ll�k l�ks", "1223193l", null, null, null);
		Users user3 = new Users("Kurumsal","Cwnk", "cenk@gmail.com", "S�f�r l�ks", "1223193l", null, null, null);
		Users user4 = new Users("Bireysel","Helin", "helin@gmail.com", "10 y�ll�k bak�ml�", "1623193l", null, null, null);
		
//		Message mesage1=new Message("�nemli", "Ev �ok temiz kuulan�ld� hi� bir sorunu yoktur", d1, d2, false, user1, user2);
//		Message mesage2=new Message("Kiral�k daireniz hk.", "Ev �ok temiz kuulan�ld� hi� bir sorunu yoktur", d1, d2, false, user1, user2);
//		Message mesage3=new Message("Dairenin durumu hk.", "Ev �ok temiz kuulan�ld� hi� bir sorunu yoktur", d1, d2, false, user1, user2);
//		Message mesage4=new Message("Fiyat Hk", "Ev �ok temiz kuulan�ld� hi� bir sorunu yoktur", d1, d2, false, user1, user2);
//	
//		
//		repoSitory.listAllMassege(user1, user4, mesage1);
//		repoSitory.listAllMassege(user1, user4, mesage2);
//		repoSitory.listAllMassege(user3, user4, mesage3);
//		repoSitory.listAllMassege(user4, user2, mesage4);
//		repoSitory.listAllMassege(user2, user3, mesage1);
//		repoSitory.listAllMassege(user3, user1, mesage1);
//		repoSitory.listAllMassege(user1, user4, mesage2);
//		
		
//		Girilen Kullan�c�n�n favori ilanlar�
		
		RealEstate realEstate=new RealEstate("Istanbul", "Kadikoy","Daire", "2+1", 180, 4, true);
		Ads ads=new Ads(realEstate, "ilan 1", user1, repoSitory.makeResimList(), nineThousand, 30, false, false, d2, false);
		
		RealEstate realEstate1=new RealEstate("Ankara", "Kizilay","Daire", "1+1", 180, 4, true);
		Ads ads1=new Ads(realEstate1, "ilan 2", user1, repoSitory.makeResimList(), sixThousand, 15, false, false, d1, false);
		
		RealEstate realEstate2=new RealEstate("�zmir", "Kordon","Daire", "3+1", 180, 4, true);
		Ads ads2=new Ads(realEstate1, "ilan 3", user1, repoSitory.makeResimList(), threeThousand400, 30, false, false, d2, false);
		
		RealEstate realEstate3=new RealEstate("Istanbul", "Besiktas","Daire", "4+1", 180, 4, true);
		Ads ads3=new Ads(realEstate1, "ilan 4", user1, repoSitory.makeResimList(), Thousand800, 30, false, false, d1, false);
			
		RealEstate realEstate4=new RealEstate("Istanbul", "Besiktas","Daire", "4+1", 180, 4, true);
		Ads ads4=new Ads(realEstate1, "ilan 4", user1, repoSitory.makeResimList(), Thousand800, 30, false, false, d1, false);
		
		RealEstate realEstate5=new RealEstate("Izmir", "Goztepe","Daire", "2+1", 180, 4, false);
		Ads ads5=new Ads(realEstate1, "ilan 5", user1, repoSitory.makeResimList(), twoThousand850, 30, false, false, d2, false);
		
		RealEstate realEstate6=new RealEstate("Izmir", "Kars�yaka","Daire", "1+1", 180, 4, true);
		Ads ads6=new Ads(realEstate1, "ilan 6", user1, repoSitory.makeResimList(), twoThousand850, 30, false, false, d2, false);
		
		RealEstate realEstate7=new RealEstate("Istanbul", "Kadikoy","Daire", "2+1", 180, 4, true);
		Ads ads7=new Ads(realEstate7, "ilan 7", user1, repoSitory.makeResimList(), twoThousand900, 30, false, false, d2, false);
		
		
		System.out.println("-------------------->Fvori ilanlar <---------------------------------------");
		
		repoSitory.favoriteAds(user1, realEstate, ads);
		repoSitory.favoriteAds(user1, realEstate1, ads1);
		repoSitory.favoriteAds(user1, realEstate2, ads2);
		repoSitory.favoriteAds(user1, realEstate3, ads3);
		
		
		
		
		//Filtrleme ile arama
		System.out.println("-------------------->Filtrleme ile Arama  <---------------------------------------");
		///findAds(gayr�menkul, ilan, �ehir, il�e, minimum de�er, max de�er(min max aras� fiyat listleme i�in), oda say�s�);
		/*gayr�menkul ve ilan datalar�m
		 * minimum de�er, max de�er(min max aras� fiyat listleme i�in), oda say�s�   --->filtre kriterlerim
		 * 
		 * */
		repoSitory.findAds(realEstate7, ads7, "Istanbul", "Kadikoy", Thousand800, threeThousand, "2+1");
		//gayr�menkulun(realEstate7) il istanbul, favori ilan i�in i�araetlenmi�
		repoSitory.findAds(realEstate3, ads1, "Istanbul", "Besiktas", Thousand800, Thousand800, "2+1");
		repoSitory.findAds(realEstate2, ads6, "Istanbul", "Tuzla", Thousand800, threeThousand, "2+1");
		repoSitory.findAds(realEstate5, ads4, "Istanbul", "Besiktas", Thousand800, threeThousand400, "2+1");
		repoSitory.findAds(realEstate4, ads3, "�zmir", "Kar��yaka", Thousand800, threeThousand400, "2+1");
		repoSitory.findAds(realEstate6, ads2, "Ankara", "�ankaya", Thousand800, threeThousand400, "2+1");
		
		
		
		System.out.println("-------------------->PAL�NDROM <---------------------------------------");
		//Palindrom say�lar� bulan class
		PalindromRepository palRepo=new PalindromRepository();
		palRepo.isPalindrom();
		
		
	}

}
