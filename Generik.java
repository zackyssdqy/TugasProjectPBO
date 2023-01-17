import java.io.*;
public class Generik extends Obat implements DataObat{
    public Generik(String namaObat, int expire, int stok) {
        super(namaObat, expire, stok);
    }
    @Override
    public void displayObat(){
        System.out.println("Nama obat : "+ getNamaObat());
        System.out.println("Expired obat : " + getExpire()+ " hari");
        System.out.println("Jumlah obat tersedia : " + getStok());
    }
    @Override
    public void tulisObat() {
        try{
            FileWriter tulis = new FileWriter("DataObatGenerik.txt");
            tulis.write("==APOTEK BAROKAH JAYA ABADI==\n");
            tulis.write("Data obat Generik yang di inputkan\n");
            tulis.write("Nama obat : "+ getNamaObat()+ "\n");
            tulis.write("Expired obat : " + getExpire()+ " hari\n");
            tulis.write("Jumlah obat tersedia : " + getStok() + "\n");
            tulis.close();
        } catch (IOException e) {
            System.out.println("GAGAL!");
        }

    }

}
