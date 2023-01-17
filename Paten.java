import java.io.*;
public class Paten extends Obat implements DataObat{
    Penutup mksh;
    public Paten(String namaObat, int expire, int stok) {
        super(namaObat, expire, stok);
    }
    public Paten(String name2, int exp2, int stock2, Penutup mksh) {
        super(name2, exp2, stock2);
        System.out.println(Penutup.getUcapan());
    }
    @Override
    public void displayObat() {
        System.out.println("Nama obat : "+ getNamaObat());
        System.out.println("Expired obat : " + getExpire()+ " hari");
        System.out.println("Jumlah obat tersedia : " + getStok());
    }
    @Override
    public void tulisObat() {
        try{
            FileWriter tulis = new FileWriter("DataObatPaten.txt");
            tulis.write("==APOTEK BAROKAH JAYA ABADI==\n");
            tulis.write("Data obat Paten yang di inputkan\n");
            tulis.write("Nama obat : "+ getNamaObat()+ "\n");
            tulis.write("Expired obat : " + getExpire()+ " hari\n");
            tulis.write("Jumlah obat tersedia : " + getStok() + "\n");
            tulis.close();
        } catch (IOException e) {
            System.out.println("GAGAL!");
        }

    }
}
