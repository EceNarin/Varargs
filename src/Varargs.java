
import java.util.ArrayList;
import java.util.Scanner;

public class Varargs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<>();
		int i = 0;
		System.out.println("Birbirine eklenecek harfleri/sözleri giriniz.\nGirişi sonlandırmak için '.' (nokta) giriniz.");
		while(true) {
			str.add(i, scan.nextLine()); // Her girişi bir ArrayList'e ekliyoruz.
			if(str.get(i).equals(".")) { // Nokta girilince bu elemanı silip sonsuz döngüyü sonlandırıyoruz.
				str.remove(i);
				break;
			}
			i++;
		}
		concatChar(str.toArray(new String[0])); // ArrayList'i array'e dönüştürüp metoda yolluyoruz.
	}
	public static void concatChar(String... str) {
		String word = "";
		for(String s : str) {
			word += s;
		}
		System.out.println(word);
	}
}

