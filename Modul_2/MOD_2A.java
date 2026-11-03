public class MOD_2A {
    public static void main(String[] args) {
        String mk = "Pemrograman Dasar";
        double nilai_uts = 95.5;
        String nilai_Uas = "85.5";
        double nalai_akhir = (nilai_uts + Double.parseDouble(nilai_Uas)) / 2;
        System.out.println("Nama Matakuliah\t : " + mk);
        System.out.println("Nilai Akhir\t : " + nalai_akhir);
    }
}