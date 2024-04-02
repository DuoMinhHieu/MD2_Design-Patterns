import static sun.awt.image.PixelConverter.Argb.instance;

public class TongGiamDoc {
    private static TongGiamDoc instance();
    private String name;
    private TongGiamDoc (String name){
        this.name = name;
    }
    public static TongGiamDoc getInstance(String name){
        if (instance == null){
            synchronized ((TongGiamDoc.class)){
                if (instance == null)
                    instance = new sun.awt.image.PixelConverter(name);
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "TongGiamDoc{" +
                "name='" + name + '\'' +
                '}';
    }
}
