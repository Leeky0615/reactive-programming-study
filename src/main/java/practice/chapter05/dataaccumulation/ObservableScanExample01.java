package practice.chapter05.dataaccumulation;

import io.reactivex.rxjava3.core.Observable;
import practice.utils.LogType;
import practice.utils.Logger;

public class ObservableScanExample01 {
    public static void main(String[] args) {
        Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .doOnNext(data -> Logger.log(LogType.DO_ON_NEXT, data))
                .scan(Integer::sum)
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));
    }
}
