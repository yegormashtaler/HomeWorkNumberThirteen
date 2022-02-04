package main.java.org.ithillel.lessons;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        inputUserDataAndPrintOtherMethod();
    }

    public static void calculationMethod(int ticketNumber, int clientOfAccount, int agencyOfAccount, double ticketPriceToUSA, double ticketPriceToGermany, double ticketPriceToFrance, double ticketPriceToItaly, double ticketPriceToCanada, double ticketPriceToRussia) {
        System.out.println();
        for (int i = ticketNumber; i < ticketPriceToUSA; i+=36.1863) {
            System.out.println("> " + "The transfer of funds to the client's account will be made as many times as the number of tickets" + "Your account has been " + clientOfAccount + ", the refundable cost of one ticket will be reduced tenfold, Your account has become: " + i + "$");
            System.out.println();
            System.out.println("> " + "The transfer of funds to the agency account will be made as many times as the number of tickets" + "Your account has been " + agencyOfAccount + ", the refundable cost of one ticket will be reduced tenfold, Your account has become: " + i + "$");
            ticketNumber++;
        }
        for (int i = ticketNumber; i < ticketPriceToGermany; i+=29.8565) {
            System.out.println("> " + "The transfer of funds to the client's account will be made as many times as the number of tickets" + "Your account has been " + clientOfAccount + ", the refundable cost of one ticket will be reduced tenfold, Your account has become: " + i + "$");
            System.out.println();
            System.out.println("> " + "The transfer of funds to the agency account will be made as many times as the number of tickets" + "Your account has been " + agencyOfAccount + ", the refundable cost of one ticket will be reduced tenfold, Your account has become: " + i + "$");
            ticketNumber++;
        }
        for (int i = ticketNumber; i < ticketPriceToFrance; i+=27.5744) {
            System.out.println("> " + "The transfer of funds to the client's account will be made as many times as the number of tickets" + "Your account has been " + clientOfAccount + ", the refundable cost of one ticket will be reduced tenfold, Your account has become: " + i + "$");
            System.out.println();
            System.out.println("> " + "The transfer of funds to the agency account will be made as many times as the number of tickets" + "Your account has been " + agencyOfAccount + ", the refundable cost of one ticket will be reduced tenfold, Your account has become: " + i + "$");
            ticketNumber++;
        }
        for (int i = ticketNumber; i < ticketPriceToItaly; i+=17.3477) {
            System.out.println("> " + "The transfer of funds to the client's account will be made as many times as the number of tickets" + "Your account has been " + clientOfAccount + ", the refundable cost of one ticket will be reduced tenfold, Your account has become: " + i + "$");
            System.out.println();
            System.out.println("> " + "The transfer of funds to the agency account will be made as many times as the number of tickets" + "Your account has been " + agencyOfAccount + ", the refundable cost of one ticket will be reduced tenfold, Your account has become: " + i + "$");
            ticketNumber++;
        }
        for (int i = ticketNumber; i < ticketPriceToCanada; i+=14.3663) {
            System.out.println("> " + "The transfer of funds to the client's account will be made as many times as the number of tickets" + "Your account has been " + clientOfAccount + ", the refundable cost of one ticket will be reduced tenfold, Your account has become: " + i + "$");
            System.out.println();
            System.out.println("> " + "The transfer of funds to the agency account will be made as many times as the number of tickets" + "Your account has been " + agencyOfAccount + ", the refundable cost of one ticket will be reduced tenfold, Your account has become: " + i + "$");
            ticketNumber++;
        }
        for (int i = ticketNumber; i < ticketPriceToRussia; i+=12.8573) {
            System.out.println("> " + "The transfer of funds to the client's account will be made as many times as the number of tickets" + "Your account has been " + clientOfAccount + ", the refundable cost of one ticket will be reduced tenfold, Your account has become: " + i + "$");
            System.out.println();
            System.out.println("> " + "The transfer of funds to the agency account will be made as many times as the number of tickets" + "Your account has been " + agencyOfAccount + ", the refundable cost of one ticket will be reduced tenfold, Your account has become: " + i + "$");
            ticketNumber++;
        }
    }

    public static void printCheckTicketCount(int ticketNumber, int numberOfPassengers) {
        if (ticketNumber > numberOfPassengers) {
            System.out.println("> " + "The number of tickets is more than the number of passengers!");
            System.out.println();
        }
        if (ticketNumber < numberOfPassengers) {
            System.out.println();
            System.out.println("> " + "The number of tickets is less than the number of passengers!");
            System.out.println();
            System.out.println("> " + "Sorry, but the program stops working because there are not enough tickets!");
            System.out.println();
        }
        if (ticketNumber == numberOfPassengers) {
            System.out.println("> " + "The number of tickets is equal to the number of passengers!");
            System.out.println();
        }
    }

    public static void inputUserDataAndPrintOtherMethod() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.print("> " + "Enter your first and last name: ");
            String name = String.valueOf(getStringUserData(scanner));
            System.out.println();
            System.out.println("> " + "Welcome, dear " + name + "!");
            System.out.println();
            System.out.println("> " + "Please, input ticket count: ");
            int ticketNumber = getUserData(scanner);
            if (ticketNumber > 0) {
                System.out.println();
                System.out.println("> " + "My dear friend, " + name + ", you need " + ticketNumber + " tickets!");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("> " + "Dear " + name + ", you input incorrect data!");
                break;
            }
            System.out.print("> " + "Enter your number of passengers: ");
            int numberOfPassengers = getUserData(scanner);
            if (numberOfPassengers > 0) {
                System.out.println();
                System.out.println("> " + "My dear friend, " + name + ", you need " + numberOfPassengers + " tickets!");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("> " + "Dear " + name + ", you input incorrect data!");
                break;
            }
            System.out.println();
            printCheckTicketCount(ticketNumber, numberOfPassengers);
            System.out.print("> " + "Enter the balance in your account: " + "$");
            int balance = scanner.nextInt();
            System.out.println();
            System.out.println("> " + "Dear " + name + ", please take a choose from:\n" + "1 - United States of America\n" + "2 - Germany\n" + "3 - France\n" + "4 - Italy\n" + "5 - Canada\n" + "6 - Russia\n");
            System.out.print("> " + "Choose your country/city by number: ");
            int country = scanner.nextInt();
            double discount = 0.2;
            double ticketPriceToUSA = 0;
            double ticketPriceToGermany = 0;
            double ticketPriceToFrance = 0;
            double ticketPriceToItaly = 0;
            double ticketPriceToCanada = 0;
            double ticketPriceToRussia = 0;
            switch (country) {
                case 1 -> {
                    System.out.println();
                    String cityUSA = "United States of America";
                    ticketPriceToUSA = 3618.63;
                    double fullPriceToUSA = calculateTicketPrice(numberOfPassengers, ticketPriceToUSA, discount);
                    printFullPrice(fullPriceToUSA, cityUSA);
                }
                case 2 -> {
                    System.out.println();
                    String cityGermany = "Germany";
                    ticketPriceToGermany = 2985.65;
                    double fullPriceToGermany = calculateTicketPrice(numberOfPassengers, ticketPriceToGermany, discount);
                    printFullPrice(fullPriceToGermany, cityGermany);
                }
                case 3 -> {
                    System.out.println();
                    String cityFrance = "France";
                    ticketPriceToFrance = 2757.44;
                    double fullPriceToFrance = calculateTicketPrice(numberOfPassengers, ticketPriceToFrance, discount);
                    printFullPrice(fullPriceToFrance, cityFrance);
                }
                case 4 -> {
                    System.out.println();
                    String cityItaly = "Italy";
                    ticketPriceToItaly = 1734.78;
                    double fullPriceToItaly = calculateTicketPrice(numberOfPassengers, ticketPriceToItaly, discount);
                    printFullPrice(fullPriceToItaly, cityItaly);
                }
                case 5 -> {
                    System.out.println();
                    String cityCanada = "Canada";
                    ticketPriceToCanada = 1436.63;
                    double fullPriceToCanada = calculateTicketPrice(numberOfPassengers, ticketPriceToCanada, discount);
                    printFullPrice(fullPriceToCanada, cityCanada);
                }
                case 6 -> {
                    System.out.println();
                    String cityRussia = "Russia";
                    ticketPriceToRussia = 1285.73;
                    double fullPriceToRussia = calculateTicketPrice(numberOfPassengers, ticketPriceToRussia, discount);
                    printFullPrice(fullPriceToRussia, cityRussia);
                }
                default -> {
                    System.out.println("> " + "Sorry, dear " + name + ", your enter incorrect data!");
                    System.out.println();
                }
            }
            int ticketCount = 100;
            int availableOne = checkAvailableTickets(ticketCount, numberOfPassengers);
            printResultTicketCheckOne(availableOne, country);
            int availableTwo = checkAvailableMoneyForTickets(balance, ticketCount);
            printResultTicketCheckTwo(availableTwo, country);
            methodOfVerification(availableOne, availableTwo);
            printCheckingTheNumberOfTicketsAndNumberOfPassengers(numberOfPassengers, ticketCount);
            printDialogs(name, country, numberOfPassengers, balance);
            final int clientOfAccount = 0;
            final int agencyOfAccount = 0;
            calculationMethod(ticketNumber, clientOfAccount, agencyOfAccount, ticketPriceToUSA, ticketPriceToGermany, ticketPriceToFrance, ticketPriceToItaly, ticketPriceToCanada, ticketPriceToRussia);
            scanner.close();
            break;
        }
    }

    public static String getStringUserData(Scanner scanner) {
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        }
        return String.valueOf(-1);
    }

    public static int getUserData(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            return -1;
        }
    }

    public static void printCheckingTheNumberOfTicketsAndNumberOfPassengers(int numberOfPassengers, int ticketCount) {
        if (ticketCount > numberOfPassengers) {
            System.out.println();
            System.out.println("> " + "There are more tickets than passengers! You can buy all available tickets!");
            System.out.println();
        }
        if (ticketCount < numberOfPassengers) {
            System.out.println();
            System.out.println("> " + "The number of tickets is less than the number of passengers! Unfortunately, you cannot buy all the tickets that are in stock!");
            System.out.println();
        }
        if (ticketCount == numberOfPassengers) {
            System.out.println();
            System.out.println("> " + "You're lucky! You are lucky! Your balance matches the price of all tickets! You can buy all tickets!");
            System.out.println();
        }
    }

    public static int checkAvailableTickets(int ticketCount, int numberOfPassengers) {
        if (ticketCount > numberOfPassengers) {
            return 1;
        }
        if (ticketCount < numberOfPassengers) {
            return 0;
        }
        return -1;
    }

    public static void printResultTicketCheckOne(int availableOne, int country) {
        if (availableOne == 1) {
            System.out.println("> " + "The number of tickets is more than the number of passengers! You will be able to fly to " + country);
            System.out.println();
        }
        if (availableOne == 0) {
            System.out.println("> " + "The number of tickets is less than the number of passengers! Sorry, but you cannot fly to " + country);
            System.out.println();
        }
        if (availableOne == -1) {
            System.out.println("> " + "The number of tickets is equal to the number of passengers! You're in luck, there are only last tickets left! You will be able to fly to " + country);
            System.out.println();
        }
    }

    public static void printResultTicketCheckTwo(int availableTwo, int country) {
        if (availableTwo == 1) {
            System.out.println("> " + "Your balance is greater than the price of the ticket where you want to fly to " + country);
            System.out.println();
        }
        if (availableTwo == 0) {
            System.out.println("> " + "Sorry, but your balance is less than the price of the ticket you want to fly to " + country);
        }
        if (availableTwo == -1) {
            System.out.println("> " + "Your balance is equal to the ticket price where you want to fly to " + country);
            System.out.println();
        }
        System.out.println("> " + "The program informs about the possibility of purchasing tickets, with a sufficient amount of available funds and available tickets on the account!");
        System.out.println();
    }

    public static int checkAvailableMoneyForTickets(int balance, double fullPrice) {
        if (balance >= fullPrice) {
            return 1;
        }
        if (balance <= fullPrice) {
            return 0;
        }
        return -1;
    }

    public static void methodOfVerification(int availableOne, int availableTwo) {
        if (availableOne > 0 && availableTwo > 0) {
            System.out.println("> " + "Successful message!");
        } else {
            System.out.println("> " + "Unsuccessful message!");
        }
    }

    public static void printFullPrice(double fullPrice, String city) {
        System.out.println("> " + "Full price to " + city + " is = " + fullPrice + "$");
        System.out.println();
    }

    public static double calculateTicketPrice(int numberOfPassengers, double price, double discount) {
        double fullPrice = numberOfPassengers * price;
        return fullPrice * discount;
    }

    public static void printDialogs(String name, int country, int numberOfPassengers, int balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("> " + "Your first and last name is: " + name);
        System.out.println();
        System.out.println("> " + "You have chosen the direction is: " + country);
        System.out.println();
        System.out.println("> " + "You have selected the number of passengers is: " + numberOfPassengers);
        System.out.println();
        System.out.println("> " + "You entered this amount of balance is: " + balance + "$");
        scanner.close();
    }
}