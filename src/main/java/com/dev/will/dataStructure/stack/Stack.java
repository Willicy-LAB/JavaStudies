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
}
