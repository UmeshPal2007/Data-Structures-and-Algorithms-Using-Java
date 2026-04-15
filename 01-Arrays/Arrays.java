//Take an array as input from the user. Search for a given number x and print the index at which it occurs.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
    System.out.print("Enter Size of an Array : ");
    
    //Taking size of array from the user
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
    
    //Taking elements of array from the user
    System.out.println("Enter "+ n +" Elements of this array : ");
    for(int i = 0; i<n ; i++) {
      array[i] = sc.nextInt();
    }
    
    //Element to find in this array
    System.out.print("Enter the value to find in this array : ");
    int x = sc.nextInt();
    
    //Manual tracking using a boolean variable
    boolean found = false;
    
    //Element Search
    for (int i=0; i<array.length; i++) {
      if( array[i] == x) {
        System.out.println("Element is found at index "+ i);
        found = true; // Manual update: we found it!
      }
    }
    
    // Final check if element does not found then :
    if (found == false) {
      System.out.println(x + " Does not Found in This array.");
    }
  }
}
