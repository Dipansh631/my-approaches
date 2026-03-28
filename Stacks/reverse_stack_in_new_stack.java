package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
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
            //reverse order of stack
            Stack<Integer> st1 = new Stack<>();
            while(!st.isEmpty()){
                st1.push(st.pop());
            }
            System.out.println("After pop");
            System.out.println(st1);
        }
}
