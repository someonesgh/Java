package figures.triangles;

public class triangle implements figure {
    double a;
    double b;
    double c;

    public triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }

}
