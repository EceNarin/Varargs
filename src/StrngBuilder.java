import java.util.Arrays;
import java.util.Scanner;

public class StrngBuilder {

	public static void main(String[] args) {
	     Scanner scan=new Scanner(System.in);
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"
		 */
	     System.out.println("Cumlenin reverse olup olmadıgını test etmek bir cumle giriniz");
	     String str=scan.nextLine();
	     StringBuilder sb1=new StringBuilder(str);
	      if(str.equals(sb1.reverse())) {
	    	  System.out.println(sb1 + " is palindromic sentence");
	      }else {
	    	  System.out.println(sb1 + " is nott palindromic sentence");
	      }
	     System.out.println("cumledeki kelimelerin reverse olup olmadıgını test etmek icin bir cumle daha giriniz");
		     String [] arr= scan.nextLine().split(" ");
	     System.out.println(Arrays.toString(arr));
	     for(String a:arr) {
	    	 StringBuilder sb=new StringBuilder(a);
	    	 if(a.equals(sb.reverse())){
	    		 System.out.println(a + " word is palindromic");
	    	 }else {
	    		 System.out.println(sb);
	    		 System.out.println(a + " word is not palindromic");
	    	 }
	    	
	     }
	}

}
