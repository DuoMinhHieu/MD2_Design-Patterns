public class ShapeFacory {
    public ShapeFacory(){
    }
    public static Shape getShape(TypeShape type) {
        switch (type) {
            case HINHTRON:
                return new Circle();
            case HINHVUONG:
                return new Square();
            case HINHCHUNHAT:
                return new Rectangle();
            default:
                return null;
        }
    }
}