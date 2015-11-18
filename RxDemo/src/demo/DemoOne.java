package demo;


import rx.Observable;
import rx.functions.Action1;

/**
 * Created by Raymond on 2015-11-07.
 */
public class DemoOne {

    /**
     * Print via normal loop
     * @param ints
     */
    public static void normalPrint(Integer[] ints) {
        for (Integer i : ints) {
            System.out.print(i);
        }
        System.out.println();
    }

    /**
     * Reactive Print
     * @param ints
     */
    public static void reactivePrint(Integer[] ints) {
        Observable
            .from(ints) // Convert integer array as an observable
            // Subscribe on the observable and do something on each item
            .subscribe(new Action1<Integer>() {
                @Override
                public void call(Integer integer) {
                    System.out.print(integer);
                }
            });
        System.out.println();
    }

    /**
     * Lambda Expression
     * @param ints
     */
    public static void reactivePrint2(Integer[] ints) {
        Observable.from(ints).subscribe(System.out::print);
        System.out.println();
    }
}
