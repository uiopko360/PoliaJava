import java.util.Random;
import java.util.Scanner;

public class PoleUloha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int [] pole = new int[100];
		int pocet = 0;
		int p1 = 0; int p2 = 0; int p3 = 0; int p4 = 0; int p5 = 0; int p6 = 0;
		for(int i = 0; i < pole.length; i++) { // hody
			pocet++;
			pole[i] = rnd.nextInt(6) + 1;
			if(pole[i] == 1) p1++;
			else if(pole[i] == 2) p2++;
			else if(pole[i] == 3) p3++;
			else if(pole[i] == 4) p4++;
			else if(pole[i] == 5) p5++;
			else if(pole[i] == 6) p6++;
		}
		System.out.println("1 ...... " + (double) p1/pocet * 100 + " %");
		System.out.println("2 ...... " +(double) p2/pocet * 100 + " %");
		System.out.println("3 ...... " +(double) p3/pocet * 100 + " %");
		System.out.println("4 ...... " +(double) p4/pocet * 100 + " %");
		System.out.println("5 ...... " +(double) p5/pocet * 100 + " %");
		System.out.println("6 ...... " +(double) p6/pocet * 100 + " %");	
	}
}
