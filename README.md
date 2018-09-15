# TD_SORCIERS/TD_MAGICIENS

Réalisation des deux TD suivants :
- [TD Sorciers](https://drive.google.com/file/u/2/d/19DYjv-I5QKMbT9QNpr5jO4oUujupvENE/view?usp=sharing)
- [TD Magiciens](https://drive.google.com/file/d/1XLclk9rF1S741GMempHZvftVMW3_tfVN/view)

## I. Contenu

### I.1. Classe pricipale

* Classe [Victime](https://github.com/laurenplf/tp_sorciers/blob/master/src/Victime.java) 
  * abstraite
  * définit les objets pouvant être attaqués

### I.2. Classes secondaires, héritant de Victime

* Classe [Personnage](https://github.com/laurenplf/tp_sorciers/blob/master/src/Personnage.java)
  * abstraite
  * définit les objets pouvant attaquer
* Classe [NainDeJardin](https://github.com/laurenplf/tp_sorciers/blob/master/src/NainDeJardin.java)
  * non abstraite
  * définit les objets ne pouvant qu'être attaqués
  * sensibilité aux attaques physiques à partir d'un certain seuil
  * insensibilité aux attaques magiques
  * riposte passive aux attaques physiques

### I.3. Classes héritant de Personnage

* Classe [Monstre](https://github.com/laurenplf/tp_sorciers/blob/master/src/Monstre.java)
  * non abstraite
  * attaque au corps à corps
  * sensibilité à la magie
  * sensibilité aux attaques physiques
  * riposte physique aux attaques physiques
* Classe [Sorcier](https://github.com/laurenplf/tp_sorciers/blob/master/src/Sorcier.java)
  * non abstraite
  * attaque magique
  * sensibilité aux attaques physiques
  * insensibilité aux attaques magiques
  * riposte magique aux attaques physiques
* Classe [Magicien](https://github.com/laurenplf/tp_sorciers/blob/master/src/Magicien.java)
  * non abstraite
  * attaque magique
  * sensibilité aux attaques physiques
  * insensibilité aux attaques magiques
  * riposte magique aux attaques physiques et magiques
  * bénéficie de l'interface [SuperPouvoir](https://github.com/laurenplf/tp_sorciers/blob/master/src/SuperPouvoir.java)
  
### I.4. Classe héritant de NainDeJardin

* Classe [Gnome](https://github.com/laurenplf/tp_sorciers/blob/master/src/Gnome.java)
  * sensibilité aux attaques physiques à partir d'un certain seuil
  * insensibilité aux attaques magiques
  * riposte passive aux attaques physiques
  * possibilité de riposte passive aux attaques magiques
  * bénéficie de l'interface [SuperPouvoir](https://github.com/laurenplf/tp_sorciers/blob/master/src/SuperPouvoir.java)


## II. Affichage lors du "Run" - Contenu de [Main](https://github.com/laurenplf/tp_sorciers/blob/master/src/Main.java)

* Création d'une liste de 10 Personnages qui auront le rôle d'attaquants (type aléatoire)
* Création d'une liste de 10 Victimes qui auront le rôle de victimes (type aléatoire)
* Affichage de chaque combat (deux adversaires, un attaque, l'autre subit et riposte éventuellement) avec affichage des caractéristiques de chaque protagoniste et des modifications de points de vie

