package sepeda;
public class SepedaBeraksi {
  public static void main(String[] args) {
    final SepedaGunung sepedaGunung = new SepedaGunung();
    sepedaGunung.setGir(3);
    sepedaGunung.setSadel(1);
    System.out.println("Sepeda Gunung");
    System.out.println("Gir : " + sepedaGunung.getGir());
    System.out.println("Sadel : " + sepedaGunung.getSadel());
    
    final SepedaBalap sepedaBalap = new SepedaBalap();
    sepedaBalap.setGir(3);
    sepedaBalap.setSadel(1);
    System.out.println("Sepeda Balap");
    System.out.println("Gir : " + sepedaBalap.getGir());
    System.out.println("Sadel : " + sepedaBalap.getSadel());

    final SepedaTandem sepedaTandem = new SepedaTandem();
    sepedaTandem.setGir(3);
    sepedaTandem.setSadel(1);
    System.out.println("Sepeda Tandem");
    System.out.println("Gir : " + sepedaTandem.getGir());
    System.out.println("Sadel : " + sepedaTandem.getSadel());


    // Buatlah algoritma dari kode program tersebut!
    // 1. Buatlah class SepedaGunung
  }
}
