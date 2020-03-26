package bateau;

import coordonnes.Coordonnes;
import coordonnes.Direction;

public class Bateau {

    private Coordonnes startPosition;
    private int model;
    private String direction;
    public Direction direction1;

    public Bateau (int x, int y, int model, String direction){
        setStartPosition(new Coordonnes(x,y));
        setDirection(direction);
        setModel(model);
        direction1 = Direction.GAUCHE;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setStartPosition(Coordonnes coordonnes){
        this.startPosition = coordonnes;
    }

    public Coordonnes getStartPosition() {
        return startPosition;
    }

    public int getModel() {
        return model;
    }

    public String getDirection() {
        return direction;
    }
}
