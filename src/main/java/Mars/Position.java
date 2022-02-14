package Mars;

public class Position implements PositionIF {
    private Axis x = null;
    private Axis y = null;
    private Direction direction = null;

    public Position(Axis x, Axis y, Direction direction) {
        if (x == null || y == null || direction == null) {
            throw new IllegalArgumentException("Rover Position cannot be null");
        }
        this.direction = direction;
        this.x = x;
        this.y = y;
    }
    @Override
    public Axis getX() {
        return x;
    }

    @Override
    public Axis getY() {
        return y;
    }

    protected void setDirectionRight() {
        direction = direction.right();
    }

    protected void setDirectionLeft() {
        direction = direction.left();
    }

     @Override
    public Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return getX().getAxis() + " : " + getY().getAxis() + " : "
                + getDirection().name();
    }
}
