public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        if (tonerLevel > 100 || tonerLevel < 0) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {

        if (tonerAmount > 100 || tonerAmount <= 0) {
            return -1;
        } else {
            if (tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                tonerLevel += tonerAmount;
            }
        }
        return tonerLevel;
    }

    public int printPages(int pages) {

        int pagesToPrint = pages;

        if (duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = (pages / 2) + (pages % 2);
        }

        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }


    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
