package com.analyzer.stock;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class DowAnalyzer {

    //Declaring List variable
    private List<Stock> stockList = new ArrayList<>();

    //Loading the stocks information from the file
    public void loadStocksFromTxtFile() {
        Pattern pattern = Pattern.compile(",");
        try (Stream<String> lines = Files.lines(Paths.get("stocksdetails.txt"))) {
            stockList = lines.map(line -> {
                String[] lineArray = pattern.split(line);
                return new Stock(lineArray[0], lineArray[1], Double.parseDouble(lineArray[2]),
                        Double.parseDouble(lineArray[3]), lineArray[4],lineArray[5],
                        Double.parseDouble(lineArray[6]), Double.parseDouble(lineArray[7]),
                        Double.parseDouble(lineArray[8]), Double.parseDouble(lineArray[9]));
            }).collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();

        }
    }


    //Getter for the private List
    public List<Stock> getStockList() {
        return stockList;
    }
}
