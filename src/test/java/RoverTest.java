import Mars.PositionIF;
import Mars.Rover;
import Mars.PositionIF.Direction;
import Mars.Rover.Command;

import java.rmi.MarshalException;

/**
 *  * Test Class.
  */

class RoverTest {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // Test case 1 LMLMLMLMM
        //Act
        Rover rover1 = new Rover(new PositionIF.Axis(1),
                new PositionIF.Axis(2), Mars.PositionIF.Direction.NORTH);
        //Arrange
        rover1.processCommands(new Command[] { Command.LEFT, Command.MOVE,
                Command.LEFT, Command.MOVE, Command.LEFT, Command.MOVE,
                Command.LEFT, Command.MOVE, Command.MOVE });
        //Assert
        System.out.println(rover1.getPosition());

        // Test  case 2 MMRMMRMRRM
        //Act
        Rover rover2 = new Rover(new PositionIF.Axis(3),
                new PositionIF.Axis(3), Direction.EAST);
        //Arrange
        rover2.processCommands(new Command[] { Command.MOVE, Command.MOVE,
                Command.RIGHT, Command.MOVE, Command.MOVE, Command.RIGHT,
                Command.MOVE, Command.RIGHT, Command.RIGHT, Command.MOVE });
        //Assert
        System.out.println(rover2.getPosition());
    }
}