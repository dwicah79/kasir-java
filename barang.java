package tugasakhir;

import java.util.Scanner;
import java.util.Arrays;
public class barang implements kalkulator{
    private String nama,alamat;
    private int memberid;
    private int jumharga;
    private String notelp;

    @Override
    public void member() {
        Scanner sc = new Scanner(System.in);
        System.out.println("MASUKAN NAMA ANDA = ");
        nama = sc.nextLine();
        System.out.println("MASUKAN ALAMAT ANDA = ");
        alamat = sc.nextLine();
        System.out.println("MASUKAN NO TELEPON ANDA = ");
        notelp=sc.nextLine();
        System.out.println("MASUKAN ID MEMBER = ");
        memberid = sc.nextInt();


        System.out.println("=======================================================================================");
        System.out.println("                                        MEMBER BERHASIL DIBUAT");
        System.out.println("=======================================================================================");
        System.out.println("NAMA              =         "+nama);
        System.out.println("ID MEMBER         =         "+memberid);
        System.out.println("ALAMAT            =         "+alamat);
        System.out.println("NO TELP           =         "+notelp);

    }

    @Override
    public void totbar() {
        int pilihan;
        float pembayaran;
        float bayar1;
        float kembalian;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("APAKAH ANDA MEMILIKI MEMBER ? YA == 1 || TIDAK == 0");
        pilihan= sc2.nextInt();
        if (pilihan==1){
            System.out.println("MASUKAN ID MEMBER ANDA = ");
            memberid= sc2.nextInt();
            System.out.println("MASUKAN TOTAL BELANJA ANDA = ");
            jumharga= sc2.nextInt();
            pembayaran= this.jumharga-10000;
            System.out.println("TOTAL BAYAR ANDA ADALAH = "+pembayaran);
            System.out.printf("MASUKAN UANG ANDA        = ");
            System.out.printf("Rp.= ");bayar1 = sc2.nextFloat();
            kembalian = bayar1-pembayaran;
            System.out.printf("KEMBALIAN ANDA           = "+"Rp."+kembalian);
        }else {
            System.out.println("MASUKAN TOTAL BELANJA ANDA = ");
            jumharga= sc2.nextInt();
            pembayaran= this.jumharga;
            System.out.println("TOTAL BAYAR ANDA ADALAH = "+pembayaran);
            System.out.printf("MASUKAN UANG ANDA        = ");
            System.out.printf("Rp.= ");bayar1 = sc2.nextFloat();
            kembalian = bayar1-pembayaran;
            System.out.printf("KEMBALIAN ANDA           = "+"Rp."+kembalian);
        }
    }

    public void Barang() {
        int barang;
        float bayaran;
        double akhir;
        Scanner c = new Scanner(System.in);
        System.out.print("MASUKAN JUMLAH BELANJA ANDA  = ");
        barang = c.nextInt();
        String nama[] = new String[barang];
        int harga[] = new int[barang];
        int jumlah[] = new int[barang];
        int total[] = new int[barang];
        double biaya = 0;
        for (int a = 0; a < barang; a++) {
            System.out.print("Nama Barang = ");
            nama[a] = c.next();
            System.out.print("Harga       = ");
            harga[a] = c.nextInt();
            System.out.print("Jumlah      = ");
            jumlah[a] = c.nextInt();
            total[a] = harga[a] * jumlah[a];
            System.out.println("Total Bayar = " + total[a]);
            System.out.println(" ");
            biaya = biaya + total[a];
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("=======================================================================================");
        System.out.println("\t\t\t\t\t STRUK BELANJA INDO APRIL");
        System.out.println("=======================================================================================");
        for (int d = 0; d < barang; d++) {
            System.out.println("| " + nama[d] + "\t\t\t| " + jumlah[d] + "\t | Rp." + harga[d] + "\t| Rp." + jumlah[d] * harga[d] + "\t|");
        }
        System.out.println("=======================================================================================");
        System.out.println("Total Belanjaan  = Rp." + biaya);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.printf("MASUKAN UANG ANDA = ");
        System.out.printf("Rp.= ");bayaran = c.nextFloat();
        akhir = bayaran-biaya;
        System.out.printf("KEMBALIAN ANDA   = "+"Rp."+akhir);




    }
}



