package com.dev.will.dataStructure.vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

public class VectorTest {

  //testing vector creation
  @Test
  void getTosize () {
    @NotNull Vector vector = new Vector(100);

    @NotNull String[] myStrings = vector.getElements();
    assertEquals(100, myStrings.length);
  }

  @Test
  void testAddSingleElement () {
    @NotNull Vector vector = new Vector(3);
    vector.add("Element1");

    assertEquals("Element1", vector.getElements()[0]);
  }

  @Test
  void testAddMultipleElements () {
    @NotNull Vector vector = new Vector(3);
    vector.add("Element1");
    vector.add("Element2");
    vector.add("Element3");

    assertEquals("Element1", vector.getElements()[0]);
    assertEquals("Element2", vector.getElements()[1]);
    assertEquals("Element3", vector.getElements()[2]);
  }

  /* off

  @Test
  void testAddExceedingCapacity () {
    @NotNull Vector vector = new Vector(2);
    vector.add("Element1");
    vector.add("Element2");
    vector.add("Element3");

    assertEquals("Element1", vector.getElements()[0]);
    assertEquals("Element2", vector.getElements()[1]);
    assertNull(vector.getElements()[2], "exceeding capacity should not add new elements");
  }
  */

  /* off

  @Test
  void testAddNullElement () {
    @NotNull Vector vector = new Vector(2);
    vector.add("Element1");
    vector.add(null);

    assertEquals("Element1", vector.getElements()[0]);
    assertNull(vector.getElements()[1]);
  }
  */

  @Test
  void testReadAllElements () {
    @NotNull Vector vector = new Vector(5);

    vector.add("Element1");
    vector.add("Element2");
    vector.add("Element3");

    assertEquals("Element1", vector.getElements()[0]);
    assertEquals("Element2", vector.getElements()[1]);
    assertEquals("Element3", vector.getElements()[2]);

    System.out.println(vector.toString());
  }

  @Test
  void testGetElementByIndex () {
    @NotNull Vector vector = new Vector(3);

    vector.add("Element1");
    vector.add("Element2");
    vector.add("Element3");

    assertEquals("Element3", vector.getElementByIndex(2));
    System.out.println(vector.getElementByIndex(2));
  }

  /* off

  @Test
  void testExceptionOfGetElementByIndex () {
    @NotNull Vector vector = new Vector(3);

    vector.add("Element1");
    vector.add("Element2");
    vector.add("Element3");

    assertEquals("Element4", vector.getElementByIndex(3));
  }
  */

  @Test
  void testContainsElement () {
    @NotNull Vector vector = new Vector(3);

    vector.add("Element1");
    vector.add("Element2");
    vector.add("Element3");

    assertEquals(true, vector.contains("ELEMENT1"));
  }

  @Test
  void testAddByIndex () {
    @NotNull Vector vector = new Vector(10);

    vector.add("B");
    vector.add("C");
    vector.add("D");
    vector.add("F");
    vector.add("G");
    vector.add("H");
    System.out.println(vector.toString());

    vector.add(0, "A");
    System.out.println(vector.toString());

    vector.add(4, "E");
    System.out.println(vector.toString());
  }

  @Test
  void testMoreCapacity () {
    @NotNull Vector vector = new Vector(3);

    vector.add("B");
    vector.add("C");
    vector.add("D");
    System.out.println(vector.toString());
    System.out.println(vector.getElements().length);

    vector.add("F");
    vector.add("G");
    System.out.println(vector.toString());
    System.out.println(vector.getElements().length);

    vector.add(0, "A");
    System.out.println(vector.toString());

    vector.add(4, "E");
    System.out.println(vector.toString());

    System.out.println(vector.getElements().length);
  }
}
