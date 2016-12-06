//Cat.scala
class Cat {
    def meow():String = {"mew!"}
}

val cat = new Cat
val m1 = cat.meow()

assert ("mw!" == m1, "Expected mew!, Got " + m1)
