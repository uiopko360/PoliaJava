import java.util.Scanner;

public class PoleUlohaa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nacitaj dlzku pola (aspon 3): " );
		int dlz = sc.nextInt();
		int [] pole = new int[dlz];
		System.out.println("Daj cislo: " + "("+ dlz +")");
		for(int i = 0; i < pole.length; i++) { // napln pole
			pole[i] = sc.nextInt();
		}
		int p1 = 0; // pocet nekles
		int p2 = 0; // pocet kles
		int p3 = 0; // pocet rast
		int p4 = 0; // pocet nerast
		for(int i = 0; i < pole.length; i++) {
			if(i>0) { // ak je >0 tak zistujeme
				if(pole[i] == pole[i-1]) {
					p1++;
					p3++;
				}
				else if(pole[i] < pole[i-1]) p2++;
				else if(pole[i] > pole[i-1]) p4++;
			}
		}
		if(p2==pole.length - 1) System.out.println("Postupnost je klesajuca"); 
		else if((p1+p2)==pole.length - 1) System.out.println("Postupnost je neklesajuca");
		else if(p4==pole.length - 1) System.out.println("Postupnost je rastuca");
		else if((p3+p4)==pole.length - 1)System.out.println("Postupnost je nerastuca");
		else System.out.println("Nema ziadnu vlastnost");
	}
}
