package Tests

import Chapter10.Element.elem
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ElementSuite extends AnyFunSuite {

  test("elem result should have passed width") {
    val ele = elem('x',2,3)
    assert(ele.width == 2)

    assertResult(2){
      ele.width
    }

    assertThrows[IllegalArgumentException] {
      elem('x',-2,3)
    }

  }

  test("Тестовый тест"){
    assert(List(1,2,3).contains(4))
  }
}

class ElementSpec extends AnyFlatSpec with Matchers {

  "A UniformElement" should
    "have a width equal to the passes value" in {
    val ele = elem('x',2,3)
    ele.width should be (2)
  }

  it should "have a height equal to the passed value" in {
    val ele = elem('x', 2, 3)
    ele.height should be(3)
  }

  it should "throw an IAE if passed a negative width" in {
    an[IllegalArgumentException] should be thrownBy {
      elem('x', -2, 3)
    }
  }
}