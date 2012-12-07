object BigIntExtensions {
	class RichBigInt(bi: BigInt){
		//not correct immplemintation : ()
		def sqrt = bi + 1
	}

	implicit def RichBigInt(bi: BigInt) = new RichBigInt(bi)
}