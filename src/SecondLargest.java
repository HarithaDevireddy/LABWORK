import java.util.Scanner;
public class SecondLargest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements in array");
		int no=sc.nextInt();
		int arr[]=new int[no];
		for(int i=0;i<no;i++) {
			System.out.println("Enter "+(i+1)+" element in array");
			arr[i]=sc.nextInt();
			//SecondLargest secondmax= new SecondLargest();
		
			}
		System.out.print("Second smallest number in array is " +getSecondSmallest(arr));
		
		
		
		
	}

	private static int getSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					
					arr[j]=temp;
					
				}
			}
		}
		
		return arr[1];
	}

}
