object P6{
//find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	def sumOfSquares(ns: Seq[Int]) =  {
		ns.map(x=>x*x).sum
	}
	
	def squareOfSum(ns: Seq[Int]) = {
		val sum = ns.sum
		sum*sum
	}

	val answer = squareOfSum(1 to 100) - sumOfSquares(1 to 100)
}