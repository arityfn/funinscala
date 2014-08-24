package fpinscala.datastructures

sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

// companion object
object List {
	def sum(xs: List[Int]): Int = xs match {
		case Nil => 0
		case Cons(x, xs) => x + sum(xs) 
	}

	def product(xs: List[Double]): Double = xs match {
		case Nil => 1.0
		case Cons(x, xs) => x * product(xs)
	}
}