object Prime{
	val primes = 2 #:: sieve(3)

	def sieve(n: BigInt):Stream[BigInt] = {
		if (primes.takeWhile(p=> p*p <= n).exists(n % _ == 0)) 
			sieve(n + 2)
        else 
        	n #:: sieve(n + 2)
	}

	//Prime factors of the number
	def factor(n: BigInt): List[BigInt] = {
		def factors0(n:BigInt, factors:List[BigInt]): List[BigInt] = 
			if (n == 1)
				factors
			else 
				primes.takeWhile(_ <= n).find(n % _ == 0) match {
					case Some(p) => factors0(n/p, p :: factors)
					case None => throw new Exception("Very unexpected")
				}
			
		factors0(n, Nil)
	}

	//Combine factors into (factor, exponent) notation
	def factor_exp(n:BigInt) = factor(n).groupBy(x=>x).mapValues(_.length).toList

	//Could use an implicit conversion
	def lcm(ns: Seq[BigInt]) = {
		//factor each number and multiply the largest powers of each prime factor
		(
			for {
				n <- ns
				f <- Prime.factor_exp(n)
			} yield f
		).groupBy(_._1).
			mapValues(x=> x.map(_._2).max).
			foldLeft(BigInt(1)){ 
				case (a, (k:BigInt, v)) => a * k.pow(v) 
			}
	}
}