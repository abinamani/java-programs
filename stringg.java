package abi;
import java.util.*;
public class stringg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i=0;
		String a=scan.next();
		scan.close();
		//finding length of the string without using length();
		try {
			for(i=0;0<=i;i++) {
				a.charAt(i);
			}
		}
		catch(Exception e) {
			System.out.println("length is "+i);
		}
		char len[]=new char[i];
		//converting string to char array without using tochararray();
		for(int b=0;b<i;b++) {
			len[b]=a.charAt(b);
		}
		//printing duliplicate string;
		for(int c=0;c<i;c++) {
			for(int j=c+1;j<i;j++) {
				if(len[c]==len[j]) {
					System.out.println(len[j]);
				}
			}
		}
	}
}
