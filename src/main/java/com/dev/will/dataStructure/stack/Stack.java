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
}
