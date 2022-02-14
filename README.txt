Mars Rover Kata Creation in OOPS concepts and TDD

A squad of robotic rovers is to be landed by NASA on a plateau on Mars.
This plateau, which is curiously rectangular, must be navigated by the rovers so that their onboard cameras can get a complete view of the surrounding terrain to send back to Earth.
A rover’s position and location are represented by a combination of x and y coordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.
In order to control a rover, NASA sends a simple string of letters. The possible letters are ‘L’, ‘R’ and ‘M’. 
	‘L’ makes the rover spin 90 degrees left, without moving from its current spot,
	and ‘R’ makes the rover spin 90 degrees right respectively, without moving from its current spot, 
	and ‘M’ means moving forward one grid point and maintaining the same heading.
Assume that the square directly North from (x, y) is (x, y+1).

INPUT 
The first line of input is the upper-right coordinates of the plateau, assume the lower-left coordinates is 0,0.
Each rover has two lines of input. 
The first line of the input gives the rover’s position, 
The second line of the input gives the series of instructions telling the rover how to explore the plateau.
The position is made up of two integers and a letter separated by spaces, corresponding to the x and y coordinates and the rover’s orientation.
Each rover will be finished sequentially, which means that the second rover won’t start to move until the first one has finished moving.

OUTPUT 
The output for each rover should be its final coordinates and heading.

Test cases for
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM
Expected Output:
1 3 N
5 1 E
