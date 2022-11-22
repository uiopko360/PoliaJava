import java.util.Random;

public class PoleUlohaa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int [] pole = new int [6]; 
		System.out.println("V hre Tipos Bingo boli vyzrebovane tieto cisla: ");
		for(int i = 0; i < pole.length; i++) { // naplnenie poli
			pole[i] = rnd.nextInt(49) + 1;
			if(i > 0) {
				for(int j = 0; j < i; j++) { // kontrolujeme vsetky pozicie j pred poziciou i 
					if(pole[j] == pole[i]) { // ak sa rovnaju generujeme znovu
						pole[i] = rnd.nextInt(49) + 1;
					}
				}
			}
			System.out.print("{"+ pole[i] + "} ");
		}
		
	}
}
