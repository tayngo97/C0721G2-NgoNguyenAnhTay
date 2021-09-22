package LibrarySystem;

public class Newspaper extends Document {
    private int issueDate;

    public Newspaper(int id, String publicName, int numRelease, int issueDate) {
        super(id, publicName, numRelease);
        this.issueDate = issueDate;
    }

    public int getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(int issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "issueDate=" + issueDate +
                ", id='" + id + '\'' +
                ", publicName='" + publicName + '\'' +
                ", numRelease=" + numRelease +
                '}';
    }
}
