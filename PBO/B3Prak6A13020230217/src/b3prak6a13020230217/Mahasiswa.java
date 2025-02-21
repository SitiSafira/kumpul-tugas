package b3prak6a13020230217;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private List<MataKuliah> mataKuliah;
    
    public Mahasiswa(String nama, String nim, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.mataKuliah = new ArrayList<>();
    }
    
    public void tambahMataKuliah(MataKuliah newMataKuliah){
        this.mataKuliah.add(newMataKuliah);
    }
    
    public void infoMahasiswa(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Nim : " + this.nim);
        System.out.println("Prodi : " + this.prodi);
        
        System.out.println("\nsa===== MATA KULIAH =====");
        for (MataKuliah mataKuliah : this.mataKuliah){
            System.out.println(mataKuliah.namaMataKuliah + " (" + mataKuliah.sks + " SKS)");
        }
    }
    
    public static class MataKuliah{
        private String namaMataKuliah;
        private int sks;
        
        public MataKuliah(String namaMataKuliah, int sks){
            this.namaMataKuliah = namaMataKuliah;
            this.sks = sks;
        }
    }
}
