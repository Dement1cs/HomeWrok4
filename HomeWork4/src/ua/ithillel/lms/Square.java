package ua.ithillel.lms;

public class Square {
    int side;
    int perimeter;
    int s;
    boolean b;
    String st = "Периметр равен площади ";

    public void printSquareInfo() {
        s = side * side;
        perimeter = 4 * side;
        b = (s == perimeter);

        System.out.println("S = " + s);
        System.out.println("perimeter = " + perimeter);
        System.out.println(st + b);
    }
}
