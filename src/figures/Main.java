package figures;
import figures.quadrilateral.Rec;
import figures.quadrilateral.Square;
import figures.triangles.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Square f1 = new Square(2);
        System.out.println(f1.calculate_area());

        Rec f2 = new Rec(2,4);
        System.out.println(f2.calculate_area());

        equilateral_triangle f3 = new equilateral_triangle(2);
        f3.draw();

        right_triangle f4 = new right_triangle(5, 10);
        f4.draw();

        triangle f5 = new triangle(2,6,10);
        f5.draw();

    }

}
