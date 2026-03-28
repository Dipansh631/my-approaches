package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Inputelments {
        public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements in stack");
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                System.out.println("Enter the element to be added in stack");
                int num=sc.nextInt();
                st.push(num);
            }
            System.out.println("Enter the element to be added in stack");
            System.out.println(st);
        }
}
