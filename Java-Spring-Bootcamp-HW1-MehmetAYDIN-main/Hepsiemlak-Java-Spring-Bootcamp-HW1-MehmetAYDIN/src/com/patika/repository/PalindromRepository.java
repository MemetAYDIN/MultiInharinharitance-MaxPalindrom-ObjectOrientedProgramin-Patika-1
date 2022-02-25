package com.patika.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class PalindromRepository {

	
	List<Long> countList = new ArrayList<>();
	List<Long> PalindromList = new ArrayList<>();
	Long[][] palList;
	
	//Palindrom sayýlarý bulan fonksiyon
	public Long FindPalindromic(long palindrom, long count1) {
       
		Long firstVal = palindrom;
		long length = String.valueOf(palindrom).length();
		long kalan,value=0;
		Long count=count1;

		//Palindrom sayýnýn bulunmasý için yapýlan döngü
        for (long i = 0; i<length; i++){
            kalan = palindrom % 10;
            value = value * 10 + kalan;
            palindrom = palindrom /10;
        }
        //Döngü sonucunda çýkan deðerin palindroom olup olmadýðýný test eden if-else yapýsý 
        if(value == firstVal){
            
        	//System.out.println(value + " Is Palindrom");
            
        	countList.add(count);//chain sayisi listeye ekleniyor
            
        }else{//Eðer palindrom deðilse FindPalindromic çýkan sonucu tekrar palindrom yapma iþlemi
        	
        	//System.out.println("Is not Palidrom -------------->  "+value);
        	
        	PalindromList.add(value);
        	count++;//en çok chain li palindrom sayý bulmak için kullanýlan deðer
        	//Palindrom deðilse count deðerini ve yeni palindrom deðerini tekrarlar
        	FindPalindromic((firstVal+reverse(firstVal)),count);
        }
        
        return  count;
	}
	
	//------------------------------------------------
	//Palindrom sayýlarý bulan fonksiyon
	public Long FindPalindromicMaxChain(long palindrom, long count1) {
       
		Long firstVal = palindrom;
		long length = String.valueOf(palindrom).length();
		long kalan,value=0;
		Long count=count1;

		//Palindrom sayýnýn bulunmasý için yapýlan döngü
        for (long i = 0; i<length; i++){
            kalan = palindrom % 10;
            value = value * 10 + kalan;
            palindrom = palindrom /10;
        }
        //Döngü sonucunda çýkan deðerin palindroom olup olmadýðýný test eden if-else yapýsý 
        if(value == firstVal){
            System.out.println(value + " Is Palindrom");
            countList.add(count);//chain sayisi listeye ekleniyor
            
        }else{//Eðer palindrom deðilse FindPalindromic çýkan sonucu tekrar palindrom yapma iþlemi
        	System.out.println("Is not Palidrom -------------->  "+value);
        	PalindromList.add(value);
        	count++;//en çok chain li palindrom sayý bulmak için kullanýlan deðer
        	//Palindrom deðilse count deðerini ve yeni palindrom deðerini tekrarlar
        	FindPalindromicMaxChain((firstVal+reverse(firstVal)),count);
        }
        
        return  count;
	}
	
	
	//------------------------------------------------
	
	
	
	
	//Palindrom sayýnýn bulunmasý için sayýyý ters çeviren fonsiyon
	public Long reverse(long palindrom) {
		long n, reverse = 0;
        n = palindrom;
        while(n> 0)
        {
          reverse = reverse*10 + n%10;
          n = n/10;
        }
        return reverse;
	}
	
	
	//Palindrom olup olmadýðýný test den fonsiyon
	public void isPalindrom() {
		
		long sum= 0;
		long count= 0;
		long dummy=0;
	
		Collections.sort(countList);
		
		//10-100 arasý palindrom sayýlar isteneniyor
		for(long i=10;i<=100;i++){
//			System.out.println( "------------------------------------> "
//		+i+" <------------------------------------");
			sum=reverse(i)+i;
			FindPalindromic(sum,count);
		}
		
		//Maximum halkalý zincir bulunuyor
		dummy=countList.get(0);
		int i;
		for(i=0;i<countList.size();i++) {
			
			if(countList.get(i)>dummy) {
				dummy=countList.get(i);
				
			}	
		}
		//en uzun zincirli palindrom
		System.out.println("Maximum Palindrom number----->"+(countList.indexOf(dummy)+10)+"   Maximum chain count----->"+dummy); 
		FindPalindromicMaxChain((countList.indexOf(dummy)+10),dummy);
	}
	
	
		 
}
