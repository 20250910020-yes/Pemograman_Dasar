package ARRAY;

import java.util.Scanner;

public class TUGAS1 {
public static void main(String[ ] args){
double[ ]NilaiAkhir=new double[5];
String NIM[]= new String[5];
String Nama[]=new String[5];
double UTS[]=new double[5]; 
double UAS[]=new double[5];
char[] Index=new char[5]; 

NIM[0]="001"; Nama[0]="Dadan"; UTS[0]=80; UAS[0]=80; NilaiAkhir[0]=80; Index[0]='A';
NIM[1]="002"; Nama[1]="Didin"; UTS[1]=75; UAS[1]=80; NilaiAkhir[1]=77.5; Index[1]='B';
NIM[2]="003"; Nama[2]="Deden"; UTS[2]=60; UAS[2]=80; NilaiAkhir[2]=65; Index[2]='C';
System.out.println("================================================================");
System.out.println("No\tNim\tNama\tUTS\tUAS\tNilaiAkhir\tIndex");
System.out.println("================================================================");
System.out.println("1\t"+NIM[0]+"\t"+Nama[0]+"\t"+UTS[0]+"\t"+UAS[0]+"\t"+NilaiAkhir[0]+"\t\t"+Index[0]);
System.out.println("2\t"+NIM[1]+"\t"+Nama[1]+"\t"+UTS[1]+"\t"+UAS[1]+"\t"+NilaiAkhir[1] +"\t\t"+Index[1]);
System.out.println("3\t"+NIM[2]+"\t"+Nama[2]+"\t"+UTS[2]+"\t"+UAS[2]+"\t"+NilaiAkhir[2] +"\t\t"+Index[2]);
System.out.println("================================================================");
}
}

