package Prac;

public class SquarePegAdapter extends RoundPeg{
    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg){
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
        return result;
    }
}
