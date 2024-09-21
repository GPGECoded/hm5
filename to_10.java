import java.util.*;

/**
 * to_10
 */
public class to_10 {

    public static void main(String[] args) {
        System.out.println("Number      Square        Cubic");
        System.out.println("---------------------------------");
        for(int times=0; times<=10; times++){
            System.out.println((times)+"            "+(times*times)+"             "+(times*times*times));
        }
    }
}