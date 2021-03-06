package week4.removeDouble;
import java.io.*;
import java.util.*;
import acm.program.*;
public class RemoveDouble extends ConsoleProgram {

	public void run() {
		String st=readLine("enter a string: ");
		System.out.println("The entered string is: "+st);
		System.out.println("The modified string is: " +removeDoubledLetters(st));
	}
	 private String removeDoubledLetters(String str) {
		 String s=""; 
		 
		 for(int i=0;i<str.length();i++) {
			 int j=i+1;
			
			 if(j<str.length()) {
				 if((str.charAt(i))==(str.charAt(j))) {
					 s+=(str.substring(i,j));
					 str=s+str.substring(j+1);
				 } else {
					 s+=str.charAt(i);
				 }
			 }
		 } 
		 return(str);
	}
}
