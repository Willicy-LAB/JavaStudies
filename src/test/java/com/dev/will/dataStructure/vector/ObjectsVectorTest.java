package com.dev.will.dataStructure.vector;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.jetbrains.annotations.NotNull;

public class ObjectsVectorTest {

  private @NotNull ObjectsVector vector;

  @BeforeEach
  void setup() {
    vector = new ObjectsVector(3);
  }

  @Test
  void testaddelement() {
    assertTrue(vector.add("element1"));
    assertTrue(vector.add("element2"));

    assertEquals(2, vector.getSize());
  }

  @Test
  void testaddelementwithcapacityincrease() {
    vector.add("element1");
    vector.add("element2");
    vector.add("element3");

    assertTrue(vector.add("element4"));
    assertEquals(4, vector.getSize());
  }

  @Test
  void testtostringemptyvector() {
    assertEquals("[]", vector.toString());
  }

  @Test
  void testtostringwithelements() {
    vector.add("element1");
    vector.add("element2");

    assertEquals("[element1, element2]", vector.toString());
  }

  @Test
  void testgetelementbyindex() {
    vector.add("element1");
    vector.add("element2");

    assertEquals("element1", vector.getElementByIndex(0));
    assertEquals("element2", vector.getElementByIndex(1));
  }

  @Test
  void testgetelementbyindexinvalid() {
    vector.add("element1");

    assertThrows(IllegalArgumentException.class, () -> vector.getElementByIndex(-1));
    assertThrows(IllegalArgumentException.class, () -> vector.getElementByIndex(2));
  }

  @Test
  void testcontains() {
    vector.add("element1");
    vector.add("element2");

    assertTrue(vector.contains("element1"));
    assertFalse(vector.contains("element3"));
  }

  @Test
  void testaddelementatindex() {
    vector.add("element1");
    vector.add("element3");
    vector.add(1, "element2");

    assertEquals("[element1, element2, element3]", vector.toString());
  }

  @Test
  void testaddelementatindexinvalid() {
    vector.add("element1");

    assertThrows(IllegalArgumentException.class, () -> vector.add(-1, "invalid"));
    assertThrows(IllegalArgumentException.class, () -> vector.add(2, "invalid"));
  }

  @Test
  void testremoveelement() {
    vector.add("element1");
    vector.add("element2");
    vector.add("element3");

    vector.remove(1);

    assertEquals(2, vector.getSize());
    assertEquals("[element1, element3]", vector.toString());
  }

  @Test
  void testremoveelementinvalid() {
    vector.add("element1");

    assertThrows(IllegalArgumentException.class, () -> vector.remove(-1));
    assertThrows(IllegalArgumentException.class, () -> vector.remove(1));
  }

  @Test
  void testmorecapacity() {
    vector.add("element1");
    vector.add("element2");
    vector.add("element3");
    vector.add("element4");

    assertEquals(4, vector.getSize());
    assertEquals("[element1, element2, element3, element4]", vector.toString());
  }
}
