import java.util.Scanner;

public class Soal03 {
	public static void main(final String[] args) {
		try(Scanner userInput = new Scanner(System.in)){
			System.err.println("masukkan jam, menit, dan menit yang ditambahkan : ");
			
			String[] jamMenitMenitDitambah = userInput.nextLine().split(" ");

			int jam = Integer.parseInt(jamMenitMenitDitambah[0]);
			int menit = Integer.parseInt(jamMenitMenitDitambah[1]);
			int tambahanMenit = Integer.parseInt(jamMenitMenitDitambah[2]);

			String formatJam = jam + ":" + menit;

			// if((menit + tambahanMenit) > 60){
			// 	if(jam < 10){
			// 		System.err.println("0" + (jam + 1) + ":" + (tambahanMenit - menit) + "\n(karena " + formatJam+" ditambah " + menit + " menit = " + "0" + (jam + 1) + ":" + (tambahanMenit - menit) + ")");
			// 	} else {
			// 		System.err.println((jam + 1) + ":" + (tambahanMenit - menit) + "\n(karena " + formatJam+" ditambah " + menit + " menit = " + (jam + 1) + ":" + (tambahanMenit - menit) + ")");
			// 	}
			// } else {
			// 	if(jam < 10){
			// 		System.err.println("0" + jam + ":" + (menit + tambahanMenit) + "\n(karena " + formatJam+" ditambah " + menit + " menit = " + "0" + jam + ":" + (menit + tambahanMenit) + ")");
			// 	} else {
			// 		System.err.println(jam + ":" + (menit + tambahanMenit) + "\n(karena " + formatJam+" ditambah " + menit + " menit = " + jam + ":" + (menit + tambahanMenit) + ")");
			// 	}
			// }

			System.err.println(jam + ":" + (menit + tambahanMenit));

			if((menit + tambahanMenit) == 60){
				if(jam < 10){
					System.err.println("0" + jam + 1 + ":" + "00");
				} else {
					System.err.println(jam + 1 + ":" + "00");
				}
			} else if((menit + tambahanMenit) >= 60){
				if(jam < 10){
					System.out.println("0" + (jam + 1) + ":" + (tambahanMenit - menit));
				} else {
					System.out.println(jam + 1 + ":" + (tambahanMenit - menit));
				}
			}
			
		}
	}
}
