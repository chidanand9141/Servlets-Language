package javaprograms;

public class StringBuilderClass {
public static void main(String[] args) {
	StringBuilder str=new StringBuilder();
	str.append("GFG");
	System.out.println("String = " + str.toString());
	StringBuilder str1=new StringBuilder("AAABBBCCC");
	System.out.println("String1 = " + str1.toString());
	StringBuilder str2=new StringBuilder(10);
	System.out.println("String2 capacity = " + str2.capacity());
	StringBuilder str3=new StringBuilder(str1.toString());
	System.out.println("String3 = " + str3.toString());
}
}
