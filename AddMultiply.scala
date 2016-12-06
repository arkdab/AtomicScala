//AddMultiply.scala

def AddMultiply(x:Int, y:Double, s:String):Double = {
	println(s)
	(x + y) * 2.1
}

val r2:Double = AddMultiply (7,9,"Inside AddMultiply")
println(r2)

def test(x:Int, y:Double, s:String, expected:Double):Unit = {
	val result = AddMultiply (x,y,s)
	assert(result == expected, "Expected " + expected + "Got " + result)
	println ("result: " + result)
}

test (7,9,"Inside AddMultiply", 33.6)