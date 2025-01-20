package com.dev.will.dataStructure.vector;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.jetbrains.annotations.NotNull;

public class VectorTest {

  private @NotNull Vector vector;

  @BeforeEach
  void setup() {
    vector = new Vector(3);
  }

  @Test
  void testAddElement() {
    assertTrue(vector.add("Element1"));
    assertTrue(vector.add("Element2"));
    assertEquals(2, vector.getSize());
  }

  @Test
  void testAddElementWithCapacityIncrease() {
    vector.add("Element1");
    vector.add("Element2");
    vector.add("Element3");
    assertTrue(vector.add("Element4"));
    assertEquals(4, vector.getSize());
  }

  @Test
  void testAddElementAtIndex() {
    vector.add("Element1");
    vector.add("Element3");
    vector.add(1, "Element2");
    assertEquals("[Element1, Element2, Element3]", vector.toString());
  }

  @Test
  void testAddElementAtIndexInvalid() {
    vector.add("Element1");
    assertThrows(IllegalArgumentException.class, () -> vector.add(-1, "Invalid"));
    assertThrows(IllegalArgumentException.class, () -> vector.add(2, "Invalid"));
  }

  @Test
  void testGetElementByIndex() {
    vector.add("Element1");
    vector.add("Element2");
    assertEquals("Element1", vector.getElementByIndex(0));
    assertEquals("Element2", vector.getElementByIndex(1));
  }

  @Test
  void testGetElementByIndexInvalid() {
    vector.add("Element1");
    assertThrows(IllegalArgumentException.class, () -> vector.getElementByIndex(-1));
    assertThrows(IllegalArgumentException.class, () -> vector.getElementByIndex(2));
  }

  @Test
  void testContains() {
    vector.add("Element1");
    vector.add("Element2");
    assertTrue(vector.contains("Element1"));
    assertFalse(vector.contains("Element3"));
  }

  @Test
  void testRemoveElement() {
    vector.add("Element1");
    vector.add("Element2");
    vector.add("Element3");
    vector.remove(1);
    assertEquals(2, vector.getSize());
    assertEquals("[Element1, Element3]", vector.toString());
  }

  @Test
  void testRemoveElementInvalid() {
    vector.add("Element1");
    assertThrows(IllegalArgumentException.class, () -> vector.remove(-1));
    assertThrows(IllegalArgumentException.class, () -> vector.remove(1));
  }

  @Test
  void testToStringEmptyVector() {
    assertEquals("[]", vector.toString());
  }

  @Test
  void testToStringWithElements() {
    vector.add("Element1");
    vector.add("Element2");
    assertEquals("[Element1, Element2]", vector.toString());
  }

  @Test
  void testMoreCapacity() {
    vector.add("Element1");
    vector.add("Element2");
    vector.add("Element3");
    vector.add("Element4");
    assertEquals(4, vector.getSize());
    assertEquals("[Element1, Element2, Element3, Element4]", vector.toString());
  }
}
