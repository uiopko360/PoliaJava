
import java.util.Random;

public class PoleUloha5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int pocet = rnd.nextInt(10) + 5; // 5-14
		int [] pole = new int[pocet];
		
		for(int i = 0; i < pocet; i++) { // vypiseme povodne pole
			pole[i] = rnd.nextInt(100) + 1; // 1-100
			System.out.print(pole[i] + " ");
		}
		System.out.println();
		System.out.println(); 
		for (int a = 0; a < pocet; a++) {
	        for (int b = a + 1; b < pocet; b++) {
	            int docasna = 0;
	            if (pole[a] > pole[b]) {
	                docasna = pole[a];
	                pole[a] = pole[b];
	                pole[b] = docasna;
	            }
	        }
		}
		for(int i = 0; i < pocet; i++) { // vypiseme utriedene pole
			System.out.print(pole[i] + " ");
		}
	}
}
