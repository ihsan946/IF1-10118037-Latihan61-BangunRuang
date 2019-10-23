package Main;

public class Bola implements BangunRuang {

    private int jari2;

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }

    
    public double hitungVolume() {
     return ( 1.33333 * 3.142857 * (Math.pow(jari2, 3)) ) ;
    }

    @Override
    public void tampilVolume() {
        System.out.printf("Volume Bola adalah = %.1f " ,hitungVolume());
        System.out.println("cm^3");
    }
    
    
}
