package com.dev.will.dataStructure.vector;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

public class Array {

  public static void main(String[] args) {
    @NotNull ArrayList<@NotNull String> arrayList = new ArrayList<@NotNull String>();

    arrayList.add("A");
    arrayList.add("C");

    arrayList.add(1, "B");

    System.out.println(arrayList.toString());

    boolean exist = arrayList.contains("A");

    if (exist) {
      System.out.println("The element exist in the array.");
    } else {
      System.out.println("The element not exist in the array.");
    }

    int position = arrayList.indexOf("B");

    if (position > -1) {
      System.out.println("The position " + position + " exist in the array");
    } else {
      System.out.println("The position " + position + " not exist in the array");
    }

    System.out.println(arrayList.get(1));

    arrayList.remove(0);
    arrayList.remove("B");

    System.out.println(arrayList.toString());

    System.out.println(arrayList.size());
  }
}
