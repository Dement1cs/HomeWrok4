package ua.ithillel.lms;

public class transformation {
    public static void main(String[] args) {
        byte b = 50;
        short s = b;
        int i = s;
        long d = i;
        System.out.println(d);

        int i1 = 5000;
        double d1 = i1;
        System.out.println(d1);

        short s2 = 500;
        float f2 = s2;
        double d2 = f2;
        System.out.println(s2);

        char ch3 = 'A';
        int i3 = ch3;
        System.out.println(i3);
    }
}
