//printing first non repeating character in a string;
import java.util.Scanner;
public class abina {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		String str=a.next();
		for(int i=0;i<str.length();i++) {
			boolean unique=true;
			for(int j=0;j<str.length();j++) {
				if((i!=j) && (str.charAt(i)==str.charAt(j))) {
					unique=false;
					break;
				}
			}
			if(unique) {
				System.out.println("first non occurence string "+str.charAt(i));
				break;
			}
		}
	}
}
