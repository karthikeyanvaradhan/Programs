package jenkinsGithubIntegrate;

import java.util.Scanner;

public class ReverseString {
	char [] val = new char[4];
	public void stringRev() {
		
		String s;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		s=sc.nextLine();                    //reading string from user  
		System.out.print("After reverse string is: ");  
		for(int i=s.length();i>0;--i)                //i is the length of the string  
		{  
			
			try {
				val[i-1]=s.charAt(i-1);	
				System.out.print(val[i-1]);
			}catch(Exception e) {
				System.out.println(e);
			}
			
		//System.out.print(s.charAt(i-1));            //printing the character at index i-1  
			

		}  
	}

	public static void main(String[] args) {

		ReverseString strev = new ReverseString();
		strev.stringRev();
		
	}

}
