//finding a string contains only digit using inbuilt functions isdigit
public class Main {
  public static boolean containsOnlyNumbers(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (!Character.isDigit(str.charAt(i)))
        return false;
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println(containsOnlyNumbers("123456"));
    System.out.println(containsOnlyNumbers("123abc456"));
  }
}
