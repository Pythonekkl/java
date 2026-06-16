class Araba {
    String marka;
    int yil;

    Araba(String marka, int yil) {
        this.marka = marka;
        this.yil = yil;
    }

    public static void main(String[] args) {
        Araba a = new Araba("toyota", 2027);
        System.out.println("Marka: " + a.marka + ", Yil: " + a.yil);
    }
}