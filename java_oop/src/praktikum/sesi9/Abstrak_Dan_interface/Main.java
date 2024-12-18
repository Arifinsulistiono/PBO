package praktikum.sesi9.Abstrak_Dan_interface;

abstract class Kendaraan {
    String nama;
    int kecepatan;

    public Kendaraan(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    // Metode abstrak
    public abstract void bergerak();
}

// Interface Mesin
interface Mesin {
    void nyalakanMesin();
    void matikanMesin();
}

// Interface Transportasi
interface Transportasi {
    void muatBarang();
    void turunkanBarang();
}

// Class Mobil yang meng-extend Kendaraan dan mengimplementasikan Mesin, Transportasi
class Mobil extends Kendaraan implements Mesin, Transportasi {

    public Mobil(String nama, int kecepatan) {
        super(nama, kecepatan);
    }

    @Override
    public void bergerak() {
        System.out.println("Mobil " + nama + " bergerak dengan kecepatan " + kecepatan + " km/jam.");
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin mobil " + nama + " dinyalakan.");
    }

    @Override
    public void matikanMesin() {
        System.out.println("Mesin mobil " + nama + " dimatikan.");
    }

    @Override
    public void muatBarang() {
        System.out.println("Barang dimuat ke dalam mobil " + nama + ".");
    }

    @Override
    public void turunkanBarang() {
        System.out.println("Barang diturunkan dari mobil " + nama + ".");
    }
}

// Class Motor yang meng-extend Kendaraan dan mengimplementasikan Mesin, Transportasi
class Motor extends Kendaraan implements Mesin, Transportasi {

    public Motor(String nama, int kecepatan) {
        super(nama, kecepatan);
    }

    @Override
    public void bergerak() {
        System.out.println("Motor " + nama + " bergerak dengan kecepatan " + kecepatan + " km/jam.");
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin motor " + nama + " dinyalakan.");
    }

    @Override
    public void matikanMesin() {
        System.out.println("Mesin motor " + nama + " dimatikan.");
    }

    @Override
    public void muatBarang() {
        System.out.println("Barang dimuat ke dalam motor " + nama + ".");
    }

    @Override
    public void turunkanBarang() {
        System.out.println("Barang diturunkan dari motor " + nama + ".");
    }
}


public class Main {
    public static void main(String[] args) {
        
        Mobil mobil = new Mobil("Toyota", 120);
        mobil.nyalakanMesin();
        mobil.bergerak();
        mobil.muatBarang();
        mobil.turunkanBarang();
        mobil.matikanMesin();

        System.out.println();

        // Membuat objek Motor
        Motor motor = new Motor("Honda", 80);
        motor.nyalakanMesin();
        motor.bergerak();
        motor.muatBarang();
        motor.turunkanBarang();
        motor.matikanMesin();
    }
}
