public class Main {

    public static void main(String[] args) {
        Victime persos[] = new Victime[10];
        for(int i = 0 ; i < 10 ; i++){
            if (Math.random()*5 == 0){
                persos[i] = new Sorcier("Sorcier_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
            else if (Math.random()*5 == 1){
                persos[i] = new Magicien("Magicien_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
            else if (Math.random()*5 == 2){
                persos[i] = new NainDeJardin("NainDeJardin_" + (i+1));
            }
            else if (Math.random()*5 == 3){
                persos[i] = new Gnome("Gnome_" + (i+1));
            }
            else{
                persos[i] = new Monstre("Monstre_" + (i+1),
                        50 + (int)(100*Math.random()));
            }
        }
    }
}
