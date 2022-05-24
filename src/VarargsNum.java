import java.util.ArrayList;
import java.util.Scanner;

public class VarargsNum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		System.out.println("istediginiz kadar  sayisal deger giriniz. bitirmek icin 0'a basiniz");
        int i=0;
        while(true) {
        	arr.add(i,scan.nextInt());
        	if(arr.get(i)==0) {
        		arr.remove(i);
        		break;
        	}
        	i++;
          
        }  System.out.println(arr);
		sumOfNums(arr.toArray(new Integer[0]));// array'i string'e donusturme 
	}

	private static void sumOfNums( Integer...arr ) {
		int i=0;
		for(int a:arr) {
			i+=a;
			
		}
		System.out.println((i-arr[0])*arr[0]);
	}

}
