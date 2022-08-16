package com.analyzer.stock;

import java.util.Scanner;

public class FrontPage {

    Colors colors = new Colors();//color initialize

    public void execute() {
        welcome();
        menu();
        main();
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


        //selection = scanner.nextInt();
        //return selection;
    }

    private void main() {
        Scanner scanner = new Scanner(System.in); //console input
        int option = 1;
        while (option != 5) {//!= es diferente
            //menu();

            try {
                option = scanner.nextInt(); //by utilizing this can possibly give me an error if number not used
                switch (option) {
                    case 1:
                        option1();
                        break;
                    case 2:
                        option2();
                        break;
                    case 3:
                        option3();
                        break;
                    case 4:
                        option4();
                        break;
                    case 5:
                        //exit(0);
                        System.out.println("shutting off");
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid option number");
                //scanner.next();
            }
        }
    }

    private void option1() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("search for stock");
        Scanner scanner = new Scanner(System.in);
        String stock = scanner.nextLine();
        System.out.println("Stock Searched: " + stock + "\n\n");
        System.out.println("xxxx     xxxx     xxxx     xxxx\n\n");
        System.out.println("xxxx     xxxx     xxxx     xxxx\n\n");

    }

    private void option2() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Thanks for choosing option 2\n\n\n\n\n\n\n\n\n\n\n");

    }

    private void option3() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Thanks for choosing option 3\n\n\n\n\n\n\n\n\n\n\n");
    }

    private void option4() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Thanks for choosing option 4");
    }
}
