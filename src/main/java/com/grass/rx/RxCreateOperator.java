package com.grass.rx;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func0;
import rx.schedulers.Schedulers;

/**
 * Created by grass on 16/8/7.
 */
public class RxCreateOperator {

    public static void main(String[] args) {

        //        testDefer();

        testRepeat();
    }

    public static void testDefer() {
        final Observable<Integer> defer = Observable.defer(new Func0<Observable<Integer>>() {
            public Observable<Integer> call() {
                return Observable.just((int) System.currentTimeMillis());
            }
        });

        defer.subscribe(new Subscriber<Integer>() {
            public void onCompleted() {

            }

            public void onError(Throwable e) {

            }

            public void onNext(Integer integer) {
                System.out.println("-----call " + integer);
            }
        });

    }

    public static void testInterval() {
        Observable.interval(1, TimeUnit.SECONDS)
                .observeOn(Schedulers.immediate())
                .subscribe(new Subscriber<Long>() {
                    public void onCompleted() {
                        System.out.println("onCompleted");
                    }

                    public void onError(Throwable e) {
                        System.out.println("onError");
                    }

                    public void onNext(Long integer) {
                        System.out.println("call " + integer);
                    }
                });
    }

    public static void testRepeat() {
        Observable.just(10).repeat(5).subscribe(new Subscriber<Integer>() {
            public void onCompleted() {

            }

            public void onError(Throwable e) {

            }

            public void onNext(Integer integer) {
                System.out.println("repeat: " + integer);
            }
        });
    }

    private Observable<Long> interval() {
        return Observable.interval(1, TimeUnit.SECONDS);
        //interva operates by default on the computation Scheduler,so observe on main Thread
    }

}
