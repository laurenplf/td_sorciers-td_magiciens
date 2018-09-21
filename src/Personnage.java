public abstract class Personnage extends Victime {

    protected int pdv;

    public Personnage(String nom_perso, int vie){
        super(nom_perso);
        pdv = vie;
    }

    /**Allows user to know the number of life points of the Personnage
     *
     * @return life points
     */
    public int getVie(){
        return pdv;
    }

    /** Allows user to know if the Personnage is dead
     *
     * @return true if the Personnage is dead
     */
    @Override
    public boolean mort(){
        return (pdv <= 0);
    }

    /** Modifies number of life points of the considered Personnage
     *
     * @param vie
     */
    public void addVie(int vie){
        pdv += vie;
        if (vie > 0){
            System.out.println(nom + " gagne " + vie  + " points de vie.");
        }
        else if (vie < 0){
            System.out.println(nom + " subit " + (-vie) + " points de dégâts.");
        }
        else{
            System.out.println("La vie de " + nom + " reste inchangée.");
        }
    }

    /** Prints information on the Personnage
     *
     */
    @Override
    public void affiche(){
        if (this.mort()){
            System.out.println(nom + " est mort.");
        }
        else {
            System.out.println("Je suis " + nom + " et j'ai " + pdv + " points de vie.");
        }
    }

    /** Allows user to use System.out.print on a Personnage
     *
     * @return String presenting the Personnage
     */
    @Override
    public String toString(){
        if (mort()){
            return nom + " est mort.";
        }
        return "Je suis " + nom + " et j'ai " + pdv + " points de vie.";
    }

    /** Prints information when the Personnage cannot launch a counterattack
     *
     * @param p
     */
    public void affiche_non_riposte(Victime p){
        System.out.println(nom + " ne riposte pas pas sur " + p.nom + " car " + nom + " est mort.");
    }

    /** Prints information on the attack launched by the Personnage considered
     *
     * @param p
     */
    public void affiche_attaque(Victime p){
        System.out.print(nom + " ");
        this.printAttributs();
        System.out.print(" attaque " + p.nom + " ");
        p.printAttributs();
        System.out.println(".");
    }

    /** The Personnage launches an attack on a Victime
     *
     * @param p
     */
    public abstract void attaque(Victime p);
}
