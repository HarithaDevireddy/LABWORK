
public class PowerofTwo {
	public static void main(String args[]) {
		int no=9;
		boolean output=checkNumber(no);
		System.out.print(output);
	}
	public static boolean checkNumber(int N ) {
		boolean check=true;
		while(N!=1) {
			if(N%2==0) {
				check=true;
				N=N/2;
				System.out.println(N);
				
			}
			else {
				check=false;
				break;
			}
		}
		return check;
		
	}
       
}
