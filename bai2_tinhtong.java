
package Lec6_ArrayList;

import  java.util.*;
public class bai2_tinhtong {
    public static void main(String []args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap n:");
    int n = scanner.nextInt();
    int sum=0;
    for(int i = 1 ; i <=n;i++ ){
        sum +=i;
    }
    System.out.println("tong cac so tu 1-n="+sum);
    
    }   
}

