import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //taking input from stdin
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] cir_arr = new int[n];
        //getting the array elements and rotating them
        for(int i=0; i<n;i++) {
            cir_arr[(i+n-d)%n] = scan.nextInt();
        }
        //printing out the array elements
        for(int i=0; i<n;i++) {
            System.out.print(cir_arr[i] + " ");
        }      
    }
}
