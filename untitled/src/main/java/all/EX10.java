package all;

import java.awt.*;

public class EX10 {
    int width;
    int height;

    EX10() {
        System.out.println("ConstructorInvoked...");
        width = 10;
        height = 10;
    }

    EX10(int wid, int heig) {
        System.out.println("Parameterized Constructor");
        width = wid;
        height = heig;


    }


}
