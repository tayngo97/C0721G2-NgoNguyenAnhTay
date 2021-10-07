public class Cinema implements Comparable<Cinema> {
    private String showTimeId;
    private String filmName;
    private String dateToShow;
    private String numberOfTicket;

    public Cinema(String showTimeId, String filmName, String dateToShow, String numberOfTicket) {
        this.showTimeId = showTimeId;
        this.filmName = filmName;
        this.dateToShow = dateToShow;
        this.numberOfTicket = numberOfTicket;
    }

    public String getShowTimeId() {
        return showTimeId;
    }

    public void setShowTimeId(String showTimeId) {
        this.showTimeId = showTimeId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getDateToShow() {
        return dateToShow;
    }

    public void setDateToShow(String dateToShow) {
        this.dateToShow = dateToShow;
    }

    public String getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(String numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "showTimeId='" + showTimeId + '\'' +
                ", filmName='" + filmName + '\'' +
                ", dateToShow='" + dateToShow + '\'' +
                ", numberOfTicket=" + numberOfTicket +
                '}';
    }

    public String stringToWrite() {
        return showTimeId + "," + filmName + "," + dateToShow + "," + numberOfTicket;
    }


    @Override
    public int compareTo(Cinema o) {
        if (showTimeId.equals(o.showTimeId))
            return 0;
        else return -1;
    }
}
