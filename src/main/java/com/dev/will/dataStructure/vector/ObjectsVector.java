package com.dev.will.dataStructure.vector;

import org.jetbrains.annotations.NotNull;

public class ObjectsVector {
  private @NotNull Object[] elements;
  private int size;

  public ObjectsVector (int capacity) {
    this.elements = new Object[capacity];
    this.size = 0;
  }

  public boolean add (@NotNull Object element) {
    moreCapacity();
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

  public @NotNull Object getElementByIndex (int index) {
    if (!(index >= 0 && index < this.size)) {
      throw new IllegalArgumentException("invalid index");
    }
    return this.elements[index];
  }

  public boolean contains (@NotNull Object element) {
    for (int i = 0; i < this.size; i++) {
      if (this.elements[i].equals(element)) {
        return true;
      }
    }

    return false;
  }

  public void  add (int index, @NotNull Object element) {
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

  private void moreCapacity () {
    if (this.size == this.elements.length) {
      @NotNull Object[] newElements = new Object[this.elements.length * 2];
      
      for (int i = 0; i < this.elements.length; i++) {
        newElements[i] = this.elements[i];
      }

      this.elements = newElements;
    }
  }

  public void remove (int index) {
    if (!(index >= 0 && index < this.size)) {
      throw new IllegalArgumentException("invalid index");
    }

    for (int i = index; i < this.elements.length - 1; i++) {
      this.elements[i] = this.elements[i + 1];
    }

    this.size = this.size - 1;
  }
}
