package LibrarySystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LibrarySystem {
    private Collection<Document> documents ;

    public LibrarySystem() {
        this.documents = new ArrayList<Document>();
    }

    public void addDocument(Document document){
        this.documents.add(document);
    }

    public boolean deleteDocument(int id) {
        Document doc = this.documents.stream().filter(document -> (document.getId()==(id))).findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.documents.remove(doc);
        return true;
    }


    public void showInfo(){
        this.documents.forEach(document -> System.out.println(document + " "));
    }

    public void searcByBook(){
         this.documents.stream().filter(document -> document instanceof Book).forEach(document -> System.out.println(document.toString()));
    }

    public void searcByJournal(){
        for (Document e: documents) {
            if (e instanceof Journal) System.out.println(e);;
        }
    }

    public void searchByNews(){
        for (Document e: documents) {
            if (e instanceof Newspaper) System.out.println(e);
        }
    }




}
