object P2 {
	def fabinacciFrom(a: Int, b:Int):Stream[Int] =  a #:: fabinacciFrom(b,a+b)
	
	val fabinacci = fabinacciFrom(0,1)

	val answer = fabinacci.filter(_ % 2 == 0).takeWhile(_ < 4000000 ).sum
}