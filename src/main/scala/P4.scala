object P4 {
	def isPalindromic(n: Long): Boolean = {
		val s = n.toString
		s == s.reverse
	}

	val answer = (for { 
		x <- 100 to 999
		y <- 100 to 999
		if isPalindromic(x*y)
	} yield x*y).max
}