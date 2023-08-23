package javaprograms;
import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerClass {
public static void main(String[] args) {
	ArrayList<String> a1 = new ArrayList<String>();
			a1.add("Ram");
			a1.add("Shyam");
			a1.add("Alice");
			a1.add("Bod");
      StringJoiner sj1 =new  StringJoiner(",");
      sj1.setEmptyValue("sj1 is empty");
      System.out.println(sj1);
      
      sj1.add(a1.get(0)).add(a1.get(1));
      System.out.println(sj1);
      
      System.out.println("Length of sj1 : " + sj1.length());
      StringJoiner sj2 = new  StringJoiner(":");
      sj2.add(a1.get(2)).add(a1.get(3));
      
      sj1.merge(sj2);
      System.out.println(sj1.toString());
      System.out.println("Length of new sj1 : " + sj1.length());
}
}
