package Main;

/**
 *
 * @author Muhammad Ihsan
 * NAMA       : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM          : 10118037
 * Deskripsi Program   : Program ini berisi program menghitung volume bola, tabung, dan kerucut 
 */
public class main {

    public static void main(String[] args) {
        
        Bola bola = new Bola();
        bola.setJari2(7);
        bola.tampilVolume();
        
        Tabung tabung =  new Tabung();
        tabung.setJari2(10);
        tabung.setTinggi(21);
        tabung.tampilVolume();
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJari2(14);
        kerucut.setTinggi(9);
        kerucut.tampilVolume();
    }
}
