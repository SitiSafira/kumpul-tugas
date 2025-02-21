package perpustakaan;

public class Buku {
    public static int count = 0;
    public String title;
    public String author;
    
    public Buku(String title, String author){
        this.title = title;
        this.author = author;
        count++;
    }
}
