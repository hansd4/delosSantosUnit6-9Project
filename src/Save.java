import java.util.ArrayList;

public class Save {
    private Cell[][] grid;
    private int trafficVolume;
    private ArrayList<Car> cars;

    public Save(int length, int width) {
        grid = new Cell[length][width];
        trafficVolume = 0;
        cars = new ArrayList<>();
    }
}
