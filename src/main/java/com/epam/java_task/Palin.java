/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.java_task;
import java.util.*;
public class Palin {
      public static void main(String args[])
   {
      List<String> pal=Arrays.asList("aba","abba","madam","bac","maths","cricket","radar","level","sprint","royal");
      List palindrome=Palin.filterList(pal,StringPredicates::isPalindrome);
      System.out.println(palindrome);
      
   }
   static List<String> filterList(List<String> list,predicate predicate)
   {
       List finalList=new ArrayList<>();
       for(String s:list)
           if(predicate.test(s))
               finalList.add(s);
       return finalList;
   }
}
@FunctionalInterface
interface predicate
{
    boolean test(String s);
}

class StringPredicates
{
    public static boolean isPalindrome(String str)
    {
        int i=0,j=str.length()-1;
        while(i<j)
        { 
            if(str.charAt(i)!=str.charAt(j)) 
                return false;
            i++; 
            j--; 
        }      
    return true; 
    } 
}
