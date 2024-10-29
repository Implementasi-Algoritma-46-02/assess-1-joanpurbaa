import java.util.Scanner;

public class Soal04 {
	public static void main(final String[] args) {
		try(Scanner userInput = new Scanner(System.in)){
			System.out.println("masukkan honor :");

			String[] pekerjaanDanJamKerja = userInput.nextLine().split(" ");

			String pekerjaan = pekerjaanDanJamKerja[0];
			double jamKerja = Double.parseDouble(pekerjaanDanJamKerja[1]);

			switch (pekerjaan) {
				case "DES":
					System.out.println((jamKerja * 30000) + 600000);
					break;
				case "PRG":
					if(jamKerja > 160){
						System.out.println((jamKerja * (5 * 30000 / 100)) + 1200000);
					}
					break;
				default:
					break;
			}
		}
	}
}
