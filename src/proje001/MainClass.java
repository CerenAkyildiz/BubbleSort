package proje001;

import java.util.Random;

//import java.util.Scanner;

public class MainClass {
   
	static int  comparation=0;
	  static int swap=0;
	       
	       public static void main(String[] args) {
	    	   int[] dizi = new int[500];
	    	   
	    	   int gecici=0;
	    	    
	    	        Random   rnd = new Random();
	    	         for (int i = 0; i < 500; i++) {
	    	             int sayi = rnd.nextInt(100);
	    	             dizi[i]=sayi;
	    	         } 
	    	         BubbleSort(dizi); 
	    	          for (int i = 1; i < 500; i++) {
	    	              System.out.println(dizi[i]);
	    	         }
	    	       
	    	         System.out.println("swap:" + swap  +" Comparation : "+comparation);
	    	         
	       }

	       public static void BubbleSort(int[] dizi) {
	    	   
	           int temp;   // Yer de�i�tirmede kullan�lacak ge�ici de�i�ken
	           for (int i = 1; i < dizi.length; i++) {
	               for (int j = 0; j < dizi.length - i; j++) {
	            	   comparation++;
	                   if (dizi[j] > dizi[j + 1]) {
	                	   swap++;
	                       temp = dizi[j];
	                       dizi[j] = dizi[j + 1];
	                       dizi[j + 1] = temp;
	                   }//�nce gelen elaman bir sonrakinden b�y�kse ikisi yer de�i�tiriyor
	               }// Dizinin ard���k elamanlar�n� kar��la�t�rmak i�in kulland���m�z d�ng�
	           }// Her kar��la�t�rmadan sonra yeniden kald���m�z yerden devam etmemizi sa�layan d�ng�

	       }

	   
       
}
