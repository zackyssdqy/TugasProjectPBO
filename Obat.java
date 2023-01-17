public abstract class Obat  {
    private String namaObat;
    private int expire;
    private int stok;

    public abstract void displayObat();

    public Obat(String namaObat, int expire, int stok) {
        this.namaObat = namaObat;
        this.expire = expire;
        this.stok = stok;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        this.expire = expire;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }



}
