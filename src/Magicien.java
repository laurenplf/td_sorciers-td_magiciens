public class Magicien extends Sorcier implements SuperPouvoir{

    public Magicien(String nom_magicien, int vie){
        super(nom_magicien, vie);
    }

    public double getPouvoir(){
        return extra*pouvoir;
    }

    public double sort(){
        return Math.random();
    }

    public int subitCharme(int coup) {
        return -(int)(sort()*this.getPouvoir());
    }
}
