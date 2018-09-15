# TD_SORCIERS/TD_MAGICIENS

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

### I.3. Classes héritant de Personnage

* Classe [Monstre](https://github.com/laurenplf/tp_sorciers/blob/master/src/Monstre.java)
  * non abstraite
* Classe [Sorcier](https://github.com/laurenplf/tp_sorciers/blob/master/src/Sorcier.java)
  * non abstraite
* Classe [Magicien](https://github.com/laurenplf/tp_sorciers/blob/master/src/Magicien.java)
  * non abstraite
  * bénéficie de l'interface [SuperPouvoir](https://github.com/laurenplf/tp_sorciers/blob/master/src/SuperPouvoir.java)
  
### I.4. Classe héritant de NainDeJardin

* Classe [Gnome](https://github.com/laurenplf/tp_sorciers/blob/master/src/Gnome.java)
  * bénéficie de l'interface [SuperPouvoir](https://github.com/laurenplf/tp_sorciers/blob/master/src/SuperPouvoir.java)
