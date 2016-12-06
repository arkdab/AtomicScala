//SeaTools.scala

class Sailboat {
    def raise = print ("Sails raised")
    def lower = print ("Sails lowered")
}

class Motrboat {
    def MotorOn = println ("Motor on")
    def MotorOff = println ("Motor off")
}

val sailboat = new Sailboat

val r1 = sailboat.raise
assert (r1 == "Sails raised", "Expected Sails raised, Got " + r1)
val r2 = sailboat.lower
assert (r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)
