import problems.First

class TestFirst extends munit.FunSuite {
  test("that last works as intended for a non-empty sequence") {
    assertEquals(3, First.last(Seq(1, 2, 3)))
  }

  test("that last works as intended for an empty sequence") {
    intercept[RuntimeException] {
      First.last(Seq())
    }
  }
  test("that last2 works as intended for a non-empty sequence") {
    assertEquals(3, First.last2(Seq(1, 2, 3)))
  }

  test("that last2 works as intended for an empty sequence") {
    intercept[RuntimeException] {
      First.last2(Seq())
    }
  }
}
