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
					if(jamKerja > 160 && jamKerja <= 175){
						System.out.println(jamKerja * (30000 + (5 * 30000 / 100)) + 600000);
					} else if(jamKerja > 175) {
						System.out.println(jamKerja * (30000 + (7 * 30000 / 100)) + 600000);
					} else {
						System.out.println((jamKerja * 30000) + 600000);
					}
					break;
				case "PRG":
					if(jamKerja > 160 && jamKerja <= 175){
						System.out.println(jamKerja * (30000 + (5 * 30000 / 100)) + 1200000);
					} else if(jamKerja > 175) {
						System.out.println(jamKerja * (30000 + (7 * 30000 / 100)) + 1200000);
					} else {
						System.out.println((jamKerja * 30000) + 1200000);
					}
					break;
				case "WRT":
					if(jamKerja > 160 && jamKerja <= 175){
						System.out.println(jamKerja * (30000 + (5 * 30000 / 100)) + 400000);
					} else if(jamKerja > 175) {
						System.out.println(jamKerja * (30000 + (7 * 30000 / 100)) + 400000);
					} else {
						System.out.println((jamKerja * 30000) + 400000);
					}
					break;
				case "MKT":
					if(jamKerja > 160 && jamKerja <= 175){
						System.out.println(jamKerja * (30000 + (5 * 30000 / 100)) + 500000);
					} else if(jamKerja > 175) {
						System.out.println(jamKerja * (30000 + (7 * 30000 / 100)) + 500000);
					} else {
						System.out.println((jamKerja * 30000) + 500000);
					}
					break;
				default:
					break;
			}
		}
	}
}
