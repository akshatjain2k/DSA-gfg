class MyStack {
    int a[];
    int cap;
    int top;

    MyStack(int c) {
        top = -1;
        cap = c;
        a = new int[cap];
    }

    void push(int x) {
        if (top == cap - 1) {
            System.out.println("Overflow");
        }
        top++;
        a[top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Underflow");
        }
        int res = a[top];
        top--;
        return res;
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return (top == -1);
    }
    // void display(){
    // for (int i = cap; i > 0; i--) {
    // System.out.println(s[i]);
    // }
    // }
}

class implementation {
    public static void main(String[] args) {
        MyStack s = new MyStack(3);
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.pop());
        s.push(30);
        s.size();
    }
}
