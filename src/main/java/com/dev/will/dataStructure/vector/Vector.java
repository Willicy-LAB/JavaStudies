package com.dev.will.dataStructure.vector;

import org.jetbrains.annotations.NotNull;

public class Vector {

  private @NotNull String[] elements;
  private int size;

  public Vector(int capacity) {
    this.elements = new String[capacity];
    this.size = 0;
  }

  public boolean add(@NotNull String element) {
    moreCapacity();
    if (this.size < this.elements.length) {
      this.elements[this.size] = element;
      this.size = this.size + 1;

      return true;
    }
    return false;
  }

  public void add(int index, @NotNull String element) {
    moreCapacity();
    if (!(index >= 0 && index < this.size)) {
      throw new IllegalArgumentException("invalid index");
    }

    for (int i = this.size - 1; i >= index; i--) {
      this.elements[i + 1] = this.elements[i];
    }

    this.elements[index] = element;
    this.size = this.size + 1;
  }

  public void remove(int index) {
    if (!(index >= 0 && index < this.size)) {
      throw new IllegalArgumentException("invalid index");
    }

    for (int i = index; i < this.elements.length - 1; i++) {
      this.elements[i] = this.elements[i + 1];
    }

    this.size = this.size - 1;
  }

  public @NotNull String getElementByIndex(int index) {
    if (!(index >= 0 && index < this.size)) {
      throw new IllegalArgumentException("invalid index");
    }
    return this.elements[index];
  }

  public boolean contains(@NotNull String element) {
    for (int i = 0; i < this.size; i++) {
      if (this.elements[i].equalsIgnoreCase(element)) {
        return true;
      }
    }
    return false;
  }

  private void moreCapacity() {
    if (this.size == this.elements.length) {
      @NotNull String[] newElements = new String[this.elements.length * 2];

      for (int i = 0; i < this.elements.length; i++) {
        newElements[i] = this.elements[i];
      }

      this.elements = newElements;
    }
  }

  public @NotNull String[] getElements() {
    return elements;
  }

  public int getSize() {
    return this.size;
  }

  public @NotNull String toString() {
    @NotNull StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");

    for (int i = 0; i < this.size - 1; i++) {
      stringBuilder.append(this.elements[i]);
      stringBuilder.append(", ");
    }

    if (this.size > 0) {
      stringBuilder.append(this.elements[this.size - 1]);
    }

    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}

