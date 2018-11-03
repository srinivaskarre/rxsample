import model.StockInfo;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import service.StockServer;

import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args)
    {
        List<String> firmList= Arrays.asList("GOOG","AAPL","MSFT","INTC");

        Observable<StockInfo> stockInfoObservable= StockServer.getFeed(firmList);
        //System.out.println("called"+stockInfoObservable);

        stockInfoObservable.subscribe(new Action1<StockInfo>() {
            @Override
            public void call(StockInfo stockInfo) {
                //Thread.currentThread().setName("amskarre");
                System.out.println(stockInfo);

            }
        });
    }
}
