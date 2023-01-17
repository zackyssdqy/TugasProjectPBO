// Constructor ✅
// Inheritance✅
// Polymorphisme✅
// Relasi antar class
// Abstrak✅
// Interface✅
// Exception handling✅


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Obat> arrayg = new ArrayList<>();
        ArrayList<Obat> arrayp = new ArrayList<>();
        int menu;

        do {
            System.out.println("PENDATAAN OBAT APOTEK BAROKAH JAYA ABADI");

            System.out.println("1. Generik");
            System.out.println("2. Paten");
            System.out.println("3. Tampil data obat");
            System.out.print("Pilih menu : ");
            menu = input.nextInt();
            if (menu == 1) {
                System.out.print("Masukkan nama obat : ");
                String name = input.next();
                System.out.print("Masukkan exp obat (hari) : ");
                int exp = input.nextInt();
                System.out.print("Masukkan jumlah stok obat : ");
                int stock = input.nextInt();
                Generik obatg1 = new Generik(name, exp, stock);
                arrayg.add(obatg1);
                obatg1.tulisObat();
                System.out.println(arrayg);


                System.out.print("Masukkan nama obat : ");
                String name2 = input.next();
                System.out.print("Masukkan exp obat (hari) : ");
                int exp2 = input.nextInt();
                System.out.print("Masukkan jumlah stok obat : ");
                int stock2 = input.nextInt();
                Generik obatg2 = new Generik(name2, exp2, stock2);
                arrayg.add(obatg2);
                obatg2.tulisObat();

            }
            else if (menu == 2) {
                System.out.print("Masukkan nama obat : ");
                String name = input.next();
                System.out.print("Masukkan exp obat (hari) : ");
                int exp = input.nextInt();
                System.out.print("Masukkan jumlah stok obat : ");
                int stock = input.nextInt();
                Paten obatp1 = new Paten(name, exp, stock);
                arrayp.add(obatp1);
                obatp1.tulisObat();


                System.out.print("Masukkan nama obat : ");
                String name2 = input.next();
                System.out.print("Masukkan exp obat (hari) : ");
                int exp2 = input.nextInt();
                System.out.print("Masukkan jumlah stok obat : ");
                int stock2 = input.nextInt();
                Penutup mksh = new Penutup("Terimakasih");
                Paten obatp2 = new Paten(name2, exp2, stock2, mksh);
                arrayp.add(obatp2);
                obatp2.tulisObat();

            }
            else if (menu==3){
                System.out.println("\n\nData obat Generik : ");
                System.out.println("-------------------");
                for(Obat obat:arrayg){
                    System.out.print("- ");
                    obat.displayObat();
                    System.out.println();
                }

                System.out.println("\nData obat Paten");
                System.out.println("----------------\n");
                for(Obat obat:arrayp){
                    System.out.print("- ");
                    obat.displayObat();
                }
            }
        }while(menu != 0);
    }
}