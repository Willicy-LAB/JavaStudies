package com.dev.will.dataStructure.vector;

import org.jetbrains.annotations.NotNull;

public class Vector {

  private @NotNull String[] elements;
  private int size;

  public Vector (int capacity) {
    this.elements = new String[capacity];
    this.size = 0;
  }

  public @NotNull String[] getElements () {
    return elements;
  }

  /* first version of method add
  public void add (@NotNull String element) {
    for (int i = 0; i < this.elements.length; i++) {
      if (this.elements[i] == null) {
        this.elements[i] = element;
        return;
      }
    }

    throw new ArrayIndexOutOfBoundsException("no space available to add more elements");
  }
  */

  // second version of method add
  public void add(@NotNull String element) {
    if (this.size < this.elements.length) {
      this.elements[this.size] = element;
      this.size = this.size + 1;

      return;
    }

    throw new ArrayIndexOutOfBoundsException("no space available to add more elements");
  }
 }
