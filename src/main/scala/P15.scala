object P15 {
//How many routes are there through a 20x20 grid (without backtracking)?
	val maxX = 20;
	val maxY = 20;

	case class Pos(x: Int, y: Int){
		def neighbors() = 
			List(Pos(x+1, y), Pos(x, y+1)).filter(_.isValid)

		def isValid = {x >= 0 && y >= 0 && x<=maxY && y<=maxY}

		def isFinished = x == maxX && y == maxY
	}

	def explore(pos:Pos, explored: Set[Pos]):Long = {
		if (pos.isFinished){
			1
		}else{
			(for (n <- pos.neighbors if ! explored.contains(n)) yield {explore(n, explored + pos)}).sum
		}
	}

	//code seems simple but this was a pain to write/debug. Not enough intermediate steps I think.
	lazy val answer = explore(Pos(0,0), Set.empty)
}