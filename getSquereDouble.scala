//getSquareDouble.scala

def getSquareDouble (x:Double):Double = {
	x*x
}

def test: Unit = {
	val sd1 = getSquareDouble (1.2)
	assert(1.44 == sd1, "Expected 1.44 Got " + sd1)
	val sd2 = getSquareDouble (5.7)
	assert(32.49 == sd2, "Expected 32.49 Got " + sd2)
}

val x:Double = 5
test
println ("Square Double of " + x + " is " + getSquareDouble (x))