import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class EulerTest extends FunSuite {
	test("P2: Fabinacci") {
		assert(P2.fabinacci.take(10).toList === List(0,1,1,2,3,5,8,13,21,34))
  	}

  	test("Can make primes") {
  		assert(Prime.primes.take(10).toList === List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29))
  	}

  	test("Factor 13195"){
  		assert(Prime.factor(13195).toSet === Set(5, 7, 29, 13))
  		assert(Prime.factor_exp(13195).toSet === Set((5,1), (7,1), (29,1), (13,1)))
  	}

  	test("triangle numbers"){
  		assert(P12.triangleNumbers.take(10).toList === List(1, 3, 6, 10, 15, 21, 28, 36, 45, 55))
  	}

    test("starting numbers") {
      assert(P14.startingNumbersFrom(13).toList === List(13, 40, 20, 10, 5, 16, 8, 4, 2, 1))
    }
}
