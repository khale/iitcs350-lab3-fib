package fib

object Fib extends App {

  // TODO: fill me in!
  // compute the Nth fibonacci number
  def fib(arg: Int) : Int = {
     0
  }

  if (args.size < 1) {
    System.err.println("Need argument!")
    System.exit(1)
  }
  println(s"Fib of ${args(0)} is ${fib(args(0).toInt)}")
}
