//SeaTools.scala

class Sailboat {
    def raise = "Sails raised"
    def lower = "Sails lowered"
}

class Motrboat {
    def MotorOn = "Motor on"
    def MotorOff = "Motor off"
}

val sailboat = new Sailboat

val r1 = sailboat.raise
assert (r1 == "Sails raised", "Expected Sails raised, Got " + r1)
val r2 = sailboat.lower
assert (r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)
