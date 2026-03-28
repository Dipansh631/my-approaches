package Stacks;

import java.util.Stack;

public class Insert_at_Bottom_or_anyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx=2;
        int x=10;
        Stack<Integer> st1 = new Stack<>();
        while(st.size()>idx){
            st1.push(st.pop());
        }
        st.push(x);
        while(!st1.isEmpty()){
            st.push(st1.pop());
        }
        System.out.println(st);
    }
}
//if idx is out of bound then elem is inserted at end
