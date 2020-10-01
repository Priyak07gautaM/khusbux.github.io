import java.util.*;
import java.io.*;
import java.lang.String;

public class dp{
	public static void main(String[] args) {
		int tempmax=0,tempmin=0,max=-9, min=9,n, bitpair;
		int[] arr, bitArr;
		String bitStr;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		bitArr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++) {
			int temp = arr[i];
			while(temp>0) {
				tempmax=temp%10;
				tempmin=temp%10;
				temp = temp/10;
				if(tempmin<min) {
					min = tempmin;
				}
				if (tempmax>max) {
					max=tempmax;
				}
				System.out.println(min+" "+ max);
				bitpair = min*7 + max*11;
				bitStr = Integer.toString(bitpair);
				if (bitStr.length()>=3) {
					bitStr = bitStr.substring(1);
					bitpair = Integer.valueOf(bitStr);
				}
				bitArr[i] = bitpair;
			}
			
		}
		for (int i = 0; i<n; i++) {
			System.out.println(arr[i] +" "+ bitArr[1]);
		}
	}
}