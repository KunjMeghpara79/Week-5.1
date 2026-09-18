package Prac;

public class RoundHole {
    private final double radius;
    public RoundHole(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return  this.radius;
    }
    public boolean fits(RoundPeg peg){
        double radius = peg.getRadius();
        return this.radius >= radius;
    }
}
