//getSquare.scala

def getSquare (int:Int):Int = {
	int*int
}

def test (x:Int,expected:Int):Unit = {
	val result = getSquare (x)
	assert (result == expected,"Expected " + expected + " Got " + result)
	println ("Result: " + result)
}

val a = test (6, 36)
val b = test (5, 25)