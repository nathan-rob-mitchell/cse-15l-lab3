import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlaceSingle() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlaceEven() {
    int[] input1 = { 1, 2, 3, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4, 3, 2, 1 }, input1);
	}

  @Test 
	public void testReverseInPlaceOdd() {
    int[] input1 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input1);
	}

  @Test 
	public void testReverseInPlaceUnordered() {
    int[] input1 = { 4, 2, 1, 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3, 1, 2, 4 }, input1);
	}

  @Test
  public void testReversedEmpty() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedSingle() {
    int[] input1 = { 3 };
    assertArrayEquals(new int[]{ 3 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedOdd() {
    int[] input1 = { 1, 2, 3 };
    assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedEven() {
    int[] input1 = { 1, 2, 3, 4};
    assertArrayEquals(new int[]{ 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedUnordered() {
    int[] input1 = { 4, 1, 3, 2};
    assertArrayEquals(new int[]{ 2, 3, 1, 4 }, ArrayExamples.reversed(input1));
  }
}
