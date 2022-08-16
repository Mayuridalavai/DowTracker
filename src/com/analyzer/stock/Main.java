package com.analyzer.stock;

import java.util.Collection;

class Main {

    public static void main(String[] args) {
        // instantiate the controller and say go
        FrontPage app = new FrontPage();
        app.execute();

        DowAnalyzer stock= new DowAnalyzer();
        //Loads the stock
        stock.loadStocksFromTxtFile();

        //Displays Stock in dynamic view
        Collection <Stock> dynamicStock= stock.dynamicStockView();
        dynamicStock.forEach(stock1 -> System.out.println(stock1.displayStockInfo()));

        //Finds specific stock
        Collection<Stock> findStock= stock.findStock("AAPl");
        System.out.println();
        findStock.forEach(stock1-> System.out.println(stock1.displayStockInfo()));

        //Top 5 DOW Mover
        Collection<Stock> topFiveMover= stock.topFiveDowMover();
        System.out.println();
        topFiveMover.forEach(stock1 ->System.out.println(stock1.displayStockInfo()));

        //Top 5 DOW Looser
        Collection<Stock> topFiveLooser= stock.topFiveDowLooser();
        System.out.println();
        topFiveLooser.forEach(stock1 ->System.out.println(stock1.displayStockInfo()));

        //Display Detail List of All Stocks
        System.out.println();
        System.out.println(stock.getStockList());


    }

}
