object Basics extends App {

  // Types: Int, Boolean, Char, String, Double, Float

  // defining a value
  val meaningOfLife: Int = 42 // const int meaningOfLife = 42;
  val aBoolean = false // scala can infer the type automatically -> type mentioning is optional ()

  // Strings and String operations
  val aString = "I kinda like scala"
  val aComposedString = "I" + " " + "kinda like scala"
  val anInterpolatedString = s"$aString every day a little more"

  // expression - structures that can be reduced to a value
  val result = 4 + 2

  // if expressions - not doing something (instruction) but rather assigning values to something (expression)
  val ifExpression = if (meaningOfLife > 42) 56 else 999 // meaningOfLife > 42 ? 56 : 999
  val chainedIfExpression = if (meaningOfLife > 42) 43
  else if (aString.length < 3) 44
  else 45

  // code blocks
  val aCodeBlock = { // compile will find out the code block returns a int and assigns the int type correspondingly
    // definitions
    val aLocalValue = "Its a local value here"

    // have to return something (value of block is the last expression)
    aLocalValue + 3
  }

  // functions
  // might take a single line
  def myFunction(x: Int, y: String): String = y + " " + x

  // might take a code block
  def myCodeBlockFunction(x: Int, y: String): String = {
    y + " this takes up some space " + x
  }

  // recursion is common in everyday life
  def factiorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factiorial(n - 1)
  }

  // NOTE: In Scala use recursion instead of loops or iteration

  // void equivalent: the Unit type is the side effects type (printing something, storing something etc.)
  def myUnitReturningFunction(): Unit = println("I start kinda liking scala more")
  val theUnit = ()
}
