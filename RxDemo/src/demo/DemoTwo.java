package demo;

import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

/**
 * Created by Raymond on 2015-11-07.
 */
public class DemoTwo {

    /**
     *
     * @param ints
     */
    public static void mapDemo(Integer[] ints) {
        Observable
                .from(ints)
                .map((x)-> x + 1) // We add each item by 1 and return an observable
                .map((x)-> x + " ") // Add some space for printing
                .subscribe(System.out::print); // Expected: 2 3 4 5 6
        System.out.println();
    }

    /**
     *
     * @param ints
     */
    public static void filterDemo(Integer[] ints) {
        Observable
                .from(ints)
                .filter(integer -> integer > 2) // Filter out any things that are smaller than 2
                .map((x) -> x + " ") // Add some space for printing
                .subscribe(System.out::print); // Expected 345
        System.out.println();
    }

    /**
     *
     * @param ints
     */
    public static void reduceDemo(Integer[] ints) {
        Observable
                .from(ints)
                .reduce((currInt, nextInt) -> currInt + nextInt) // So it performs 1 + 2 + 3 + 4 + 5
                .subscribe(System.out::print); // Expected: 15
        System.out.println();
    }

    /**
     *
     * @param ints
     */
    public static void flatMapDemo(Integer[] ints) {

    }
}
