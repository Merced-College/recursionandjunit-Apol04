import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RecursionTest {
  
  @Test
  public void testCount8() {
    assertEquals(1, RecursionProblems.count8(8));
    assertEquals(2, RecursionProblems.count8(818));
    assertEquals(4, RecursionProblems.count8(8818));
    assertEquals(0, RecursionProblems.count8(0));
    assertEquals(1, RecursionProblems.count8(1238));
  }

  @Test
  public void testCountHi() {
    assertEquals(1, RecursionProblems.countHi("xxhixx"));
    assertEquals(2, RecursionProblems.countHi("xhixhix"));
    assertEquals(1, RecursionProblems.countHi("hi"));
    assertEquals(0, RecursionProblems.countHi("hello"));
    assertEquals(3, RecursionProblems.countHi("hihihi"));
  }

  @Test
  public void testCountHi2() {
    assertEquals(1, RecursionProblems.countHi("ahixhi"));
    assertEquals(2, RecursionProblems.countHi("ahibhi"));
    assertEquals(0, RecursionProblems.countHi("xhixhi"));
    assertEquals(1, RecursionProblems.countHi("hihi"));
    assertEquals(0, RecursionProblems.countHi("xhi"));
  }

  @Test
  public void testStrCount() {
    assertEquals(2, RecursionProblems.countHi("catcowcat", "cat"));
    assertEquals(1, RecursionProblems.countHi("catcowcat", "cow"));
    assertEquals(0, RecursionProblems.countHi("catcowcat", "dog"));
    assertEquals(3, RecursionProblems.countHi("abcabcabc", "abc"));
    assertEquals(0, RecursionProblems.countHi("", "a"));
  }

  public void testStringClean() {
    assertEquals("yza", RecursionProblems.stringClean("yyzzza"));
    assertEquals("abcd", RecursionProblems.stringClean("abbbcdd"));
    assertEquals("Helo", RecursionProblems.stringClean("Hello"));
    assertEquals("a", RecursionProblems.stringClean("aaaaaa"));
    assertEquals("", RecursionProblems.stringClean(""));
  }
}
