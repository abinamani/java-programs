import java.util.*;
public class duplicate {
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
	int count;
	//finding duplicate char and set it to '0' to avoid printing visited char;
	for(int c=0;c<i;c++) {
		count=1;
		for(int j=c+1;j<i;j++) {
			if(ch[c]==ch[j] && ch[c]!=' ') {
				count++;
				ch[j]='0';
			}
		}
		if((count>1) && (ch[c]!='0')) {
			System.out.println(ch[c]);
		}
	}
}
}
