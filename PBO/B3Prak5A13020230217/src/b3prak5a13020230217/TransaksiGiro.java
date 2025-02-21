package b3prak5a13020230217;

public class TransaksiGiro implements Transaksi{
    
    int saldo;
    
    public TransaksiGiro(int saldo){
        this.saldo = saldo;
    }
    
    @Override
    public void tarik(int nominal) {
        if (nominal > saldo){
            System.out.println("Maaf, saldo tabugan anda tidak mencukupi");
        } else {
            saldo = saldo - nominal;
            System.out.println("Penarikan berhasil, saldo giro saat ini : " + saldo);
        }
    }

    @Override
    public void setor(int nominal) {
        saldo =  saldo + nominal;
        System.out.println("Setoran berhasil, saldo giro saat ini : " + saldo);
    }
    
}
