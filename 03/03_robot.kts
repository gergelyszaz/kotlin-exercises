enum class Direction(val coordinates:Pair<Int,Int>) {
    NORTH(Pair(0,1)),
    EAST(Pair(1,0)),
    SOUTH(Pair(0,-1)),
    WEST(Pair(-1,0))
}

class Robot(val grid: Pair<Int,Int>, var direction: Direction, var position: Pair<Int,Int>) {

    private fun turnLeft() { 
        direction = when(direction) {
            Direction.NORTH -> Direction.WEST
            Direction.WEST -> Direction.SOUTH
            Direction.SOUTH -> Direction.EAST
            Direction.EAST -> Direction.NORTH
        }
    }
    

    private fun turnRight(){
        direction = when(direction) {
            Direction.NORTH -> Direction.EAST
            Direction.EAST -> Direction.SOUTH
            Direction.SOUTH -> Direction.WEST
            Direction.WEST -> Direction.NORTH
        }
    }

    private fun advance(){
        position = Pair(position.first + direction.coordinates.first, position.second + direction.coordinates.second)
    }


    fun process(instructions: String){
        val robot = Robot(grid, direction, position)
        for(instruction in instructions){
            when(instruction) {
                'R' -> robot.turnRight()
                'L' -> robot.turnLeft()
                'A' -> robot.advance()
                else -> return
            }
        }
        if(robot.position.first>grid.first ||
            robot.position.second>grid.second ||
            robot.position.first<0 ||
            robot.position.second<0){

            return
        }

        position = robot.position
        direction = robot.direction
    }
}

val robot = Robot(Pair(2,2), Direction.NORTH, Pair(1,2))
robot.process("RAALAL")
println(robot.position)
println(robot.direction)
