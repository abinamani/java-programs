import java.util.*;
public class findingdigits {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char ch[]=str.toCharArray();
		int len=ch.length,flag=0;
		for(int i=0;i<len;i++) {
			if(((ch[i]>='a')&&(ch[i]<='z'))||((ch[i]>=33)&&(ch[i]<=47))){
				flag=0;
				break;
			}
			else if((ch[i]>='0')&&(ch[i]<='9')) {
				flag=1;
			}
		}
		if(flag==1)
			System.out.println("it contains only digit");
		else
			System.out.println("it contains a character");
	}

}
