import java.util.*;
//palindrome program
public class anaggram {
	public static char[] anag(char ch[],int n) {
		char temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		return ch;
	}
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.next();
		String str2=scan.next();
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		int len1=arr1.length;
		int len2=arr2.length;
		int flag=0;
		char a1[]=anag(arr1,len1);
		char a2[]=anag(arr2,len2);
		if(len1!=len2) {
			flag=1;
		}
		else {
			for(int i=0;i<len1;i++) {
				if(a1[i]==a2[i]) {
					flag=0;
				}
				else {
					break;
				}
			}
			
		}
		if(flag==0) {
			System.out.println("given string is a anagram");
		}
		else {
			System.out.println("given string is not a anagram");
		}
}
}
