package com.lxvc;

import java.util.Stack;

/**
 * Created by lxvc on 2017/8/5.
 * 例子 1.1
 */
class MyStack {
    private Stack<Integer> stackMin = new Stack<Integer>();
    private Stack<Integer> stackData = new Stack<Integer>();

    int getMin() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty!");
        }
        return this.stackMin.peek();
    }

    void push(int item) {
        if (this.stackMin.empty() || item <= this.stackMin.peek()) {
            this.stackMin.push(item);
        }
        this.stackData.push(item);
    }

    int pop() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty!");
        }
        int top = this.stackData.pop();
        if (top == this.getMin()) {
            this.stackMin.pop();
        }
        return top;
    }
}
