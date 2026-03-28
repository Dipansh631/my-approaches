package Stacks;

import java.util.Stack;

public class BasicsOfstacks {
        public static void main(String[] args) {
            Stack<Integer>st = new Stack<>();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
            st.push(6);
            st.push(7);
            st.push(8);
            st.push(9);
            st.push(10);
            System.out.println(st.peek());
            st.pop();
            System.out.println("After pop");
            System.out.println(st.peek());
            System.out.println(st);
            System.out.println(st.contains(2));
            System.out.println(st.contains(3));
            System.out.println(st.contains(4));
            System.out.println(st.size());
            System.out.println(st.isEmpty());
            //remove last element of stack
            System.out.println(st.pop());
            //printing stack
            System.out.println(st);
            //printing the last element of stack by peek
            System.out.println(st.peek());
            //printing the last element of stack
            while(st.size()>1){
                st.pop();
            }
            System.out.println(st);
            System.out.println(st.peek());
        }
}
