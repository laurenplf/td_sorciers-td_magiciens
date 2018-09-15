public class Main {

    public static void main(String[] args) {

        Victime vict[] = new Victime[10];

        for(int i = 0 ; i < 10 ; i++){
            int random = (int)(Math.random()*5);
            if (random == 0){
                vict[i] = new Sorcier("SorcierVictime_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
            else if (random == 1){
                vict[i] = new Magicien("MagicienVictime_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
            else if (random == 2){
                vict[i] = new NainDeJardin("NainDeJardinVictime_" + (i+1));
            }
            else if (random == 3){
                vict[i] = new Gnome("GnomeVictime_" + (i+1));
            }
            else{
                vict[i] = new Monstre("MonstreVictime_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
        }



        Personnage pers[] = new Personnage[10];

        for (int i = 0 ; i < 10 ; i++){
            int random = (int)(Math.random()*3);
            if (random == 0){
                pers[i] = new Sorcier("SorcierAttaquant_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
            else if (random == 1){
                pers[i] = new Magicien("MagicienAttaquant_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
            else if (random == 2){
                pers[i] = new Monstre("MonstreAttaquant_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
        }

        for (Personnage p : pers){
            int indice = (int)(Math.random()*10);
            p.attaque(vict[indice]);
            System.out.println("\n");
        }
    }
}
