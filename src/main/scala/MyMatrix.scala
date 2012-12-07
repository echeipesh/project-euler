object Matrix {
	def parse[T:ClassManifest](blob:String, sep: String, f:(String)=>T) = {
		blob.split("\n").map( _.split(sep) map(f) toArray)
	}

}

class Matrix[T](m: Array[Array[T]]){
	def diag[T](row: Int, col: Int, len: Int) = {
		try {
			Some(
				for {
					(r, c) <- (row until row + len) zip (col until col + len)
				} yield m(r)(c)
			)
		}
		catch {	case _ => None }
	}

	def back_diag[T](row: Int, col: Int, len: Int) = {
		try {
			Some(
				for {
					(r, c) <- (row until row + len) zip (col to col - (len-1) by -1)
				} yield m(r)(c)
			)
		}
		catch {	case _ => None }
	}

	def vertical[T](row: Int, col: Int, len: Int) = {
		try {
			Some(
				for {
					(r) <- (row until row + len)
				} yield m(r)(col)
			)
		}
		catch {	case _ => None }
	}

	def horizontal[T](row: Int, col: Int, len: Int) = {
		try {
			Some(
				for {
					(c) <- (col until col + len)
				} yield m(row)(c)
			)
		}
		catch {	case _ => None }
	}
}
