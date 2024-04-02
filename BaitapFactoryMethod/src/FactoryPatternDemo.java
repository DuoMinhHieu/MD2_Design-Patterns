import java.util.Scanner;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<1> <2> <3>");
        int type = sc.nextInt();
        TypeShape typeShape;
        if (type==1) {
            typeShape=TypeShape.HINHTRON;
            Shape shape = ShapeFacory.getShape(typeShape);
            System.out.println(shape);
        } else if (type==2) {
            typeShape=TypeShape.HINHVUONG;
            Shape shape = ShapeFacory.getShape(typeShape);
        } else if (type==3) {
            typeShape=TypeShape.HINHCHUNHAT;
            Shape shape = ShapeFacory.getShape(typeShape);
        }
    }
}