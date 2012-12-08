object P15 {
//How many routes are there through a 20x20 grid (without backtracking)?
	val maxX = 20;
	val maxY = 20;


	def explore(x:Int, y:Int):Long = 
		if (x == maxX && y == maxY)
			1
		else
			(if (x < maxX) explore(x+1, y) else 0) + (if (y < maxY) explore(x,y+1) else 0)

	lazy val answer = explore(0,0)
	//this is not the best way to do it, takes FOREVER
}