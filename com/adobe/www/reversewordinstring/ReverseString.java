package com.adobe.www.reversewordinstring;

public class ReverseString {

	public static String reverseString(String str){
		char[] s = str.toCharArray();
		int begin = 0;
		int end = str.length() -1 ;
		while(begin < end){
			swap(s[begin], s[end]);
			begin++;
			end--;
		}
		return new String(s);
	}

	 public static String reverse6(String s) {
		  
		  char[] str = s.toCharArray();
		  
		  int begin = 0;
		  int end = s.length() - 1;
		  
		  while (begin < end) {
		   str[begin] = (char) (str[begin] ^ str[end]);
		   str[end] = (char) (str[begin] ^ str[end]);
		   str[begin] = (char) (str[end] ^ str[begin]);
		   begin++;
		   end--;
		  }
		  
		  return new String(str);
	 }
	
	public static void swap(char a, char b){
		a ^= b;
		b ^= a;
		System.out.println(b);
		a ^= b;
		System.out.println(a);
	}

	public static void swap2(char a, char b){
		a = (char) (a - b);
		b = (char) (b + a);
		a = (char) (b - a);
	}	

	public static void main(String args[]){
		String str = "String";
		String retValue = reverse6(str);
		System.out.println(retValue);
		//System.out.println("a1 = "+a1+" ---- "+"a2 = "+a2);
	}

}
