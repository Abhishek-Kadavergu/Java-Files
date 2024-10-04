package com.saved;

public class SquareRoot{
    public static void main(String[] args) {
        int no = 100;
        int result = findsquareroot(no);
        System.out.println(result);
    }

    private static int findsquareroot(int no) {
        int start = 0;
        int end = no;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (middle * middle == no) {
                return middle;
            }else if(middle * middle > no){
                end  = middle - 1;
            }else {
                start = middle + 1;
            }
        }return -1;
    }
}


