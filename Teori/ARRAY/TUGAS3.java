package ARRAY;

public class TUGAS3 {
    public static void main(String[] args) {
        String Nama[] = {"Yuzkin", "Salsa", "Eza"};
        String KodeBarang[] = {"A01", "B02", "C02"};
        String NamaBarang[] = new String[3];
        int Jumlah[] = {2, 1, 3};
        int Harga[] = new int[3];
        int Bayar[] = new int[3];

        for (int i = 0; i < 3; i++) {
            if (KodeBarang[i].equalsIgnoreCase("A01")) {
                NamaBarang[i] = "Hardisk";
                Harga[i] = 700000;
    
            } else if (KodeBarang[i].equalsIgnoreCase("B02")) {
                NamaBarang[i] = "Monitor";
                Harga[i] = 800000;

            } else if (KodeBarang[i].equalsIgnoreCase("C02")) {
                NamaBarang[i] = "Mouse";
                Harga[i] = 50000;
            }
            
            Bayar[i] = Harga[i] * Jumlah[i];
        }

        System.out.println("========================================================================================");
        System.out.println("No\tNama Pembeli\tKodeBarang\tNamaBarang\tJumlah\tHarga\tBayar");
        System.out.println("========================================================================================");

        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + "\t" + Nama[i] + "\t\t" + KodeBarang[i] + "\t\t" + NamaBarang[i] + "\t\t" + Jumlah[i] + "\t" + Harga[i] + "\t" + Bayar[i]);
        }
        System.out.println("=======================================================================================");
    }
}
