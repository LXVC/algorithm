package com.lxvc;

import java.util.Stack;

/**
 * Created by vc on 2017/8/5.
 * 1.2
 */

class MyQueue {
    private Stack<Integer> stackPoll = new Stack<>();   // 用出队的栈
    private Stack<Integer> stackAdd = new Stack<>();   //  用来入队的栈

    void add(int item) {
        this.stackAdd.push(item);
    }

    int poll() {
        this.emptyCheck();

        this.moveItems();

        return this.stackPoll.pop();
    }

    /**
     * 把入队数据转移到出队数据栈中，只有在出队栈为空的时候才进行一次数据转移
     */
    private void moveItems() {
        if (!this.stackPoll.isEmpty()) return;

        while (!this.stackAdd.isEmpty()) {
            this.stackPoll.push(this.stackAdd.pop());
        }
    }

    private void emptyCheck() {
        if (this.stackPoll.isEmpty() && this.stackAdd.isEmpty()) {
            throw new RuntimeException("Your Queue Is Empty!");
        }
    }

    int peek() {
        this.emptyCheck();
        this.moveItems();
        return this.stackPoll.peek();
    }

}
