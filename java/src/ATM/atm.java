package ATM;


import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bakiye=1000 , input, miktar ;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bankam�za ho�geldiniz ");
		System.out.println("G�ncel bakiyeniz : " + bakiye);
		
		while(bakiye > 0) {
			System.out.println();
			System.out.println(" 1-) Para yat�rma ");
			System.out.println(" 2-) Para �ekme ");
			System.out.println(" 3-) Bakiye sorgulama ");
			System.out.println(" 4-) ��k�� yap ");
			System.out.println("Yapmak istedi�iniz se�ene�i se�iniz ");
			input=scan.nextInt();
		if(input == 1) {
			System.out.println("Yat�rmak istedi�iniz miktar� giriniz :");
			miktar=scan.nextInt();
			bakiye+=miktar;
		}else if(input == 2) {
			System.out.println("�ekmek istedi�iniz miktar� giriniz :");
			miktar=scan.nextInt();
		 	if(miktar > bakiye) {
		 	System.out.println("Yetersiz bakiye");
		 	}else {
		 		bakiye-=miktar;
		 	}
		}else if(input ==3) {
			System.out.println("G�ncel bakiye " + bakiye);
		}else if(input ==4) {
			System.out.println("��k�� yap�l�yor ");
			
		}else {
			System.out.println("Ge�ersiz tu�lama ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
			
		}
	
	}

			
	}


