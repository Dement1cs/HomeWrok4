package ua.ithillel.lms;

public class Main {
    public static void main(String[] args) {

        Square smallSquare = new Square();
        smallSquare.side = 2;
        smallSquare.printSquareInfo();

        Square bigSquare = new Square();
        bigSquare.side = 4;
        bigSquare.printSquareInfo();
    }
}
