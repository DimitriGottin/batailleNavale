package bateau;

import java.util.ArrayList;
import java.util.List;

public class Flotte {
    private List<Bateau> flotte = new ArrayList<>();

    public String addBateau(int x, int y, int model, String direction){
        String resultat = "";

        if (flotte.size() < 5){ // Si la flotte n'est pas pleine
            boolean canAdd = true; // Variable pour voir si on peux ajouter
            int tampModelCount = 0; // Variable qui compte le nombre de bateaux de longueur 2
            for (int i=0; i<flotte.size(); i++){    // Parcours de la flotte
                if (model == 2){   // Si on veux ajouter un bateau de longueur 2
                    if (flotte.get(i).getModel() == 2){   // On compte le nombre de bateaux de longueur 2 déjà présent
                        tampModelCount++;
                    }
                    if (tampModelCount == 2){ // Si il y en a déjà 2 alors on ne peux pas rajouter
                        canAdd = false;
                        resultat = "Il existe déjà 2 bateaux de longueur 2";
                    }
                }else{  // Si on veux ajouter un bateau d'une autre longueur
                    if (flotte.get(i).getModel() == model){   // Vérification que le bateau de cette longueur n'existe pas
                        canAdd = false;
                        resultat = "Il existe déjà un bateau de longueur "+model;
                    }
                }
            }
            if (canAdd){    // Si toutes les vérifications sont bonnes alors on ajoute
                flotte.add(new Bateau(x,y,model,direction));
                resultat = "Le bateau a bien été ajouté";
            }
        }
        return resultat;
    }
}
