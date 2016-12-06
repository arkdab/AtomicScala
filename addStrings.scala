//addStrings.scala

def addStrings (s1:String,s2:String):String = {
	s1+s2
}

def tests:Unit = {
	val s1 = addStrings("abc", "def")
	val r1 = "abcdef"
	assert (s1 == r1, "Expected: " + r1 + " Got: "  + s1)
	val s2 = addStrings("zyx", "abcd")
	val r2 = "zyxabc"
	assert (s2 == r2, "Expected: " + r2 + "Got: " + s2)
}

tests

val s1 = "New "
val s2 = "emotions."

println ("Taken: \"" + s1 + "\" and \"" + s2 + "\", add it an result is: \"" + addStrings(s1,s2) + "\".")