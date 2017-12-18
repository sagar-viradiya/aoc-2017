import org.junit.Assert.assertEquals
import org.junit.Test
import utils.getResourceAsString
import utils.splitNewlines
import utils.splitWhitespace

class Day18Test {

  @Test
  fun part1sample() {
    assertEquals(4L, Day18.part1(getResourceAsString("day18-sample1.txt")))
  }

  @Test
  fun part1() {
    assertEquals(2951L, Day18.part1(getResourceAsString("day18.txt")))
  }

  @Test
  fun part2sample() {
    assertEquals(3L, Day18.part2(getResourceAsString("day18-sample2.txt")))
  }

  @Test
  fun part2() {
    assertEquals(7366L, Day18.part2(getResourceAsString("day18.txt")))
  }

}