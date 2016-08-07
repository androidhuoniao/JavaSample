package com.grass.rx;

import java.io.Serializable;
import java.util.ArrayList;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by grass on 16/8/6.
 */
public class HelloRxJava {

    public static void main(String[] args) {
        //        printString();
        //        testThread();
        System.out.println("-----------------------------------------------------");
        //        testThread2();

        testJust();

        testContactMap();

        testSwitchMap();

    }

    private static void testSwitchMap() {
        String[] strs = new String[] {"grass", "honey", "mother", "father"};
        Observable.just(strs)
                .switchMap(new Func1<String[], Observable<String>>() {
                    public Observable<String> call(String[] strs) {
                        return Observable.from(strs);
                    }
                }).subscribe(new Action1<String>() {
            public void call(String s) {
                System.out.println("switchMap: " + s);
            }
        });
    }

    private static void testContactMap() {
        String[] strs = new String[] {"grass", "honey", "mother", "father"};
        Observable.just(strs)
                .concatMap(new Func1<String[], Observable<String>>() {
                    public Observable<String> call(String[] strs) {
                        return Observable.from(strs);
                    }
                }).subscribe(new Action1<String>() {
            public void call(String s) {
                System.out.println("contactmap: " + s);
            }
        });
    }

    private static void testJust() {
        Observable.just("grass", 29)
                .subscribe(new Subscriber<Serializable>() {
                    public void onCompleted() {

                    }

                    public void onError(Throwable throwable) {

                    }

                    public void onNext(Serializable serializable) {

                        System.out.println("onNext: " + serializable.toString());
                    }
                });
    }

    private static void testThread() {
        String[] strs = new String[] {"grass", "honey", "mother", "father"};
        Observable.from(strs)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .subscribe(new Observer<String>() {
                    public void onCompleted() {
                        System.out.println("onCompleted: ");
                    }

                    public void onError(Throwable throwable) {

                        System.out.println("onError: ");
                    }

                    public void onNext(String s) {

                        System.out.println("onNext: " + s);
                    }
                });
    }

    private static void testThread2() {
        Observable.create(new Observable.OnSubscribe<String>() {
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("i am grass");
                subscriber.onCompleted();
            }
        })
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<String>() {
                    public void onCompleted() {
                        System.out.println("onCompleted: ");
                    }

                    public void onError(Throwable throwable) {

                        System.out.println("onError: ");
                    }

                    public void onNext(String s) {

                        System.out.println("onNext: " + s);
                    }
                });
    }

    /**
     * 为什么加上subscribleOn之后就收不到数据了呢?
     */
    private static void printString() {
        String str = "grasssdfaslfk";
        System.out.println("print begin: " + Thread.currentThread().getName());
        Observable.just(str)
                .flatMap(new Func1<String, Observable<String>>() {
                    public Observable<String> call(String s) {
                        System.out.println("flatmap is working " + Thread.currentThread().getName());
                        char[] chars = s.toCharArray();
                        ArrayList<String> list = new ArrayList<String>(chars.length);
                        for (char c : chars) {
                            list.add(String.valueOf(c));
                        }
                        return Observable.from(list);
                    }
                })
                .filter(new Func1<String, Boolean>() {
                    public Boolean call(String s) {
                        System.out.println("filter is working");
                        return s.equals("s");
                    }
                })
                .map(new Func1<String, String>() {
                    public String call(String s) {
                        System.out.println("map is working");
                        return s.toUpperCase();
                    }
                })
                .subscribe(new Subscriber<String>() {
                    public void onCompleted() {
                        System.out.println("onCompleted is working");
                    }

                    public void onError(Throwable throwable) {
                        System.out.println("onError is working");
                    }

                    public void onNext(String s) {
                        System.out.println("onNext: " + s);
                    }
                });
    }
}
