package ARRAY;

public class TUGAS2 {
    public static void main(String[] args) {
        String Nama[] = {"Yuzkin", "Salsa", "Eza"};
        String Jurusan[] = {"Bandung", "Jakarta", "Bandung"};
        String Kelas[] = {"Ekonomi", "Bisnis", "Bisnis"};
        int JumlahTiket[] = {2, 1, 3};
        int Harga[] = new int[3];
        int Bayar[] = new int[3];

        for (int i = 0; i < 3; i++) {
            if (Kelas[i].equalsIgnoreCase("Bisnis")) {
                if (Jurusan[i].equalsIgnoreCase("Bandung")) {
                    Harga[i] = 40000;
                } else {
                    Harga[i] = 60000;
                }
            } else if (Kelas[i].equalsIgnoreCase("Ekonomi")) {
                if (Jurusan[i].equalsIgnoreCase("Bandung")) {
                    Harga[i] = 20000;
                } else {
                    Harga[i] = 40000;
                }   
            }
            
            Bayar[i] = Harga[i] * JumlahTiket[i];
        }

        System.out.println("========================================================================================");
        System.out.println("No\tNama Pembeli\tJurusan\t\tKelas\t\tJumTiket\tHarga\tBayar");
        System.out.println("========================================================================================");

        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + "\t" + Nama[i] + "\t\t" + Jurusan[i] + "\t\t" + Kelas[i] + "\t\t" + JumlahTiket[i] + "\t\t" + Harga[i] + "\t" + Bayar[i]);
        }
            System.out.println("=======================================================================================");
    }
}
