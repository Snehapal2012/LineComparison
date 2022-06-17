package com.linecomparison;

import java.util.Scanner;

public class LineComparisonUC1 {
    public static void main(String[] args) {
        int x1,y1,x2,y2,n1,n2,m1,m2;

        double sum=0;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter x1 value of Line: ");
        x1=r.nextInt();
        System.out.print("Enter y1 value of Line: ");
        y1=r.nextInt();
        System.out.print("Enter x2 value of Line: ");
        x2=r.nextInt();
        System.out.print("Enter y2 value of Line: ");
        y2=r.nextInt();
        n1=x1-x2;
        m1=y1-y2;
        n2=n1*n1;
        m2=m1*m1;
        double p1=Math.sqrt(n2);
        double p2=Math.sqrt(m2);
        sum=p1+p2;
        System.out.println("Length of the Line: "+sum);

    }
    }

