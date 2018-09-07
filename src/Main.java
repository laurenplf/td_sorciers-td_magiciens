public class Main {

    public static void main(String[] args) {
        Sorcier s1 = new Sorcier("S1", 100);
        Sorcier s2 = new Sorcier("S2", 100);
        Monstre m1 = new Monstre("M1", 100);
        Monstre m2 = new Monstre("M2", 100);
        m1.affiche();
        m2.affiche();
        s1.affiche();
        s1.attaque(m1);
        System.out.println("S1 attaque M1");
        m1.affiche();
        s1.affiche();
        m1.attaque(m2);
        System.out.println("M1 attaque M2");
        m1.affiche();
        m2.affiche();
    }
}
