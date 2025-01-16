package com.dev.will.dataStructure.vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

public class VectorTest {

  //testing vector creation
  @Test
  void getTosize() {
    @NotNull Vector vector = new Vector(100);

    @NotNull String[] myStrings = vector.getElements();
    assertEquals(100, myStrings.length);
  }

  @Test
  void testAddSingleElement() {
    @NotNull Vector vector = new Vector(3);
    vector.add("Element1");

    assertEquals("Element1", vector.getElements()[0]);
  }

  @Test
  void testAddMultipleElements() {
    @NotNull Vector vector = new Vector(3);
    vector.add("Element1");
    vector.add("Element2");
    vector.add("Element3");

    assertEquals("Element1", vector.getElements()[0]);
    assertEquals("Element2", vector.getElements()[1]);
    assertEquals("Element3", vector.getElements()[2]);
  }

  @Test
  void testAddExceedingCapacity() {
    @NotNull Vector vector = new Vector(2);
    vector.add("Element1");
    vector.add("Element2");
    vector.add("Element3");

    assertEquals("Element1", vector.getElements()[0]);
    assertEquals("Element2", vector.getElements()[1]);
    assertNull(vector.getElements()[2], "Exceeding capacity should not add new elements.");
  }

  @Test
  void testAddNullElement() {
    @NotNull Vector vector = new Vector(2);
    vector.add("Element1");
    vector.add(null);

    assertEquals("Element1", vector.getElements()[0]);
    assertNull(vector.getElements()[1]);
  }
}
