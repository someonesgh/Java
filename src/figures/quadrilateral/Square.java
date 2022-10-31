package figures.quadrilateral;
import figures.figure;


public class Square implements figure {
    double a;

    public Square(double a){
        this.a = a;
    }

    public double calculate_area(){
        return a*a;
    }



    @Override
    public void draw(){
        System.out.println("Drawing square");
    }


}



