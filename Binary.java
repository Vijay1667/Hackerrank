import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
//Vijay


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        String s="";
        int[] arr=new int[100];
        while(n>0) {
            s+=(n%2);
            if(n<2) {
                s+=(n/2);
            }
            n/=2;
        }
        //String ss=StringFormatter.reverse(s);
        int count=0;
        int temp=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='1') {
                count++;
            }
            else {
                temp=Math.max(temp,count);
                count=0;
                
            }
        }
        System.out.println(temp);
        
    }
}
//Vijay
