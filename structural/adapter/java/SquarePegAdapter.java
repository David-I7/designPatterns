package structural.adapter.java;

public class SquarePegAdapter extends RoundPeg{

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super((int)(squarePeg.getWidth() * Math.sqrt(2) / 2));
    }

    @Override
    public int getRadius() {
        return super.getRadius();
    }
}

