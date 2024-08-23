
import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        
        System.out.println("Alat Penghitung Gaji");

        System.out.println("Masukkan Tarif/Gaji PerJam Anda");
        double tarif = new Scanner (System.in).nextDouble();

        System.out.println("Masukkan Jam kerja Anda");
        double jam = new Scanner (System.in).nextDouble();


        //saya ini melihat/meniru rumus hitungan dari Didaq
        double gaji = (tarif * jam) - ((tarif * jam) * 10/100);

        System.out.println("Gaji Anda Adalah " + gaji);
        }
    
}
