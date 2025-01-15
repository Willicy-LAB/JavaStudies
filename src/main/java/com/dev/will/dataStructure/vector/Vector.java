package com.dev.will.dataStructure.vector;

import org.jetbrains.annotations.NotNull;

public class Vector {

  private @NotNull String[] elements;

  public Vector (int capacity) {
    this.elements = new String[capacity];
  }

  public @NotNull String[] getElements () {
    return elements;
  }
}
