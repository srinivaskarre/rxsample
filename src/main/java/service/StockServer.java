package service;

import model.StockInfo;
import rx.Observable;
import rx.Subscriber;
import java.util.List;

public class StockServer {

    public static Observable<StockInfo> getFeed(List<String> firmList)
    {
        return Observable.create(subscriber->processRequest(subscriber,firmList));
    }

    private static void processRequest(Subscriber<? super StockInfo> subscriber, List<String> firmList)
    {
        //System.out.println("processing request");
        while(true)
        {
           /* firmList
                    .stream().
                    forEach(firm->subscriber.onNext(StockFetcher.fetchStock(firm)));*/
           firmList
                   .stream()
                   .map(firm->StockFetcher.fetchStock(firm))
                   .forEach(subscriber::onNext);

            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
