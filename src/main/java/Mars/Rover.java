package Mars;
import Mars.PositionIF.Axis;
import Mars.PositionIF.Direction;

/**
 * Object represents the Mars Rover.
 */
public class Rover {
    private Position position = null;

    public enum Command {
        RIGHT, LEFT, MOVE;
        private void process(Position position) {
            switch (this) {
                case RIGHT:
                    position.setDirectionRight();
                    break;
                case LEFT:
                    position.setDirectionLeft();
                    break;
                case MOVE:
                    switch (position.getDirection()) {
                        case NORTH:
                            position.getY().increment();
                            break;
                        case EAST:
                            position.getX().increment();
                            break;
                        case SOUTH:
                            position.getY().decrement();
                            break;
                        case WEST:
                            position.getX().decrement();
                    }
            }
        }
    };

    public Rover(Axis x, Axis y, Direction direction) {
        this.position = new Position(x, y, direction);
    }

    public void processCommands(Command[] commands) {
        for (int i = 0; i < commands.length; i++) {
            commands[i].process(position);
        }
    }

    public PositionIF getPosition() {
        return position;
    }
}
