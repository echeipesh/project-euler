object P9 {
//Find the only Pythagorean triplet, {a, b, c}, for which a + b + c = 1000.
	val answer =
		for {
			a <- 1 to 999
			b <- 1 to 999
			c <- 1 to 999
			if (a < b && b < c)
			if a*a + b*b == c*c
			if a+b+c == 1000
		} yield a*b*c
}