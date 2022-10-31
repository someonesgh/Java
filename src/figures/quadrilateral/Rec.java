package figures.quadrilateral;
import figures.figure;

public class Rec implements figure {
    double a;
    double b;

     public Rec(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate_area() {
        return this.a * this.b;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
