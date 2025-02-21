package b3prak5b13020230217;

public class B3Prak5B13020230217 {

    public static void main(String[] args) {
        Dosen dosen = new Dosen(1, "Mohandes Gandhi", 5000000, 500000);
        dosen.setJabatan("Dosen Tetap");
        dosen.detailKaryawan();
        System.out.println("Jabatan : " + dosen.getJabatan());
        dosen.totalGaji();
        
        System.out.println("\n");
        
        Staff staff = new Staff(2, "Jhon Dhoe", 2500000, 200000);
        staff.detailKaryawan();
        staff.updateBonus(300000);
        staff.totalGaji();
    }
    
}
