package com.patika.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class PalindromRepository {

	
	List<Long> countList = new ArrayList<>();
	List<Long> PalindromList = new ArrayList<>();
	Long[][] palList;
	
	//Palindrom say�lar� bulan fonksiyon
	public Long FindPalindromic(long palindrom, long count1) {
       
		Long firstVal = palindrom;
		long length = String.valueOf(palindrom).length();
		long kalan,value=0;
		Long count=count1;

		//Palindrom say�n�n bulunmas� i�in yap�lan d�ng�
        for (long i = 0; i<length; i++){
            kalan = palindrom % 10;
            value = value * 10 + kalan;
            palindrom = palindrom /10;
        }
        //D�ng� sonucunda ��kan de�erin palindroom olup olmad���n� test eden if-else yap�s� 
        if(value == firstVal){
            
        	//System.out.println(value + " Is Palindrom");
            
        	countList.add(count);//chain sayisi listeye ekleniyor
            
        }else{//E�er palindrom de�ilse FindPalindromic ��kan sonucu tekrar palindrom yapma i�lemi
        	
        	//System.out.println("Is not Palidrom -------------->  "+value);
        	
        	PalindromList.add(value);
        	count++;//en �ok chain li palindrom say� bulmak i�in kullan�lan de�er
        	//Palindrom de�ilse count de�erini ve yeni palindrom de�erini tekrarlar
        	FindPalindromic((firstVal+reverse(firstVal)),count);
        }
        
        return  count;
	}
	
	//------------------------------------------------
	//Palindrom say�lar� bulan fonksiyon
	public Long FindPalindromicMaxChain(long palindrom, long count1) {
       
		Long firstVal = palindrom;
		long length = String.valueOf(palindrom).length();
		long kalan,value=0;
		Long count=count1;

		//Palindrom say�n�n bulunmas� i�in yap�lan d�ng�
        for (long i = 0; i<length; i++){
            kalan = palindrom % 10;
            value = value * 10 + kalan;
            palindrom = palindrom /10;
        }
        //D�ng� sonucunda ��kan de�erin palindroom olup olmad���n� test eden if-else yap�s� 
        if(value == firstVal){
            System.out.println(value + " Is Palindrom");
            countList.add(count);//chain sayisi listeye ekleniyor
            
        }else{//E�er palindrom de�ilse FindPalindromic ��kan sonucu tekrar palindrom yapma i�lemi
        	System.out.println("Is not Palidrom -------------->  "+value);
        	PalindromList.add(value);
        	count++;//en �ok chain li palindrom say� bulmak i�in kullan�lan de�er
        	//Palindrom de�ilse count de�erini ve yeni palindrom de�erini tekrarlar
        	FindPalindromicMaxChain((firstVal+reverse(firstVal)),count);
        }
        
        return  count;
	}
	
	
	//------------------------------------------------
	
	
	
	
	//Palindrom say�n�n bulunmas� i�in say�y� ters �eviren fonsiyon
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
	
	
	//Palindrom olup olmad���n� test den fonsiyon
	public void isPalindrom() {
		
		long sum= 0;
		long count= 0;
		long dummy=0;
	
		Collections.sort(countList);
		
		//10-100 aras� palindrom say�lar isteneniyor
		for(long i=10;i<=100;i++){
//			System.out.println( "------------------------------------> "
//		+i+" <------------------------------------");
			sum=reverse(i)+i;
			FindPalindromic(sum,count);
		}
		
		//Maximum halkal� zincir bulunuyor
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
