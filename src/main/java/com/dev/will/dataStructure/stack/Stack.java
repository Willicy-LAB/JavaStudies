package com.dev.will.dataStructure.stack;

import org.jetbrains.annotations.NotNull;

public class Stack<T> {
  private @NotNull T[] elements;
  private int size;

  public Stack(int capacity) {
    this.elements = (T[]) new Object[capacity];
    this.size = 0;
  }

  public Stack () {
    this(10);
  }

  public boolean add (@NotNull T element) {
    moreCapacity();
    if (this.size < this.elements.length) {
      this.elements[this.size] = element;
      this.size = this.size + 1;

      return true;
    }

    return false;
  }
  
  public boolean add (int index, @NotNull T element) {
    if (!(index >= 0 && index < size)) {
      return false;
    }

    moreCapacity();

    for (int i = this.size - 1; i >= index; ) {
      this.elements[i + 1] = this.elements[i];

      i = i - 1;
    }

    this.elements[index] = element;
    this.size = size + 1;

    return true;
  }

  private void moreCapacity () {
    if (this.size == this.elements.length) {
      @NotNull T[] newElements = (T[]) new Object[this.elements.length * 3 / 2 + 1];

      for (int i = 0; i < this.elements.length; ) {
        newElements[i] = this.elements[i];
      }

      this.elements = newElements;
    }
  }

  public int getSize() {
    return size;
  }

  @Override
  public @NotNull String toString () {
    @NotNull StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");

    for (int i = 0; i < this.size - 1; ) {
      stringBuilder.append(this.elements[i]);
      stringBuilder.append(", ");

      i = i + 1;
    }

    if (this.size > 0) {
      stringBuilder.append(this.elements[this.size - 1]);
    }

    stringBuilder.append("]");

    return stringBuilder.toString();
  }
}
