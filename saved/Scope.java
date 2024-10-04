package com.saved;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            a = 23;
            System.out.println(a); //anything initialised outside the scope cannot br re-initialised again inside the scope
            int c = 30;  //but it can be modified!!
            System.out.println(c);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(a);
            //everything insidea loop cannot be used outside of loop (same as scooe)
        }

    }
}
