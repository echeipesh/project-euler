object P5 {
	//What is the smallest number divisible by each of the numbers 1 to 20?
	val answer = Prime.lcm(2 to 20 map (BigInt(_)))
}