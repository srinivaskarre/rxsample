package service;

import model.StockInfo;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;


import java.io.IOException;
import java.math.BigDecimal;
import java.util.Random;

public class StockFetcher
{
    public static StockInfo fetchStock(String firm)
    {
        try {

            //return new StockInfo(firm, stock.getQuote().getPrice());
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return new StockInfo(firm, new BigDecimal(generateRandomNum()));
    }

    private static int generateRandomNum() {
        return new Random().nextInt(1000000000);
    }
}
