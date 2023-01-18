package Composition;

public class PcMain {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(45, 30, 22);
        Case theCase = new Case("220B", "Dell", "400W", dimensions);
        Monitor theMonitor = new Monitor("27-inch", "Samsung", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-219", "MSI", 8, 6, "v2.61");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Kali Linux");
        thePC.getPcCase().pressPowerButton();

    }

}
