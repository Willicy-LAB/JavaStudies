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

  /* second version of method add
  public void add(@NotNull String element) {
    if (this.size < this.elements.length) {
      this.elements[this.size] = element;
      this.size = this.size + 1;

      return;
    }

    throw new ArrayIndexOutOfBoundsException("no space available to add more elements");
  }
  */

  // same method add v2 but with a little modification
   public boolean add(@NotNull String element) {
    if (this.size < this.elements.length) {
      this.elements[this.size] = element;
      this.size = this.size + 1;

      return true;
    }

    return false;
  }

  public int getSize () {
    return this.size;
  }

  public @NotNull String toString () {
    @NotNull StringBuilder stringBuilder = new StringBuilder();

    stringBuilder.append("[");

    for (int i = 0; i < this.size - 1; i++) {
      stringBuilder.append(this.elements[i]);
      stringBuilder.append(", ");
    }

    if (this.size > 0) {
      stringBuilder.append(this.elements[this.size-1]);
    }

    stringBuilder.append("]");

    return stringBuilder.toString();
  }

  public @NotNull String getElementByIndex (int index) {
    if (!(index >= 0 && index < this.size)) {
      throw new IllegalArgumentException("invalid index");
    }
    return this.elements[index];
  }
 }
