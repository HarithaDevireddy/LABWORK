
public class Sqaures {
	public static void main(String s[]) 
	{ 
	    int n = 10; 
	    System.out.println(calculateDifference(n));      
	      
	}
	static int calculateDifference(int n){ 
		  
		int s1, s2, diff; 
		     
		    s1 = (n * (n + 1) * (2 * n + 1)) / 6; 
		      
		    
		    s2 = (n * (n + 1)) / 2; 
		  
		     
		    s2= s2* s2; 
		      
		   // Differences between l and k 
		    diff= (s2-s1); 
		      
		    return diff; 
		  
		} 
}
