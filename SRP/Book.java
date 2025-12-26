package SRP;
public class Book {
private String title;
private String author;
private String content;

public Book(String title, String author, String content) {
   this.title = title;
   this.author = author;
   this.content = content; }

 //  Gérer les données du livre
   public String getTitle() { return title; }
   public String getAuthor() { return author; }
   public String getContent() { return content; }

 //  Afficher le livre (présentation)
   public void printToScreen() {
   System.out.println("Titre: " + title);
   System.out.println("Auteur: " + author);
   System.out.println("Contenu: " + content); }

//  Sauvegarder le livre (persistance)
   public void saveToDatabase() {
   System.out.println("Sauvegarde du livre '" + title + "' en base de données..."); }

//  (logique métier)
   public void emprunter(String lecteur) {
   System.out.println("Emprunt du livre '" + title + "' par " + lecteur); } }




// Utilisation de la classe Book
   class Main {
      public static void main(String[] args) {
         Book book = new Book("Les principes SOLID", "Etudiants de M1-GL"," Contenu du livre...");
         book.printToScreen();
         book.saveToDatabase();
         book.emprunter("Marcial");
      }
   } 