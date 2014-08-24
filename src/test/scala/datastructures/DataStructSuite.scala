package datastructures
import fpinscala.datastructures._

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

object MyLists {
	val l1 = Cons(1, Cons(2, Cons(3, Nil)))
	val l2 = Cons(1, Cons(0, Cons(4, Nil)))
	val l2Doubles = Cons(1.0, Cons(0.0, Cons(4.0, Nil)))
	val l1Doubles = Cons(1.0, Cons(2.0, Cons(3.0, Nil)))
}

class DatastructersSuite extends FunSuite {
	test("List.sum") {
		assert(List.sum(Nil) === 0)
		assert(List.sum(MyLists.l1) === 6)
		assert(List.sum(MyLists.l2) === 5)
	}

	test("List.product") {
		assert(List.product(Nil) === 1.0)
		assert(List.product(MyLists.l2Doubles) === 0.0)
		assert(List.product(MyLists.l1Doubles) === 6.0)
	}
}