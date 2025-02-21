package b3prak4b13020230217;

class Buku {
    private String judul;
    private String penulis;
    private int tahunRilis;
    private int harga;

    Buku() {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunRilis = tahunRilis;
        this.harga = harga;
    }

    
    public String getJudul(){
        return judul;
    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    
    public String getPenulis(){
        return this.penulis;
    }
    
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    
    public int getTahunRilis(){
        return this.tahunRilis;
    }
    
    public void setTahunRilis(int tahunRilis){
        this.tahunRilis = tahunRilis;
    }
    
    public int getHarga(){
        return this.harga;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
}
