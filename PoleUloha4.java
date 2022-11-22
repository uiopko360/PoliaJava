import java.util.Scanner;

public class PoleUloha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Pocet prvkov");
		int pocet = sc.nextInt();
		int [] pole = new int[pocet];
		System.out.println("Daj cisla");
		for(int i = 0; i < pocet; i++) {
			pole[i] = sc.nextInt();
		}
		int max = pole[0];
		int pozMax = 0; // pozicia maxima
		for(int i = 0; i < pocet; i++) {
			if(pole[i] > max) {
				max = pole[i];
				pozMax = i;
			}
		}
		System.out.println("Maximum je: " + max);
		System.out.println("Vsetky pozicie maxima: ");
		for(int i = 0; i < pocet; i++) { // vypisat maxima
			if(pole[i] == max) {
				System.out.print(i + " ");
			}
		}
	}

}
