package prblm;

public class Square implements Shape {
    private final double side;
    
    public Square(){
        this(1);
    }
    private Square(double side){
        this.side = side;
    }
    public double surface(){
        return side * side;
    }

    @Override
    public double area() {
        return 0;
    }

    public double perimeter(){
        return 4 * side;
    }
}
