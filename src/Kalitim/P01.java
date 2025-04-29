package Kalitim;

public class P01 {

       package Kalitim;
class Machine {    String manufacturer;
    Machine() {
        this("Unknown Manufacturer");
        System.out.println("Machine parametresiz constructor");
    }
    Machine(String manufacturer) {
        this.manufacturer = manufacturer;
        System.out.println("Machine parametreli constructor");    }
}class Printer extends Machine {
    int pagesPerMinute;    Printer() {
        this(10);
        System.out.println("Printer parametresiz constructor");
    }
    Printer(int pagesPerMinute) {
        super("PrinterCorp");
        this.pagesPerMinute = pagesPerMinute;
        System.out.println("Printer parametreli constructor");
    }}
    class LaserPrinter extends Printer {
    boolean duplex;    LaserPrinter() {
        super(20);
        this.duplex = true;
        System.out.println("LaserPrinter parametresiz constructor");
    }
    LaserPrinter(int pagesPerMinute, boolean duplex) {
        super(pagesPerMinute);
        this.duplex = duplex;
        System.out.println("LaserPrinter parametreli constructor");
    }
    void printInfo() {
        System.out.println("Manufacturer: " + manufacturer + ", Speed: " + pagesPerMinute + " ppm, Duplex: " + duplex);    }}
    /*        public static void main(String[] args) {
    LaserPrinter lp = new LaserPrinter(30, true);
    lp.printInfo();        } */
}
