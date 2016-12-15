import java.io.*;
import java.util.*;
public class Solution {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int lastans =0;
    int N = sc.nextInt();
    int Q = sc.nextInt();
    int choice, x, y, i;

    ArrayList<Integer>[] list = new ArrayList[N];

    while( Q-->0){
        choice = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        i = (x^lastans)%N;

        switch (choice) {

            case 1:
                if (list[i] == null) {
                    ArrayList<Integer> myList = new ArrayList<>();
                    myList.add(y);
                    list[i] = myList;
                } else
                    list[i].add(y);
                break;
            case 2:
                System.out.println(lastans = list[i].get(y % list[i].size()));
                break;
        }
    }
}
}
          
