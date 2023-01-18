package Encapsulation;

public class PrinterMain {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("Initial printed page count is " + printer.getPagesPrinted());

        printer.printPages(5);
        System.out.println("New total print count is " + printer.getPagesPrinted());
        printer.printPages(7);
        System.out.println("New total print count is " + printer.getPagesPrinted());
    }
}
