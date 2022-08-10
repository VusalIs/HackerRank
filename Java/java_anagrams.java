/*

Two strings, a and b, are called anagrams if 
they contain all the same characters in the 
same frequencies. For this challenge, the test 
is not case-sensitive. For example, the anagrams 
of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string

Returns

boolean: If a and b are case-insensitive anagrams, 
return true. Otherwise, return false.

Input Format

The first line contains a string a.
The second line contains a string b.

Constraints
1 <= length(a), length(b) <= 50
Strings a and b consist of English alphabetic characters.
The comparison should NOT be case sensitive.

*/

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        for(int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            int index = b.indexOf(ch);
            
            if(index < 0) return false;
            else b = b.substring(0, index) + b.substring(index + 1);
        }
        
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
