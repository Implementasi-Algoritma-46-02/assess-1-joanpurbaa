import java.util.Scanner;

public class Soal02 {
	public static void main(final String[] args) {
		try(Scanner userInput = new Scanner(System.in)){
			System.out.println("masukkan masa studi dan IPK :");
			
			String[] studiDanIpk = userInput.nextLine().split(" ");
			
			System.out.println("masukkan EPRT, HKI, dan lomba :");

			String[] eprtHkiLomba = userInput.nextLine().split(" ");

			double studi = Double.parseDouble(studiDanIpk[0]);
			double ipk = Double.parseDouble(studiDanIpk[1]);
			int eprt = Integer.parseInt(eprtHkiLomba[0]);
			String hki = eprtHkiLomba[1];
			String lomba = eprtHkiLomba[2];

			if(studi != 3.0){
				System.out.println("Tidak cumlaude");
			} else if(ipk < 3.5){
				System.out.println("Tidak cumlaude");
			} else if(eprt <= 449){
				System.out.println("Tidak cumlaude");
			} else if(eprt <= 449 && !hki.equals("ada")){
				System.out.println("Tidak cumlaude");
			} else if(!hki.equals("ada") || !lomba.equals("ada")){
				System.out.println("Cumlaude");
			} else {
				System.out.println("Cumlaude");
			}
		}
	}
}
