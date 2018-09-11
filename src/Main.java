public class Main {

    public static void main(String[] args) {

        Victime vict[] = new Victime[10];

        for(int i = 0 ; i < 10 ; i++){
            int random = (int)(Math.random()*5);
            if (random == 0){
                vict[i] = new Sorcier("Sorcier_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
            else if (random == 1){
                vict[i] = new Magicien("Magicien_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
            else if (random == 2){
                vict[i] = new NainDeJardin("NainDeJardin_" + (i+1));
            }
            else if (random == 3){
                vict[i] = new Gnome("Gnome_" + (i+1));
            }
            else{
                vict[i] = new Monstre("Monstre_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
        }



        Personnage pers[] = new Personnage[10];

        for (int i = 0 ; i < 10 ; i++){
            int random = (int)(Math.random()*3);
            if (random == 0){
                pers[i] = new Sorcier("Sorcier_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
            else if (random == 1){
                pers[i] = new Magicien("Magicien_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
            else if (random == 2){
                pers[i] = new Monstre("Monstre_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
        }

        for (Personnage p : pers){
            int indice = (int)(Math.random()*10);
            p.affiche();
            p.attaque(vict[indice]);
            p.affiche();
            System.out.println("\n");
        }
    }
}
