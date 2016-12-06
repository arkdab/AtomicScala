//manyTimesString.scala


def manyTimesString (s:String, i:Integer):String = {
	if (i == 2) s+s
	else
	if (i == 3) s+s+s
	else
	s+s+s+s
}

def test: Unit = {
	val m1 = manyTimesString ("abc",3)
	assert ("abcabcabc" == m1, "Expected: abcabcabc Got: " + m1)
	val m2 = manyTimesString("123",2)
	assert ("123123" == m2, "Expected: 123123 Got: " + m2)
}

val s = "New "
println("Four times write \"New \" one by one give: " + manyTimesString (s,4))

