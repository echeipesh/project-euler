object P12{
//What is the value of the first triangle number to have over five hundred divisors?

	def triangleNumbersFrom(sum:Long, index: Long):Stream[Long] = {
		sum #:: triangleNumbersFrom(sum+index, index+1)
	}
	val triangleNumbers = triangleNumbersFrom(1,2)

	//To find the total number of divisors given the prime factorization of the number, 
	//all we have to do is add 1 to each exponent and then multiply those numbers together
	def divisorCount(factor_exp: List[(BigInt, Int)]):Int = factor_exp.map(_._2+1).product

	val answer = triangleNumbers.filter(x=> divisorCount(Prime.factor_exp( x ) ) > 500).head
}