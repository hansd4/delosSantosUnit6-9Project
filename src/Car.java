public class Car {
    private int x;
    private int y;

    private Orientation direction;

    private int speed;

    private String image;


    public Car(int x, int y, Orientation direction, int speed, String image) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.speed = speed;
        this.image = image;
    }

    public void move() {
        switch (direction) {
            case NORTH -> y++;
            case EAST -> x++;
            case SOUTH -> y--;
            case WEST -> x--;
        }
    }

    public void turnLeft() {
        direction = switch (direction) {
            case NORTH -> Orientation.WEST;
            case EAST -> Orientation.NORTH;
            case SOUTH -> Orientation.EAST;
            case WEST -> Orientation.SOUTH;
        };
    }

    public void turnRight() {
        direction = switch (direction) {
            case NORTH -> Orientation.EAST;
            case EAST -> Orientation.SOUTH;
            case SOUTH -> Orientation.WEST;
            case WEST -> Orientation.NORTH;
        };
    }
}
