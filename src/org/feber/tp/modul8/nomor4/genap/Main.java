package org.feber.tp.modul8.nomor4.genap;

/**
 *
 * @author feber
 */
public class Main {

    private static Peminjam peminjam;

    public static void main(String[] args) {
        peminjam = new Peminjam(1000000);
        new Hutang().start();
        new Bayar().start();
    }

    static class Hutang extends Thread {

        @Override
        public void run() {
            try {
                peminjam.meminjam(100000);
                peminjam.meminjam(100000);
                peminjam.meminjam(100000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    static class Bayar extends Thread {

        @Override
        public void run() {
            try {
                peminjam.mengembalikan(50000);
                peminjam.mengembalikan(50000);
                peminjam.mengembalikan(50000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}