package model;

import java.math.BigDecimal;

public class StockInfo {

    private String firm;

    private BigDecimal price;

    public StockInfo(String firm, BigDecimal price) {
        this.firm = firm;
        this.price = price;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFirm() {
        return firm;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "StockInfo{" +
                "firm='" + firm + '\'' +
                ", price=" + price +
                '}';
    }
}
