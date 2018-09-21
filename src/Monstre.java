public class Monstre extends Personnage{

    public Monstre(String nom_monstre, int vie){
        super(nom_monstre, vie);
    }

    /** Makes the Monstre attack the considered Victime
     *
     * @param p
     */
    @Override
    public void attaque(Victime p){
        if (!this.mort()){
            this.affiche_attaque(p);
            int coup = pdv/2;
            p.subitFrappe(coup);
            p.riposte(this, coup);
        }
        else{
            System.out.println(p.nom + "est mort ou cassé.");
        }
    }

    /** Makes the Monstre counterattack its opponent
     *
     * @param p
     * @param coup_initial
     */
    @Override
    public void riposte(Victime p, int coup_initial){
        if (!this.mort()){
            this.affiche_riposte(p);
            p.subitFrappe(pdv / 2);
        }
        else{
            this.affiche_non_riposte(p);
        }
    }

    /** The Monstre receives a charm attack
     *
     * @param coup
     * @return Life which will be added to life of the attacker
     */
    @Override
    public int subitCharme(int coup){
        this.addVie(-coup);
        if (this.mort()){
            return 0;
        }
        return pdv/2;
    }

    /** The Monstre receives a physical attack
     *
     * @param coup
     */
    @Override
    public void subitFrappe(int coup){
        this.addVie(-coup);
    }

    /** Prints information on the considered Monstre
     *
     */
    @Override
    public void printAttributs() {
        System.out.print("(Monstre avec " + pdv + " points de vie)");
    }
}
