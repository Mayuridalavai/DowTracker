package com.analyzer.stock;

public class Stock {
    private String ticker;
    private String companyName;
    private double currentPrice;
    private double previousDayPrice;
    private String volume;
    private String oneYearTargetEst;
    private double fiftyTwoWeekHigh;
    private double fiftyTwoWeekLow;
    private double eps;
    private double peRatio;

    //Creating Constructor
    public Stock(String ticker, String companyName, double currentPrice, double previousDayPrice, String volume,
                 String oneYearTargetEst, double fiftyTwoWeekHigh, double fiftyTwoWeekLow,
                 double eps, double peRatio) {
        this.ticker = ticker;
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.previousDayPrice=previousDayPrice;
        this.volume = volume;
        this.oneYearTargetEst = oneYearTargetEst;
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
        this.eps = eps;
        this.peRatio = peRatio;
    }

    //Creating Getter and Setter
    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getVolume() {
        return volume;
    }

    public double getPreviousDayPrice() {
        return previousDayPrice;
    }

    public void setPreviousDayPrice(double previousDayPrice) {
        this.previousDayPrice = previousDayPrice;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getOneYearTargetEst() {
        return oneYearTargetEst;
    }

    public void setOneYearTargetEst(String oneYearTargetEst) {
        this.oneYearTargetEst = oneYearTargetEst;
    }

    public double getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }

    public void setFiftyTwoWeekHigh(double fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    }

    public double getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }

    public void setFiftyTwoWeekLow(double fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }

    public double getEps() {
        return eps;
    }

    public void setEps(double eps) {
        this.eps = eps;
    }

    public double getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(double peRatio) {
        this.peRatio = peRatio;
    }


    @Override
    public String toString() {
        return "Stock{" +
                "ticker='" + ticker + '\'' +
                ", companyName='" + companyName + '\'' +
                ", currentPrice=" + currentPrice +
                ", volume=" + volume +
                ", oneYearTargetEst=" + oneYearTargetEst +
                ", fiftyTwoWeekHigh=" + fiftyTwoWeekHigh +
                ", fiftyTwoWeekLow=" + fiftyTwoWeekLow +
                ", eps=" + eps +
                ", peRatio=" + peRatio +
                '}';
    }
}
