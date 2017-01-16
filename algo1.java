import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class algo1 {

 public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int K=scan.nextInt();
    int Q=scan.nextInt();
    int rot=K%N;
    int[] arr=new int[N];

    for(int i=0;i<N;i++)
        arr[i]=scan.nextInt();

   for(int i=0;i<Q;i++)
       {
           int idx=scan.nextInt();
           if(idx-rot>=0)
              System.out.println(arr[idx-rot]);
           else
            System.out.println(arr[idx-rot+arr.length]);
}
}

}

