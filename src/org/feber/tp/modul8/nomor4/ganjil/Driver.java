package org.feber.tp.modul8.nomor4.ganjil;

/**
 *
 * @author feber
 */
public class Driver {

    private static Nasabah nasabah;

    public static void main(String[] args) {

        nasabah = new Nasabah(1000000);
        synchronized (nasabah) {
            new Penarikan().start();
            new Setor().start();
        }
    }

    static class Penarikan extends Thread {

        @Override
        public void run() {
            try {
                nasabah.tarik(50000);
                nasabah.tarik(50000);
                nasabah.tarik(50000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    static class Setor extends Thread {

        @Override
        public void run() {
            try {
                nasabah.setor(100000);
                nasabah.setor(100000);
                nasabah.setor(100000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}