package com.cubenumber;
import java.util.*;

public class cubenumber {

	public static void main(String[] args) {
		int num;
		int result;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number of terms:");
		num=sc.nextInt();
		scan.close();
		for(int i=1;i<=num;i++) {
		result=i*i*i;
	   System.out.println("number is"+i+" cube of"+i+"is:"+result);
	}

}
}
