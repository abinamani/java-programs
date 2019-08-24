import java.util.*;
//palindrome program
public class palindrome {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char arr[]=str.toCharArray();
		int len=arr.length;
		System.out.println(len);
		int check=len-1,flag=0;
		int itr=(len-1)/2;
		for(int i=0;i<itr;i++) {
			if(arr[i]==arr[check]) {
				check=check-1;
				flag=1;
			}
			else {
				flag=0;
				break;
			}
		}
		if(flag==1) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	
}
}
