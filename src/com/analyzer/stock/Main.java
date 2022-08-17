package com.analyzer.stock;

import java.util.Collection;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        DowAnalyzer analyzer = new DowAnalyzer();
        //Loads the stock
        analyzer.loadStocksFromTxtFile();
        //Display the page
        DisplayPage app = new DisplayPage();
        app.execute();
        Scanner scanner = new Scanner(System.in);
        boolean userInput = true;
        int number = 0;
        while (userInput) {
            String input = scanner.nextLine().trim();
            if (input.matches("\\d{1}")) {
                number = Integer.parseInt(input);
                if (!(number >= 1 && number <= 5)) {
                    System.out.println("Invalid options selected, your options are [1-6]. Please select again!");
                } else {
                    switch (number) {
                        case 1:
                            System.out.println("Enter the Ticker or Company name.");
                            String ticker= scanner.nextLine();
                            Collection<Stock> findStock = analyzer.findStock(ticker);
                            findStock.forEach(stock1 -> System.out.println(stock1.displayStockInfo()));
                            break;
                        case 2:
                            Collection<Stock> dynamicStock = analyzer.dynamicStockView();
                            dynamicStock.forEach(stock1 -> System.out.println(stock1.displayStockInfo()));
                            break;
                        case 3:
                            Collection<Stock> topFiveMover = analyzer.topFiveDowMover();
                            topFiveMover.forEach(stock1 -> System.out.println(stock1.displayStockInfo()));
                            break;
                        case 4:
                            Collection<Stock> topFiveLooser = analyzer.topFiveDowLooser();
                            topFiveLooser.forEach(stock1 -> System.out.println(stock1.displayStockInfo()));
                            break;
                        case 5:
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("\033[0;92m"+"$░▒▓▆▅▃▂▁" +"THANK YOU FOR CHOOSING BS TRACKER"+ "▁▂▃▅▆▓▒░$");
                            userInput = false;
                            break;
                    }
                }
            } else {
                System.out.println("Please, enter the valid Integer");
            }
        }
    }
}
