public class Gnome extends NainDeJardin implements SuperPouvoir {

    public Gnome(String nom_gnome){
        super(nom_gnome);
    }

    public double sort(){
        return Math.random();
    }

    public int subitCharme(int coup) {
         int resis = (int)(sort()*solidite);
         if (resis > coup){
             return -coup;
         }
         else{
             return -1;
         }
    }

    public void printAttributs(){
        System.out.print("(Gnome avec " + solidite + " points de solidité)");
    }
}
