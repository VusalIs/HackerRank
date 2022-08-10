/*

A palindrome is a word, phrase, number, or other
sequence of characters which reads the same backward 
or forward.

Given a string A, print Yes if it is a palindrome,
print No otherwise.

Constraints

A will consist at most 50 lower case english letters.

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int length = A.length();
        
        for(int i = 0; i < A.length()/2; i++) {
            if(A.charAt(i) != A.charAt(length - i - 1)) {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}
