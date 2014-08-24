import fpinscala.datastructures._

object FpInScala {
    def main(args: Array[String]): Unit = {
    	val l1 = Cons(1, Cons(2, Cons(3, Nil)))

    	println(List.sum(l1))
	}
}
