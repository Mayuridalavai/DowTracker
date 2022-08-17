package com.analyzer.stock;

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
        System.out.println(
                Colors.RED_BOLD_BRIGHT + "╔╗╔╗╔╗    ╔╗                     ╔════╗        ╔══╗ ╔═══╗    ╔═══╗╔═══╗╔╗╔╗╔╗    ╔╗  ╔╗                   \n" +
                        Colors.YELLOW + "║║║║║║    ║║                     ║╔╗╔╗║        ║╔╗║ ║╔═╗║    ╚╗╔╗║║╔═╗║║║║║║║    ║╚╗╔╝║                   \n" +
                        Colors.YELLOW_BOLD_BRIGHT + "║║║║║║╔══╗║║ ╔══╗╔══╗╔╗╔╗╔══╗    ╚╝║║╚╝╔══╗    ║╚╝╚╗║╚══╗     ║║║║║║ ║║║║║║║║    ╚╗║║╔╝╔╗╔══╗╔╗╔╗╔╗╔══╗╔═╗\n" +
                        Colors.GREEN_BOLD_BRIGHT + "║╚╝╚╝║║╔╗║║║ ║╔═╝║╔╗║║╚╝║║╔╗║      ║║  ║╔╗║    ║╔═╗║╚══╗║     ║║║║║║ ║║║╚╝╚╝║     ║╚╝║ ╠╣║╔╗║║╚╝╚╝║║╔╗║║╔╝\n" +
                        Colors.CYAN_BOLD_BRIGHT + "╚╗╔╗╔╝║║═╣║╚╗║╚═╗║╚╝║║║║║║║═╣     ╔╝╚╗ ║╚╝║    ║╚═╝║║╚═╝║    ╔╝╚╝║║╚═╝║╚╗╔╗╔╝     ╚╗╔╝ ║║║║═╣╚╗╔╗╔╝║║═╣║║ \n" +
                        Colors.BLUE_BOLD_BRIGHT + " ╚╝╚╝ ╚══╝╚═╝╚══╝╚══╝╚╩╩╝╚══╝     ╚══╝ ╚══╝    ╚═══╝╚═══╝    ╚═══╝╚═══╝ ╚╝╚╝       ╚╝  ╚╝╚══╝ ╚╝╚╝ ╚══╝╚╝ \n" +
                        Colors.PURPLE_BOLD_BRIGHT + "<$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$><$>\n");

        System.out.println(Colors.YELLOW_UNDERLINED + Colors.YELLOW_BOLD_BRIGHT);
        System.out.println("\uD835\uDC7B\uD835\uDC76\uD835\uDC6B\uD835\uDC68\uD835\uDC80\"\uD835\uDC7A \uD835\uDC74\uD835\uDC68\uD835\uDC79\uD835\uDC72\uD835\uDC6C\uD835\uDC7B \uD835\uDC7A\uD835\uDC75\uD835\uDC68\uD835\uDC77\uD835\uDC7A\uD835\uDC6F\uD835\uDC76\uD835\uDC7B\n");
    }

    private void menu() {
        //Scanner scanner = new Scanner(System.in); //console input
        System.out.println(Colors.BLUE + ".--------------.\n" +
                "| MENU OPTIONS |\n" +
                "'--------------'");
        System.out.println(Colors.GREEN_BOLD_BRIGHT);
        //int selection = 0;
        System.out.println("[1] Search for Stock\n" +
                "[2] Display List of Dow 30 Stocks\n" +
                "[3] Top Five DOW/ Market Mover\n" +
                "[4] Top Five DOW/ Market Looser\n" +
                "[x] - Quit\n\n");
        System.out.println(Colors.WHITE_BOLD_BRIGHT + "please select you option: ");
        //System.out.println("\n" + "\n" + "\n" + "\n" + "$░▒▓▆▅▃▂▁" + Colors.PURPLE_BRIGHT + "\uD835\uDC13\uD835\uDC21\uD835\uDC1A\uD835\uDC27\uD835\uDC24 \uD835\uDC32\uD835\uDC28\uD835\uDC2E \uD835\uDC1F\uD835\uDC28\uD835\uDC2B \uD835\uDC1C\uD835\uDC21\uD835\uDC28\uD835\uDC28\uD835\uDC2C\uD835\uDC22\uD835\uDC27\uD835\uDC20 \uD835\uDC28\uD835\uDC2E\uD835\uDC2B \uD835\uDC01\uD835\uDC12 \uD835\uDC13\uD835\uDC2B\uD835\uDC1A\uD835\uDC1C\uD835\uDC24\uD835\uDC1E\uD835\uDC2B" + Colors.GREEN_BOLD_BRIGHT + "▁▂▃▅▆▓▒░$");

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

}
