package com.cqupt.chapter9;

public class Demo4 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call();
        p.send();
        p.show();

        NewPhone np = new NewPhone();
        np.call();
        np.send();
        np.show();
    }
}
