package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n=-1;
        int m=0;
        while(n!=0){
            Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
            if (n==0){
                break;
            }
            m=m+n;
        }
        System.out.println(m);
    }
}
