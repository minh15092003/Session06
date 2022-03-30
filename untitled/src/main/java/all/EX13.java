package all;

public class EX13 {
    private int width;
    private int height;

    public EX13() {
        System.out.println("Constructor Invoked...");
        width = 10;
        height = 10;

        public void EX13( int wid, int heig){
            System.out.println("Parameterized Constructor Invoked...");
            width = wid;
            height = heig;
        }
        public void displayDimensions(){
            System.out.println("Width :" + width);
            System.out.println("Width :" + height);

        }
    }
}
