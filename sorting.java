import java.util.*;
public class datatypes {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	int i=0;
	//fifnding lenth of the string
	try {
		for(i=0;0<=i;i++) {
			str.charAt(i);
		}
	}
	catch(Exception e) {
		System.out.println("length of the string "+i);
	}
	char ch[]=new char[i];
	//converting into char array
	for(int j=0;j<i;j++) {
		ch[j]=str.charAt(j);
	}
	//sorting the char array
	for(int j=0;j<i;j++) {
		for(int k=j+1;k<i;k++) {
			char temp;
			if(ch[j]>ch[k]) {
				temp=ch[j];
				ch[j]=ch[k];
				ch[k]=temp;
			}
		}
	}
	for(char e:ch) {
		System.out.print(e);
	}
	}
}
