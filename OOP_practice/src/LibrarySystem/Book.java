package LibrarySystem;

public class Book  extends Document{
    private String athorName;
    private int numPage;

    public Book(int id, String publicName, int numRelease, String athorName, int numPage) {
        super(id, publicName, numRelease);
        this.athorName = athorName;
        this.numPage = numPage;
    }

    public String getAthorName() {
        return athorName;
    }

    public void setAthorName(String athorName) {
        this.athorName = athorName;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "athorName='" + athorName + '\'' +
                ", numPage=" + numPage +
                ", id='" + id + '\'' +
                ", publicName='" + publicName + '\'' +
                ", numRelease=" + numRelease +
                '}';
    }
}
