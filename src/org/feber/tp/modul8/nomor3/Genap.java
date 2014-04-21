package org.feber.tp.modul8.nomor3;

/**
 *
 * @author feber
 */
public class Genap extends Thread {

    private String namaRoket;

    public Genap(String namaRoket) {
        this.namaRoket = namaRoket;
    }

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            try {
                System.out.printf("Rocket %s %s detik sebelum diluncurkan.\n", namaRoket, i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }
        System.out.printf("Rocket %s meluncur!\n", namaRoket);
    }

    public static void main(String[] args) {
        new Thread(new Genap("1103124305")).start();
        new Thread(new Genap("Feber")).start();
    }
}