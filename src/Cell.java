public class Cell {
    public int x;
    public int y;
    private boolean occupied;
    private Car occupant;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        occupied = false;
        occupant = null;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public Car getOccupant() {
        return occupant;
    }

    public void setOccupant(Car newOccupant) {
        occupant = newOccupant;
        occupied = true;
    }

    public void removeOccupant() {
        occupant = null;
        occupied = false;
    }
}
