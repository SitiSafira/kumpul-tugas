package b3prak4a13020230217;

public class B3Prak4A13020230217 {

    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai();
        Dosen dosen = new Dosen();
        Staff staff = new Staff();
        
        dosen.nama = "Dra. Anisah";
        staff.nama = "Indri Ihsaniy";
        
        System.out.println("Nama Dosen : " + dosen.nama);
        System.out.print("Fakultas Dosen : ");
        dosen.tampilkanFakultas();
        
        System.out.println("\nNama Staff : " + staff.nama);
        System.out.print("Fakultas Staff : ");
        staff.tampilkanFakultas();
    }
    
}
