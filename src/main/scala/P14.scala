object P14 {
//Which starting number, under one million, produces the longest chain?

	def startingNumbersFrom(n: Long): Stream[Long] = {
		if (n == 1) 
			Stream(1)
		else if (n % 2 == 0)
			n #:: startingNumbersFrom(n/2)
		else
			n #:: startingNumbersFrom(3*n+1)
	}

	lazy val answer = (
		for (n <- 1 to 1000000) yield 
		(n, startingNumbersFrom(n).length)
	).maxBy(x=> x._2)._1
}