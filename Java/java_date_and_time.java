/*

The Calendar class is an abstract class that provides
methods for converting between a specific instant in
time and a set of calendar fields such as YEAR, MONTH, 
DAY_OF_MONTH, HOUR, and so on, and for manipulating the 
calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, getDay,
which returns the day on that date. To simplify your task,
we have provided a portion of the code in the editor.

Example

month = 8
day = 14
year = 2017

The method should return Monday as the day on that date.

Function Description

Complete the findDay function in the editor below.

findDay has the following parameters:

int: month
int: day
int: year
Returns

string: the day of the week in capital letters
Input Format

A single line of input containing the space separated month,
day and year, respectively, in MM DD YYY format.

Constraints

2000 < year < 3000

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, day);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.YEAR, year);
        
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("en", "US")).toUpperCase();
    }

}

