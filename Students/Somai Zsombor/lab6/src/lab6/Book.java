package lab6;

public class Book implements Comparible {
    private int numOfPages;

    public Book(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public boolean greaterThan(Object object) {
        if(object instanceof Book)
            return this.numOfPages > ((Book) object).getNumOfPages();
        else return false;
    }

    @Override
    public boolean smalerThan(Object object) {
        if(object instanceof Book)
            return this.numOfPages < ((Book) object).getNumOfPages();
        else return false;
    }

    @Override
    public String getData() {
        return  Integer.toString(this.numOfPages);
    }
}
