package LibrarySystem;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibrarySystem librarySystem = new LibrarySystem();

        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1.Add new document");
            System.out.println("2.Delete document");
            System.out.println("3.Show infor document");
            System.out.println("4.Search document");
            System.out.println("5.Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter type of document ");
                    System.out.println("1.Book");
                    System.out.println("2.Journal");
                    System.out.println("3.Newspaper");
                    int choice1 = scanner.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.println("Enter id");
                            int id = scanner.nextInt();
                            System.out.println("Enter public name");
                            scanner.nextLine();
                            String publicName = scanner.nextLine();
                            System.out.println("Enter numRelease");
                            int numRelease = scanner.nextInt();
                            System.out.println("Enter athorName");
                            scanner.nextLine();
                            String athorName = scanner.nextLine();
                            System.out.println("Enter numPage");
                            int numPage = scanner.nextInt();
                            Book book = new Book(id, publicName, numRelease, athorName, numPage);
                            librarySystem.addDocument(book);
                            System.out.println(book);
                            break;
                        case 2:
                            System.out.println("Enter id");
                            int id1 = scanner.nextInt();
                            System.out.println("Enter public name");
                            scanner.nextLine();
                            String publicName1 = scanner.nextLine();
                            System.out.println("Enter numRelease");
                            int numRelease1 = scanner.nextInt();
                            System.out.println("Enter issueNumber");
                            int issueNumber = scanner.nextInt();
                            System.out.println("Enter issueMonth");
                            int issueMonth = scanner.nextInt();
                            Journal journal = new Journal(id1, publicName1, numRelease1, issueNumber, issueMonth);
                            librarySystem.addDocument(journal);
                            System.out.println(journal);
                            break;
                        case 3:
                            System.out.println("Enter id");
                            int id2 = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter public name");
                            String publicName2 = scanner.nextLine();
                            System.out.println("Enter numRelease");
                            int numRelease2 = scanner.nextInt();
                            System.out.println("Enter issueDate");
                            int issueDate = scanner.nextInt();
                            Newspaper newspaper = new Newspaper(id2, publicName2, numRelease2, issueDate);
                            librarySystem.addDocument(newspaper);
                            System.out.println(newspaper);
                            break;
                        default:
                            continue;
                    }
                    break;
                case 2:
                    System.out.println("Enter id to delete");
                    int id = scanner.nextInt();
                    librarySystem.deleteDocument(id);
                    librarySystem.showInfo();
                    break;
                case 3:
                    librarySystem.showInfo();
                    break;
                case 4:
                    System.out.println("1.BOOK");
                    System.out.println("2.JOURNAL");
                    System.out.println("3.NEWSPAPER");
                    int choice2 = scanner.nextInt();
                    switch (choice2) {
                        case 1:
                            librarySystem.searcByBook();
                            break;
                        case 2:
                            librarySystem.searcByJournal();
                            break;
                        case 3:
                            librarySystem.searchByNews();
                            break;
                        default:
                            System.out.println("Invalid");
                            continue;
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
