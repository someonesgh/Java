package figures.triangles;

public class right_triangle extends triangle {
    public right_triangle(double a, double b) {
        super(a, b, Math.sqrt(a * a + b * b));
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(a * a + b * b);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a right triangle");
    }

}
