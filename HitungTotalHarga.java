
import java.util.Scanner;

public class HitungTotalHarga {
    public static void main(String[] args) {

        System.out.println("Alat Menghitung Diskon Belanjaan");

        System.out.println("Masukkan Harga Barang");
        double harga = new Scanner (System.in).nextDouble();

        //Saya Nyontek Didaq Buat Anu Itue Ehhhhh Diskon/100 Nya//

        System.out.println("Masukkan Diskon");
        double diskon = new Scanner (System.in).nextDouble();
        diskon /= 100;

        System.out.println("Masukkan Jumlah Barang Yang Anda Beli");
        double jumlahBarang = new Scanner (System.in).nextDouble();


        double TotalHarga = (harga * diskon * jumlahBarang);
        System.out.println(TotalHarga);
        


    







        
    }
    
    












}
