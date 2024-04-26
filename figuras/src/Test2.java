public class Test2 extends Terminal {
    
    public static void main(String[] args){
        Shape[] shapes = new Shape[]{
            new Square(5),
            new Rectangle(6,4),
            new Circle(3),
            new Ellipse(5,3),
            new Triangle(3,4,5),
            new Square(7),
            new Rectangle(8,2),
            new Circle(4),
            new Ellipse(6,2),
             new Triangle(7,8,10),
            new Square(10),
            new Rectangle(9,3),
            new Circle(5),
            new Ellipse(7,4),
            new Triangle(6,7,8)

    


        };

        float areaTotal=0,PerimeterTotal=0;

        for(Shape shape: shapes){
            printLine(shape.toString());
            
            areaTotal = shape.getArea();
            PerimeterTotal = shape.getPerimeter();
            printLine("area total=%.2f, perimetro total = %.2f", areaTotal, PerimeterTotal);
        }
        
    }
}
