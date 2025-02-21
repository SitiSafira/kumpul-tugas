package b3prak5c13020230217;

public class B3Prak5C13020230217 {

    public static void main(String[] args) {
        Transportasi transportasi = new Transportasi("Kendaraan Laut");
        transportasi.jenisTransportasi();
        
        transportasi = new Mobil("Kendaraan Darat");
        transportasi.jenisTransportasi();
        
        transportasi = new Pesawat("Kendaraan Udara");
        transportasi.jenisTransportasi();
    }
    
}
