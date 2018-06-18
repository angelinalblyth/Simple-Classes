public class Printer {

    private int paper;
    private int pages;
    private int copies;
    private int toner;


    public Printer(int paper, int pages, int copies, int toner){
        this.paper = paper;
        this.pages = pages;
        this.copies = copies;
        this.toner = toner;
    }

    public int getSheets(){
        return paper;
    }

    public int printed() {
        return pages * copies;
    }


    public int subtractToner() {
        return toner -= pages;
    }


//    public boolean enoughPaper(){
//        if (paper >= printed()){
//            return true;
//        } else {
//            return false;
//        }
//    }

    public int print(){
        if (paper >= printed()){
            return paper -= printed();
        } else {
            return paper;
        }

    }

    public int refill() {
        return paper = 500;
    }
}