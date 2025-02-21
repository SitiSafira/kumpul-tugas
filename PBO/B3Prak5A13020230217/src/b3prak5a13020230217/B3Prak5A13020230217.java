package b3prak5a13020230217;

import b3prak5a13020230217.TransaksiGiro;
import b3prak5a13020230217.TransaksiTabungan;

public class B3Prak5A13020230217 {

    public static void main(String[] args) {
        TransaksiGiro transaksiGiro = new TransaksiGiro(5000000);
        transaksiGiro.setor(2000000);
        transaksiGiro.tarik(2000000);
        
        System.out.println("\n");
        
        TransaksiTabungan transaksiTabungan = new TransaksiTabungan(2000000);
        transaksiTabungan.setor(3000000);
        transaksiTabungan.tarik(250000);
    }
    
}
