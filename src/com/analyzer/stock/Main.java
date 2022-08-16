package com.analyzer.stock;

import java.util.Collection;

class Main {

    public static void main(String[] args) {
        DowAnalyzer stock= new DowAnalyzer();
        //Loads the stock
        stock.loadStocksFromTxtFile();

        //Displays Stock in dynamic view
        Collection <Stock> dynamicStock= stock.dynamicStockView();
        dynamicStock.forEach(stock1 -> System.out.println(stock1.displayStockInfo()));

        //Finds specific stock
        Collection<Stock> findStock= stock.findStock("AAPl");
        findStock.forEach(stock1-> System.out.println(stock1.displayStockInfo()));


        //Display All Stocks

    }

}
