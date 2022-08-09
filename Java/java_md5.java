/*

MD5 (Message-Digest algorithm 5) is a widely-used 
cryptographic hash function with a 128-bit hash value. 
Here are some common uses for MD5:

To store a one-way hash of a password.
To provide some assurance that a transferred file 
has arrived intact.
MD5 is one in a series of message digest algorithms
designed by Professor Ronald Rivest of MIT (Rivest, 1994); 
however, the security of MD5 has been severely compromised,
most infamously by the Flame malware in 2012. The CMU Software
Engineering Institute essentially considers MD5 to be
"cryptographically broken and unsuitable for further use".

Given an alphanumeric string, s, denoting a password, compute
and print its MD5 encryption value.

Input Format

A single alphanumeric string denoting s.

Constraints

6 <= |s| <= 20

String s consists of English alphabetic letters (i.e.,|a-zA-Z| 
and/or decimal digits (i.e., 0 through 9) only.

Output Format

Print the MD5 encryption value of s on a new line.

*/

import java.io.*;
import java.util.*;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            // return bytesToHex(md.digest
            byte[] digest = md.digest();
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        
    }
}
