package Modul_3;
import java.util.Scanner;
public class LatihanMOD3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String Karyawan[][];
        int jumlah;
        System.out.println("DATA GAJI KARYAWAN");
        System.out.print("Jumlah Karyawan : ");
        jumlah = Integer.parseInt(input.nextLine());
        Karyawan = new String[jumlah][6];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Karyawan ke -" + (i + 1));
            System.out.print("NAMA : ");
            Karyawan[i][0] = input.nextLine();
            System.out.print("JABATAN : ");
            Karyawan[i][1] = input.nextLine();
            System.out.print("GAPOK : ");
            Karyawan[i][2] = input.nextLine();
            System.out.print("TUNJANGAN : ");
            Karyawan[i][3] = input.nextLine();

        }
        System.out.print("\nNo.\tNAMA\tJABATAN\tGAPOK\tTUNJANGAN\n");
        for (int i = 0; i < jumlah; i++) {
            Long gapok = Long.parseLong(Karyawan[i][2]);
            Long tunjangan = Long.parseLong(Karyawan[i][3]);
            System.out.println((i + 1) + "\t" + Karyawan[i][0] + "\t" + Karyawan[i][1] + "\t" + Karyawan[i][2] + "\t" + Karyawan[i][3]);
        }
    }
}
