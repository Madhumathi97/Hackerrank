import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.BufferedReader;

public class SparseArrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<String> strings=new ArrayList<String>();
    for(int i=0;i<n;i++)
        strings.add(sc.next());
    int q=sc.nextInt();
    for(int i=0;i<q;i++)
        System.out.println(Collections.frequency(strings,sc.next()));
        
            
    }
}
