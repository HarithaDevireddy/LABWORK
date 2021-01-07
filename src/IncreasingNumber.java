
public class IncreasingNumber {
	 public static void main (String[] args) { 
		  
		    int N = 1344688;  
		    boolean output= checkNumber(N);
		    System.out.println(output);  
		    }  
	 public static boolean checkNumber(int N)  
	 {  
		 int arr[]= new int[100],i=6,len=0;
		 boolean check= false;
	     while(N!=0) {
	    	 arr[i]=N%10;
	    	 len++;
	    	 N=N/10;
	    	 i--;
	    	 
	    	 
	    	 
	    	 
	     }
	     System.out.println(len);
	     System.out.println(i);
	     for(int j=len-1;j>0;j--) {
	    	 
	    	 if (arr[j]>=arr[j-1]) {
	    		 check= true;
	    		 
	    	 }
	    	 else
	    		 check=false;
	    	       break;
	     }
	     return check;
	 }  

}
