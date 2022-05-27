package teszt;

import model.Hajo;

public class TorpedoTeszt {

    public static void main(String[] args) {
        System.out.println("Tesztesetek");

        new TorpedoTeszt().tesztLovesTalalt(4);
        new TorpedoTeszt().LovesNemTalalt(5);
    }

    public String tesztLovesTalalt(int poz) {
        Hajo hajo = new Hajo(new int[]{2, 3, 4});
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return "";
    }
    public String LovesNemTalalt(int poz) {
        System.out.println("----Mellé");
        Hajo hajo = new Hajo(new int[]{2, 3, 4});
        String t = hajo.talalat(poz);
        assert t.equals("nem talált") : "nem jó a találat ellenőrzése";
        System.out.println("Mellé teszt sikeres");
        return "";
    }
}
