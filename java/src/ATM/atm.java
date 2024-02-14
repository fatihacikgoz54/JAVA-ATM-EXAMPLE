package ATM;


import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bakiye=1000 , input, miktar ;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bankamýza hoþgeldiniz ");
		System.out.println("Güncel bakiyeniz : " + bakiye);
		
		while(bakiye > 0) {
			System.out.println();
			System.out.println(" 1-) Para yatýrma ");
			System.out.println(" 2-) Para çekme ");
			System.out.println(" 3-) Bakiye sorgulama ");
			System.out.println(" 4-) Çýkýþ yap ");
			System.out.println("Yapmak istediðiniz seçeneði seçiniz ");
			input=scan.nextInt();
		if(input == 1) {
			System.out.println("Yatýrmak istediðiniz miktarý giriniz :");
			miktar=scan.nextInt();
			bakiye+=miktar;
		}else if(input == 2) {
			System.out.println("Çekmek istediðiniz miktarý giriniz :");
			miktar=scan.nextInt();
		 	if(miktar > bakiye) {
		 	System.out.println("Yetersiz bakiye");
		 	}else {
		 		bakiye-=miktar;
		 	}
		}else if(input ==3) {
			System.out.println("Güncel bakiye " + bakiye);
		}else if(input ==4) {
			System.out.println("Çýkýþ yapýlýyor ");
			
		}else {
			System.out.println("Geçersiz tuþlama ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
			
		}
	
	}

			
	}


