package com.analyzer.stock;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DowAnalyzer {

    //Declaring List variable
    private List<Stock> stockList= loadStocksFromTxtFile();
    private final int rangeVariable=5;

    //Loading the stocks information from the file
    private List<Stock> loadStocksFromTxtFile() {
        List<Stock> result=null;
        Pattern pattern = Pattern.compile(",");
        try (Stream<String> lines = Files.lines(Paths.get("config", "stocksdetails.txt"))) {
            result = lines.map(line -> {
                String[] lineArray = pattern.split(line);
                return new Stock(lineArray[0], lineArray[1], Double.parseDouble(lineArray[2]),
                        Double.parseDouble(lineArray[3]), lineArray[4], lineArray[5],
                        Double.parseDouble(lineArray[6]), Double.parseDouble(lineArray[7]),
                        Double.parseDouble(lineArray[8]), Double.parseDouble(lineArray[9]));
            }).collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();

        }
        return result;
    }

    //Method for searching the stock
    public Collection<Stock> findStock(String ticker) {
        Collection<Stock> result = new ArrayList<>();
        for (Stock stock : stockList) {
            if (ticker.equalsIgnoreCase(stock.getTicker()) || ticker.equalsIgnoreCase(stock.getCompanyName())) {
                result.add(stock);
            }
        }
        if(result.isEmpty()){
            System.out.println("The stock is not listed in DOW30. Please go to option 1 and make new search");
        }
        return result;
    }

    //Method for viewing the top five dow mover
    public Collection<Stock> topFiveDowMover() {
        Collection<Stock> result = stockList.stream()
                .sorted(Comparator.comparing(Stock::getCurrentPrice).reversed())
                .limit(5)
                .collect(Collectors.toList());
        return result;
    }

    //Method for viewing the top five dow looser
    public Collection<Stock> topFiveDowLooser() {
        Collection<Stock> result = stockList.stream()
                .sorted(Comparator.comparing(Stock::getCurrentPrice))
                .limit(5)
                .collect(Collectors.toList());
        return result;
    }


    //Method for showing the Dynamic View of the stock, meaning, the price changes everytime the program runs
    public Collection<Stock> dynamicStockView() {
        Collection<Stock> result = new ArrayList<>();
        for (Stock stock : stockList) {
            //Generate random number from +5-5
            double randomNumber = Math.round((Math.random() * (rangeVariable + rangeVariable)) - rangeVariable);
            double price = stock.getCurrentPrice();
            //Set the current price of stock to sum of current price and random number from +5 to -5
            stock.setCurrentPrice(randomNumber + price);
            double newPrice = stock.getCurrentPrice();
            if (stock.getCurrentPrice() > stock.getPreviousDayPrice()) {
                //Change color to green
                stock.setCurrentPrice(newPrice);
            } else {
                //Change color to red
                stock.setCurrentPrice(newPrice);
            }
            result.add(stock);
        }
        return result;
    }

    //Getter for the private List
    public List<Stock> getStockList() {
        return stockList;
    }
}
