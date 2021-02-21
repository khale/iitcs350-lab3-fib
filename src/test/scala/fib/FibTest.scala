package fib
import org.scalatest.FunSpec

class FibSpec extends FunSpec {
  describe("Fib::fib") {
    it("should handle 0 as input") {
      val res = Fib.fib(0)
      assert(res == 0)
    }
    it("should handle 1 as input") {
      val res = Fib.fib(1)
      assert(res == 1)
    }
    it("should handle 2 as input") {
      val res = Fib.fib(2)
      assert(res == 1)
    }
    it("should handle 10 as input") {
      val res = Fib.fib(10)
      assert(res == 55)
    }
    it("should handle 20 as input") {
      val res = Fib.fib(20)
      assert(res == 6765)
    }
    it("should handle 30 as input") {
      val res = Fib.fib(30)
      assert(res == 832040)
    }
  }
}

