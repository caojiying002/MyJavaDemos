package com.example.rxjava2demo;


import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Subscribe {

    public static void main(String[] args) {

        Observable<String> observable = Observable.just("hello", "rxjava");

        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("onSubscribe: d = " + d);
            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext: s = " + s);
            }

            @Override
            public void onError(Throwable e) {
                System.err.println("onError: ");
                e.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete.");
            }
        };

        observable.subscribe(observer);

    }
}
