package intro;

public class MiniProje3 {

	public static void main(String[] args) {
		// Bir sayının mükemmel sayı olup olmadığını bulma.
		int number = 13;
		int toplam = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				toplam = toplam + i;
			}
		}
		if (toplam == number) {
			System.out.println("Bu sayı mükemmel sayıdır.");
		} else {
			System.out.println("Bu sayı mükemmel sayı değildir.");
		}
	}

}
