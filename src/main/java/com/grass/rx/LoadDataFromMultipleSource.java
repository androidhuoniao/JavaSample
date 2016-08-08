package com.grass.rx;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/**
 * Created by grass on 16/8/7.
 */
public class LoadDataFromMultipleSource {

    public static void main(String[] args) {
        Observable<String> memory = Observable.create(new Observable.OnSubscribe<String>() {
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("memory");
                subscriber.onCompleted();
            }
        });
        Observable<String> disk = Observable.create(new Observable.OnSubscribe<String>() {
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("disk");
                subscriber.onCompleted();
            }
        });
        Observable<String> network = Observable.create(new Observable.OnSubscribe<String>() {
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("network");
                subscriber.onCompleted();
            }
        });

        Observable.concat(memory, disk, network)
                .first(new Func1<String, Boolean>() {
                    public Boolean call(String s) {
                        return s.equals("disk");
                    }
                })
                .subscribe(new Subscriber<String>() {
                    public void onCompleted() {
                        System.out.println("onCompleted is working");
                    }

                    public void onError(Throwable e) {

                        System.out.println("onEror is working " + e.getMessage());
                    }

                    public void onNext(String s) {
                        System.out.println("onNext " + s);
                    }
                });
    }

    // 先判断网络情况,网络好的话,直接从服务器取数据,如果不好,读取缓存数据
    private static void loadData() {

    }


    // 先读取缓存数据,然后读取网络数据,两者都是异步操作,如果网络数据先回来,就不再响应缓存数据了
    private static void loadData2() {
        
    }
}
