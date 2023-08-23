package javaprograms;
//why java strings are immutable  concatinating
import java.io.*;
public class Javaprograms2 {
  public static void main(String[] args) {
	String str="Knowledge";
	String s=str;
	str=str.concat(" Base");
	System.out.println(str);
}
}
