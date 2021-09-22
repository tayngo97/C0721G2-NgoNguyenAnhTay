package LibrarySystem;

public class Document {
    protected int id ;
    protected String publicName;
    protected int numRelease;

    public Document(int id, String publicName, int numRelease) {
        this.id = id;
        this.publicName = publicName;
        this.numRelease = numRelease;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpublicName() {
        return publicName;
    }

    public void setpublicName(String publicName) {
        this.publicName = publicName;
    }

    public int getNumRelease() {
        return numRelease;
    }

    public void setNumRelease(int numRelease) {
        this.numRelease = numRelease;
    }
}
