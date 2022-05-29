package com.Praktikum;


public class Main{

    public static java.util.Scanner terminalInput = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        int jml;
        int harga1 = 25000;
        int harga2 = 15000;
        int harga3 = 20000;
        String inputUser;
        boolean isContinue = true;

        while (isContinue) {

            cls();

            optionMenu();

            System.out.print("\nMasukkan Pilihan [1 .. 3] \t : ");
            inputUser = terminalInput.next();
            
            switch (inputUser) {
                case "1":                    
                    System.out.print("Masukkan jumlah pesanan \t : ");
                    jml = terminalInput.nextInt();
                    hitungTotal(harga1, jml);
                break;
                case "2":                    
                    System.out.print("Masukkan jumlah pesanan \t : ");
                    jml = terminalInput.nextInt();
                    hitungTotal(harga2, jml);
                break;
                case "3":                    
                    System.out.print("Masukkan jumlah pesanan \t : ");
                    jml = terminalInput.nextInt();
                    hitungTotal(harga3, jml);
                break;
                default:
                    System.err.println("Pilihan \"" + inputUser + "\" Tidak ada..");
            }

            label_option: {
                System.out.print("Ulangi Program ? [y/n] \t\t : ");
                inputUser = terminalInput.next();
    
                if (inputUser.equalsIgnoreCase("Y")) {
                    isContinue = true;
                } else if (inputUser.equalsIgnoreCase("N")) {
                    isContinue = false;
                } else {
                    System.err.print("Pilihan Tidak Dikenali");
                    break label_option;
                }
            }
        }

    terminalInput.close();
    }

    // Clear Screen
    public static void cls() {
        System.out.println("\033\143");
        System.out.flush();
    }

    // MENU MAKANAN
    public static void optionMenu() {
            System.out.println("MENU:");
            System.out.println("1. Ikan Bakar + Nasi \t\t Rp25.000");
            System.out.println("2. Nasi Goreng \t\t\t Rp15.000");
            System.out.println("3. Ayam Bakar + Nasi \t\t Rp20.000");
    }

    // METHOD JUMLAH BAYAR
    public static int hitungTotal(int hrg,int jml) {
        int total;
        total = (hrg * jml);
        System.out.println("Total Harga \t\t\t : " + total);
        return total;
    }

}