package LibrarySystem;

public class Journal extends Document {
    private int issueNumber;
    private int issueMonth;

    public Journal(int id, String publicName, int numRelease, int issueNumber, int issueMonth) {
        super(id, publicName, numRelease);
        this.issueNumber = issueNumber;
        this.issueMonth = issueMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getIssueMonth() {
        return issueMonth;
    }

    public void setIssueMonth(int issueMonth) {
        this.issueMonth = issueMonth;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "issueNumber=" + issueNumber +
                ", issueMonth=" + issueMonth +
                ", id='" + id + '\'' +
                ", publicName='" + publicName + '\'' +
                ", numRelease=" + numRelease +
                '}';
    }
}
