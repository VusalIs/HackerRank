/*

You are given Q queries in the form of , a , b and n. For each query,
print the series corresponding to the given a, b and b values as a
single line of n space-separated integers.

Input Format

The first line contains an integer, q, denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated 
integers describing the respective ai, bi, and ni values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each 
series must be printed in order as a single line of n space-separated integers.

*/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double initVal = a + Math.pow(2, 0) * b;
            
            System.out.printf("%.0f ", initVal);
            
            for(int j = 1; j < n; j++){
                initVal += (Math.pow(2, j) * b);
                System.out.printf("%.0f ", initVal);   
            }
            System.out.println();
        }
        in.close();
    }
}
