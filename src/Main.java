public class Main {

    public static void main(String[] args) {
        Personnage persos[] = new Personnage[10];
        String noms[] = new String[10];
        for(int i = 0 ; i < 10 ; i++){
            if (Math.random() < 0.5){
                persos[i] = new Sorcier("Sorcier_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
            else{
                persos[i] = new Monstre("Monstre_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
        }
        persos[1].attaque(persos[2]);
        persos[1].affiche();
        System.out.println(persos[2]);
    }
}
