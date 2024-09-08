package Arrays;

import java.util.Scanner;

public class ZeroLast {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter size:");
		int n=obj.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
        	arr[i]=obj.nextInt();
        }

        // Move all zeroes to the end of the array
        int count = 0;  // Count of non-zero elements

        // Traverse the array, if the element is not zero, move it to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i]; // Shift non-zero elements to the front
                count++;
            }
        }

        // After all non-zero elements are in their positions, fill remaining with zeroes
        while (count < n) {
            arr[count] = 0;
            count++;
        }

        // Output the modified array
        System.out.print("Array after moving all zeroes to the end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
	}     
}