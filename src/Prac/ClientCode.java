package Prac;

public class ClientCode {
    public static void main(String[] args) {
        SquarePeg peg = new SquarePeg(4);
        RoundHole hole = new RoundHole(2);
        RoundPeg roundPeg = new RoundPeg(4);
        System.out.println(hole.fits(new SquarePegAdapter(peg)));
        System.out.println(hole.fits(roundPeg));
    }
}
