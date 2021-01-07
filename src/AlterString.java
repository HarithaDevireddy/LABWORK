import java.util.Scanner;
public class AlterString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String output= alterstring(str);
		
		
	}
	public static String alterstring(String str) {
		String input=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				
			}
			else {
				
				
					
			}
			
			
		}
		
		
		
		return str;
		
	}

}
