package com.Recursion;

public class NumberOfZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(203000, 0));
    }
    static int countZeros(int no, int count) {
        if (no == 0) {
            return count;
        }
        if ( no % 10 == 0) {
            count++;
        }
        return countZeros((no / 10),count);
    }
}


//public class Main{
//    public static void main(String[] a) {
//        System.out.println(countZeros(2030));
//    }
//    static int countZeros(int no) {
//        if (no == 0) {
//            return 1;
//        }
//        if (no < 10) {
//            return 0;
//        }
//        if (no % 10 == 0) {
//            return 1 + countZeros(no/10);
//        }
//        return countZeros(no / 10);
//    }
//}