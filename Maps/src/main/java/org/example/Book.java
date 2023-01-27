package org.example;

public class Book {
    private String title, author, genre;
    private int ISBN;

    public Book(String t, String a, String g, int i){
        title = t;
        author = a;
        genre = g;
        ISBN = i;
    }

    //getters and setters
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    // a toString


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }

    //GOAL: Combine THIS book with ANOTHER book to make MEGA books
    //Post-Condition: Both objects will contain combined data
    //b1.combine(b2);
    //b1 -> the this
    //b2 -> my parameter
    //Return the updated title
    public String combine(Book other){
        String newTitle = this.title + " & " + other.getTitle();
        String newAuthor = this.getAuthor() + " & " + other.getAuthor();
        String newGenre = this.genre + " & " + other.genre;
        int newISBN = ISBN + other.ISBN; //as tacky as it gets

        this.title = newTitle;
        this.setAuthor(newAuthor);
        genre = newGenre;
        setISBN(newISBN);

        other.title = newTitle;
        other.author = newAuthor;
        other.setGenre(newGenre);
        other.setISBN(newISBN);

        return newTitle;
    }

    @Override
    public boolean equals(Object other){
        //reflexivity
        if (this == other){ //compare memory address
            return true;
        }
        //non-nullity
        if (other == null){
            return false;
        }
        //logical equality (seeing if the data is the same)
        //instanceof is a boolean operator (kinda like ==)
        //variable instanceof ClassName (that will result in a true or false)
        //In English: if other is not a book, return false
        if ( ! (other instanceof Book)){
            return false;
        }

        //Type-Cast to MyClass
        //In general: MyClass otherObject = (MyClass) other;
        Book otherBook = (Book) other;


        return this.title.equals(otherBook.title) &&
                this.author.equals(otherBook.getAuthor()) &&
                this.genre.equals(otherBook.genre) &&
                this.ISBN == otherBook.ISBN;

    }

}
