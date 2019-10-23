package Main;

public class Tabung extends LuasAlas implements BangunRuang {

    private int jari2;

    private int tinggi;

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    
    public double alas() {
        return 3.142857 * (Math.pow(jari2, 2)) ;
    }

    public double hitungVolume() {
        return alas() * tinggi ;
    }

    @Override
    public void tampilVolume() {
       System.out.printf("Volume Tabung adalah = %.0f ", hitungVolume());
       System.out.println("cm^3");
    }
}
