import java.util.Random;
import java.util.Scanner;

public class PoleUloha6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj cislo: ");
		int cislo = sc.nextInt();
		int p = 0;
		System.out.println("Zadaj dlzku pola");
		int dlz = sc.nextInt();
		int [] pole = new int[dlz];
		System.out.println("Zadajte cisla postupnosti");
		for(int i = 0; i < pole.length; i++) {
			pole[i] = sc.nextInt();
			if(pole[i] == cislo) p++;
		}
		for(int i = 0; i < pole.length; i++) {
			System.out.print(pole[i] + " ");
		}
		System.out.println( );
		if(p>=1) System.out.println("Cislo " + cislo + " je v postupnosti." + " Jeho pocet je: " + p + " a na poziciach: ");
		else System.out.println("Cislo " + cislo + " nie je v postupnosti.");
		for(int i = 0; i < pole.length; i++) {
			if(pole[i] == cislo) {
				System.out.print(i + " ");
			}
		}
	}

}
