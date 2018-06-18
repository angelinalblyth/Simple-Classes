public class Printer {

    private int paper;
    private int pages;
    private int copies;

    public Printer(int paper, int pages, int copies){
        this.paper = paper;
        this.pages = pages;
        this.copies = copies;
    }

    public int getSheets(){
        return this.paper;
    }

    public int printed() {
        return this.pages * this.copies;
    }

    public int printNew(){
      return this.paper -= printed();
    }



    public boolean enoughPaper(){
        if (this.paper >= printed()){
            return true;
        } else {
            return false;
        }
    }


}