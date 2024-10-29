import java.util.Scanner;

public class Soal01 {
	public static void main(final String[] args) {
		try(Scanner userInput = new Scanner(System.in)){
			System.out.println("masukkan nomor identifikasi1 : ");
			int nomorIdentifikasi1 = userInput.nextInt();

			int ratusan1 = nomorIdentifikasi1 / 100;
			int puluhan1 = (nomorIdentifikasi1 / 10) % 10;
			int satuan1 = (nomorIdentifikasi1 / 1) % 10;
			
			System.out.println("masukkan nomor identifikasi2 : ");
			int nomorIdentifikasi2 = userInput.nextInt();

			int ratusan2 = nomorIdentifikasi2 / 100;
			int puluhan2 = (nomorIdentifikasi2 / 10) % 10;
			int satuan2 = (nomorIdentifikasi2 / 1) % 10;

			System.out.println("masukkan nomor identifikasi3 : ");
			int nomorIdentifikasi3 = userInput.nextInt();

			int ratusan3 = nomorIdentifikasi3 / 100;
			int puluhan3 = (nomorIdentifikasi3 / 10) % 10;
			int satuan3 = (nomorIdentifikasi3 / 1) % 10;

			System.out.println("masukkan nomor identifikasi4 : ");
			int nomorIdentifikasi4 = userInput.nextInt();

			int ratusan4 = nomorIdentifikasi4 / 100;
			int puluhan4 = (nomorIdentifikasi4 / 10) % 10;
			int satuan4 = (nomorIdentifikasi4 / 1) % 10;

			System.out.println("masukkan nomor identifikasi5 : ");
			int nomorIdentifikasi5 = userInput.nextInt();

			int ratusan5 = nomorIdentifikasi5 / 100;
			int puluhan5 = (nomorIdentifikasi5 / 10) % 10;
			int satuan5 = (nomorIdentifikasi5 / 1) % 10;

			if(ratusan1 > puluhan1 || puluhan1 > satuan1 || ratusan1 == puluhan1 || puluhan1 == satuan1 || ratusan1 == satuan1 || satuan1 % 2 == 0){
				System.out.println(nomorIdentifikasi1 + " tidak valid");
			} else {
				System.out.println(nomorIdentifikasi1 + " valid");
			}

			if(ratusan2 > puluhan2 || puluhan2 > satuan2 || ratusan2 == puluhan2 || puluhan2 == satuan2 || ratusan2 == satuan2 || satuan2 % 2 == 0){
				System.out.println(nomorIdentifikasi2 + " tidak valid");
			} else {
				System.out.println(nomorIdentifikasi2 + " valid");
			}

			if(ratusan3 > puluhan3 || puluhan3 > satuan3 || ratusan3 == puluhan3 || puluhan3 == satuan3 || ratusan3 == satuan3 || satuan3 % 2 == 0){
				System.out.println(nomorIdentifikasi3 + " tidak valid");
			} else {
				System.out.println(nomorIdentifikasi3 + " valid");
			}

			if(ratusan4 > puluhan4 || puluhan4 > satuan4 || ratusan4 == puluhan4 || puluhan4 == satuan4 || ratusan4 == satuan4 || satuan4 % 2 == 0){
				System.out.println(nomorIdentifikasi4 + " tidak valid");
			} else {
				System.out.println(nomorIdentifikasi4 + " valid");
			}

			if(ratusan5 > puluhan5 || puluhan5 > satuan5 || ratusan5 == puluhan5 || puluhan5 == satuan5 || ratusan5 == satuan5 || satuan5 % 2 == 0){
				System.out.println(nomorIdentifikasi5 + " tidak valid");
			} else {
				System.out.println(nomorIdentifikasi5 + " valid");
			}
		}
	}
}
