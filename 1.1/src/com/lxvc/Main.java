package com.lxvc;

public class Main {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(2);
        myStack.push(1);
        System.out.println(myStack.getMin());
        myStack.pop();
        System.out.println(myStack.getMin());
        myStack.pop();
        try {
            System.out.println(myStack.getMin());
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }


    }
}
