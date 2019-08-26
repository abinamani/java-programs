import java.util.Scanner;
//deleting the duplicate character in a string
public class abina {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		String str=a.next();
		String str1="";
		char ch[]=str.toCharArray();
		int len=ch.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ch[i]==ch[j]) {
					ch[j]=' ';
				}
			}
		}
		for(int i=0;i<len;i++) {
			if(ch[i]!=' ') {
				str1=str1+ch[i];
			}
		}
		System.out.println("old string "+str);
		System.out.println("new string "+str1);
	}
}
