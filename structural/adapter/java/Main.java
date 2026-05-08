package structural.adapter.java;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(4);

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(new SquarePeg(2));
        SquarePegAdapter squarePegAdapter2 = new SquarePegAdapter(new SquarePeg(10));

        System.out.println(roundHole.fits(squarePegAdapter));
        System.out.println(roundHole.fits(squarePegAdapter2));
    }
}
