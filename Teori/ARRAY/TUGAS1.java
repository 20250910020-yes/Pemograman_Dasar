package ARRAY;

public class TUGAS1{
    public static void main(String[] args){
        String NIM []={"001", "002", "003"};
        String Nama[]={"Dadan","Didin","Deden"};
        double UTS[]={80, 75, 60};
        double UAS[]={80, 80, 80};
        double NilaiAkhir[]= new double[3];
        char  Index[]= new char[3];

        for (int i = 0; i < 3; i++) {
            NilaiAkhir[i] = (UTS[i] * 0.5) + (UAS[i] * 0.5);

            if (NilaiAkhir[i] >= 80) {
                Index[i] = 'A';
            } else if (NilaiAkhir[i] >= 70) {
                Index[i] = 'B';
            } else if (NilaiAkhir[i] >= 60) {
                Index[i] = 'C';
            } else {
                Index[i] = 'D';
            }
        }
        
        System.out.println("=============================================================");
        System.out.println("No\tNIM\tNama\tUTS\tUAS\tNilaiAkhir\tIndex");
        System.out.println("=============================================================");  
    
        for(int i = 0; i < 3; i++) {
            System.out.println((i+1) + "\t" + NIM[i] + "\t"
                + Nama[i] + "\t" + UTS[i] + "\t"
                + UAS[i] + "\t" + NilaiAkhir[i] + "\t\t" + Index[i]);
        }

        System.out.println("=============================================================");
    }
}