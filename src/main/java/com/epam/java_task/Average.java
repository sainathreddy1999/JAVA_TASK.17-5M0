/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.java_task;
import java.util.*;
public class Average 
{
 public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of integers:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Average of "+n+" numbers is :"+Average(n,a));
    }
    public static float Average(int n,int a[])
    {
        float res=0;
        for(int i=0;i<n;i++)
            res+=a[i];
        return res/n;
        
    }    
}
