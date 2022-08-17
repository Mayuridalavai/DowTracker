package com.analyzer.stock;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Scanner;

public class DisplayPage {

    DowAnalyzer analyzer = new DowAnalyzer();
    public void execute() {
        welcome();
        menu();
        //inputLogic();
    }

    private void welcome() {
        try {
            String banner = Files.readString(Path.of("resource","welcome.txt"));
            Files.lines(Path.of( "resource","welcome.txt"))
                    .forEach(line -> System.out.println("\033[0;92m"+line)

                    );
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }    }

    private void menu() {
        //Scanner scanner = new Scanner(System.in); //console input
        System.out.println("\033[0;34m" + ".--------------.\n" +
                "| MENU OPTIONS |\n" +
                "'--------------'");
        mainMenu();

    }
//    private void inputLogic() {
//        Scanner scanner = new Scanner(System.in);
//        boolean userInput = true;
//        int number = 0;
//        while (userInput) {
//            String input = scanner.nextLine().trim();
//            if (input.matches("\\d{1}")) {
//                number = Integer.parseInt(input);
//                if (!(number >= 1 && number <= 6)) {
//                    System.out.println("Invalid options selected, your options are [1-6]. Please select again!");
//                } else {
//                    for(number=1; number<6; number++){
//                        switch (number){
//                            case 1:
//                                findStock();
//                                break;
//                            case 2:
//                                displayAllStocks();
//                                break;
//                            case 3:
//                                topFiveDowMover();
//                                break;
//                            case 4:
//                                topFiveDowLooser();
//                                break;
//                            case 5:
//                                displayDynamicView();
//                                break;
//                            case 6:
//                                System.out.println("Quitting the application......");
//                                userInput=false;
//                                break;
//                        }
//                    }
//                }
//            }else{
//                System.out.println("Please, enter the valid Integer");
//            }
//        }
//    }
//
//    public void findStock(){
//        Collection<Stock> findStock= analyzer.findStock("AAPl");
//        findStock.forEach(stock1-> System.out.println(stock1.displayStockInfo()));
//    }
//    public void displayAllStocks(){
//        System.out.println(analyzer.getStockList());
//    }
//    public void topFiveDowMover(){
//        Collection<Stock> topFiveMover= analyzer.topFiveDowMover();
//        topFiveMover.forEach(stock1 ->System.out.println(stock1.displayStockInfo()));
//    }
//    public void topFiveDowLooser(){
//        Collection<Stock> topFiveLooser= analyzer.topFiveDowLooser();
//        topFiveLooser.forEach(stock1 ->System.out.println(stock1.displayStockInfo()));
//    }
//    public void displayDynamicView(){
//        Collection <Stock> dynamicStock= analyzer.dynamicStockView();
//        dynamicStock.forEach(stock1 -> System.out.println(stock1.displayStockInfo()));
//    }
    public void mainMenu(){
        //int selection = 0;
        System.out.println("\033[1;92m");
        System.out.println("[1] Search for Stock\n" +
                "[2] Display List of Dow 30 Stocks\n" +
                "[3] Top Five DOW/ Market Mover\n" +
                "[4] Top Five DOW/ Market Looser\n" +
                "[5] - Quit\n");
        System.out.println("\033[1;97m" + "Please select your options: ");

    }
}
