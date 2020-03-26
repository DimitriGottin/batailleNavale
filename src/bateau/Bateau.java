package bateau;

public class Bateau {

    private int[] startPosition = new int[2];
    private int modele;
    private String direction;

    Bateau (int x, int y, int model, String direction){
        setDirection(direction);
        setModele(model);
        setStartPosition(x, y);
    }

    public void setStartPosition(int x, int y) {
        this.startPosition[0] = x;
        this.startPosition[1] = y;
    }

    public void setModele(int model) {
        this.modele = model;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int[] getStartPosition() {
        return startPosition;
    }

    public int getModel() {
        return modele;
    }

    public String getDirection() {
        return direction;
    }
}
