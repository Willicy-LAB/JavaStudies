package com.dev.will.dataStructure.vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

public class VectorTest {

  @Test
  public void getTosize() {
    @NotNull Vector vector = new Vector(100);

    @NotNull String[] myStrings = vector.getElements();
    assertEquals(100, myStrings.length);
  }
}
