package figures.triangles;

public class equilateral_triangle extends triangle {
    public equilateral_triangle(double a) {
        super(a, a, a);
        this.a = a;
        this.b = a;
        this.c = a;

    }

    @Override
    public void draw() {
        System.out.println("Drawing equilateral triangle");
    }


}
