package b3prak4b13020230217;

public class B3Prak4B13020230217 {

    public static void main(String[] args) {
        Buku buku = new Buku();
        
        buku.setJudul("Pemrograman Berorientasi Objek");
        buku.setPenulis("Budi Raharjdo");
        buku.setHarga(60000);
        buku.setTahunRilis(2019);
        
        String judul = buku.getJudul();
        String penulis = buku.getPenulis();
        double harga = buku.getHarga();
        int tahunRilis = buku.getTahunRilis();
        
        System.out.println("Judul Buku: " + judul);
        System.out.println("penulis Buku: " + penulis);
        System.out.println("Harga Buku: " + harga);
        System.out.println("Tahun Rilis Buku: " + tahunRilis);
    }
    
}
