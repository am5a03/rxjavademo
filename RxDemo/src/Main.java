import demo.DemoOne;
import demo.DemoTwo;

/**
 * Created by Raymond on 2015-11-07.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};

        /*
         * Demo 1
         */
        DemoOne.normalPrint(integers);
        DemoOne.reactivePrint(integers);
        DemoOne.reactivePrint2(integers);

        /*
         * Demo 2
         */
        DemoTwo.mapDemo(integers);
        DemoTwo.filterDemo(integers);
        DemoTwo.reduceDemo(integers);
    }
}
