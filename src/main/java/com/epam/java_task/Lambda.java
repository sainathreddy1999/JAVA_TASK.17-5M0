package com.epam.java_task;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
public class Lambda {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Lambda l=new Lambda();
        System.out.println("Enter the number of strings:");
        int n=sc.nextInt();
        String s[]=new String[20];
        List<String> list=new ArrayList<String>();
        System.out.println("Enter the strings:");
        for(int i=0;i<n;i++)
            s[i]=sc.next();
        for(int i=0;i<n;i++)
            list.add(s[i]);
        List li=l.search(list);
        System.out.println(li);
        
    }
    public List<String> search(List<String> list)
    {
        return list.stream()
  .filter(s -> s.startsWith("a"))
  .filter(s -> s.length() == 3)
  .collect(Collectors.toList());
    }
    
}


