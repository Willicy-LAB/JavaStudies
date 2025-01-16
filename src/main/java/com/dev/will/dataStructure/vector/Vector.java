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

  public void add (@NotNull String element) {
    for (int i = 0; i < this.elements.length; i++) {
      if (this.elements[i] == null) {
        this.elements[i] = element;
        return;
      }
    }
    throw new ArrayIndexOutOfBoundsException("no space available to add more elements");
  }
}
