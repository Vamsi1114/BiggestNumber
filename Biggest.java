import java.util.Scanner;  
public class Biggest {    
		public static void main(String args[]) {
			int sum=0,big;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the digit how many elements do you want:/");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the digits:/");
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=0; i<n; i++) {
				sum=sum+arr[i];
				System.out.println(arr[i]);
			}
			System.out.println("The sum of the digits = "+sum);
			big=arr[0];
			for(int i=0; i<arr.length; i++) {
					if(arr[i]>big) {
						big=arr[i];
					}
			}
			System.out.println("The Biggest number in the array = "+big);	
		}
	}
	    


