package com.linecomparison;

import java.util.Scanner;

public class LineComparisonUC3 {
    public static void main(String[] args) {
        int x1, y1, x2, y2, n1, n2, m1, m2;
        int a1, b1, a2, b2, c1, c2, d1, d2;
        double sum1 = 0, sum2 = 0;
        Scanner r = new Scanner(System.in);

        System.out.print("Enter x1 value of 1st Line: ");
        x1 = r.nextInt();
        System.out.print("Enter y1 value of 1st Line: ");
        y1 = r.nextInt();
        System.out.print("Enter x2 value of 1st Line: ");
        x2 = r.nextInt();
        System.out.print("Enter y2 value of 1st Line: ");
        y2 = r.nextInt();
        System.out.print("Enter a1 value of 2nd Line: ");
        a1 = r.nextInt();
        System.out.print("Enter b1 value of 2nd Line: ");
        b1 = r.nextInt();
        System.out.print("Enter a2 value of 2nd Line: ");
        a2 = r.nextInt();
        System.out.print("Enter b2 value of 2nd Line: ");
        b2 = r.nextInt();
        n1 = x1 - x2;
        m1 = y1 - y2;
        n2 = n1 * n1;
        m2 = m1 * m1;
        c1 = a1 - a2;
        d1 = b1 - b2;
        c2 = c1 * c1;
        d2 = d1 * d1;

        double p1 = Math.sqrt(n2);
        double p2 = Math.sqrt(m2);
        double e1 = Math.sqrt(c2);
        double e2 = Math.sqrt(d2);
        sum1 = p1 + p2;
        sum2 = e1 + e2;
        String str1=Double.toString(sum1);
        String str2=Double.toString(sum2);
        if((str2.compareTo(str1))==0) {
            System.out.println("Two Lines are equal");
        } else if (str1.compareTo(str2)>0) {
            System.out.println("1st Line's length is greater than 2nd Line's length");
        } else {
            System.out.println("1st Line's length is less than 2nd Line's length ");
        }
    }
}
