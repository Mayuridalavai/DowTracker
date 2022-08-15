package com.analyzer.stock;

class Main {

    public static void main(String[] args) {
        DowAnalyzer stock= new DowAnalyzer();
        stock.loadStocksFromTxtFile();
        System.out.println(stock.getStockList());

    }

}
