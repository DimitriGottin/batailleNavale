package boat;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Boat> fleet = new ArrayList<>();

    public String addBoat(int x, int y, int model, String direction){
        String result = "";

        if (fleet.size() < 5){ // Si la flotte n'est pas pleine
            boolean canAdd = true; // Variable pour voir si on peux ajouter
            int tampModelCount = 0; // Variable qui compte le nombre de bateaux de longueur 2
            for (int i = 0; i< fleet.size(); i++){    // Parcours de la flotte
                if (model == 2){   // Si on veux ajouter un bateau de longueur 2
                    if (fleet.get(i).getModel() == 2){   // On compte le nombre de bateaux de longueur 2 déjà présent
                        tampModelCount++;
                    }
                    if (tampModelCount == 2){ // Si il y en a déjà 2 alors on ne peux pas rajouter
                        canAdd = false;
                        result = "Il existe déjà 2 bateaux de longueur 2";
                    }
                }else{  // Si on veux ajouter un bateau d'une autre longueur
                    if (fleet.get(i).getModel() == model){   // Vérification que le bateau de cette longueur n'existe pas
                        canAdd = false;
                        result = "Il existe déjà un bateau de longueur "+model;
                    }
                }
            }
            if (canAdd){    // Si toutes les vérifications sont bonnes alors on ajoute
                fleet.add(new Boat(x,y,model,direction));
                result = "Le bateau a bien été ajouté";
            }
        }
        return result;
    }
}