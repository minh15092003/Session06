package all;

public class EX11 {
    public static void main(String[] args) {
        EX11 objRec1 = new EX11();
        EX11 objRec2 = new EX11();

        System.out.println("\\nRectangle1 Details");
        System.out.println("===================");
        objRec1.hashCode();
        System.out.println("\\nRectangle2 Details");
        System.out.println("===================");
        objRec2.hashCode();
    }
}
