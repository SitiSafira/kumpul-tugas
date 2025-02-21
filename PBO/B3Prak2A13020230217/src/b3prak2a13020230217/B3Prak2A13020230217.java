package b3prak2a13020230217;

public class B3Prak2A13020230217 {
    
    int[][] dataPenjualan = {
        {15, 20, 30},
        {15, 25, 35},
        {20, 30, 40},
        {25, 35, 45},
        {30, 40, 50},
        {35, 45, 55},
        {35, 50, 60}
    };

    public int[] hitungTotalPenjualanPerJenisBaju(){
        int[] totalPenjualanPerJenisBaju = new int[dataPenjualan[0].length];
        for (int i = 0; i < dataPenjualan.length; i++){  // Replaced 'lengkapi' with dataPenjualan.length
            for (int j = 0; j < dataPenjualan[i].length; j++){
                totalPenjualanPerJenisBaju[j] += dataPenjualan[i][j];
            }
        }
        return totalPenjualanPerJenisBaju;
    }

    public int hitungTotalPenjualanSelamaSatuMinggu(){
        int[] totalPenjualanPerJenisBaju = hitungTotalPenjualanPerJenisBaju();
        int totalPenjualan = 0;
        for (int i = 0; i < totalPenjualanPerJenisBaju.length; i++){
            totalPenjualan += totalPenjualanPerJenisBaju[i];  // Added sum of totalPenjualan
        }
        return totalPenjualan;
    }

    public static void main(String[] args) {
        B3Prak2A13020230217 penjualanBaju = new B3Prak2A13020230217();
        int[] totalPenjualanPerJenisBaju = penjualanBaju.hitungTotalPenjualanPerJenisBaju();
        int totalPenjualan = penjualanBaju.hitungTotalPenjualanSelamaSatuMinggu();
        
        System.out.println("Total penjualan baju jenis A: " + totalPenjualanPerJenisBaju[0]);
        System.out.println("Total penjualan baju jenis B: " + totalPenjualanPerJenisBaju[1]);
        System.out.println("Total penjualan baju jenis C: " + totalPenjualanPerJenisBaju[2]);
        System.out.println("Total penjualan selama satu minggu: " + totalPenjualan);  // Display total penjualan
    }
}