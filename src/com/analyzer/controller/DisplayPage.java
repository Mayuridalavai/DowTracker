package com.analyzer.controller;

import com.analyzer.model.DowAnalyzer;
import com.analyzer.model.Stock;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Scanner;

public class DisplayPage {

    private DowAnalyzer analyzer = new DowAnalyzer();
    private Scanner scanner = new Scanner(System.in);

    public void execute() {
        welcome();
        menu();
        inputLogic();
    }

    private void welcome() {
        try {
            String banner = Files.readString(Path.of("resource", "welcome.txt"));
            Files.lines(Path.of("resource", "welcome.txt"))
                    .forEach(line -> System.out.println("\033[0;92m" + line)

                    );
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private void menu() {
        //Scanner scanner = new Scanner(System.in); //console input
        System.out.println("\033[0;34m" + ".--------------.\n" +
                "| MENU OPTIONS |\n" +
                "'--------------'");
        mainMenu();
    }

    private void inputLogic() {
        boolean validInput = true;
        int number = 0;
        while (validInput) {
            String input = scanner.nextLine().trim();
            if (input.matches("\\d{1}")) {
                number = Integer.parseInt(input);
                if (!(number >= 1 && number <= 5)) {
                } else {
                    switch (number) {
                        case 1:
                            findStock();
                            break;
                        case 2:
                            displayDynamicView();
                            break;
                        case 3:
                            topFiveDowMover();
                            break;
                        case 4:
                           topFiveDowLoser();
                            break;
                        case 5:
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("\033[0;92m" + "$░▒▓▆▅▃▂▁" + "THANK YOU FOR CHOOSING BS TRACKER" + "▁▂▃▅▆▓▒░$");
                            validInput = false;
                            break;
                    }
                }
            } else {
                System.out.println("Invalid options selected, your options are [1-6]. Please select again!");
            }
        }
    }

    private void findStock() {
        System.out.println("Enter the Ticker or Company name.");
        String ticker = scanner.nextLine();
        Collection<Stock> findStock = analyzer.findStock(ticker);
        findStock.forEach(stock1 -> System.out.println(stock1.displayStockInfo()));
        mainMenu();
    }

    private void topFiveDowMover() {
        Collection<Stock> topFiveMover = analyzer.topFiveDowMover();
        topFiveMover.forEach(stock1 -> System.out.println(stock1.displayStockInfo()));
        mainMenu();
    }

    private void topFiveDowLoser() {
        Collection<Stock> topFiveLooser = analyzer.topFiveDowLooser();
        topFiveLooser.forEach(stock1 -> System.out.println(stock1.displayStockInfo()));
        mainMenu();
    }

    private void displayDynamicView() {
        Collection<Stock> dynamicStock = analyzer.dynamicStockView();
        dynamicStock.forEach(stock1 -> System.out.println(stock1.displayStockInfo()));
    }

    private void mainMenu() {
        System.out.println("\033[1;92m");
        System.out.println("[1] Search for Stock\n" +
                "[2] Display List of Dow 30 Stocks\n" +
                "[3] Top Five DOW Mover\n" +
                "[4] Top Five DOW Looser\n" +
                "[5] - Quit\n");
        System.out.println("\033[1;97m" + "Please select your options: ");
    }
}
