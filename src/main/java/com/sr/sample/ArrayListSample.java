package com.sr.sample;

import java.util.*;

public class ArrayListSample {

  public void testArrayList() {
    List<Integer> numbersList1 = new ArrayList<>();
    List<Integer> numbersList2 = new ArrayList<>();
    ArrayList<Integer> numberList3 =
        new ArrayList<>(Arrays.asList(new Integer[] {2, 5, 65, 73, 19, 60}));
    numbersList1.add(10);
    numbersList1.add(20);
    numbersList1.add(30);
    numbersList1.add(0, 5);
    numbersList1.remove(2);
    // System.out.println(numbersList1);
    numbersList2.addAll(numbersList1);
    numbersList2.add(55);
    numbersList2.add(2, 34);
    System.out.println("Array List 2 contains the following elements" + numbersList2);
    numbersList1.add(3, 34);
    System.out.println("Array List 1 contains the following elements " + numbersList1);
    Boolean containsCondition = numbersList2.contains(30);
    System.out.println("The value of contains function here is " + containsCondition);
    numbersList2.addAll(numbersList1);
    System.out.println("The updated number list 2 is" + numbersList2);
    numbersList2.remove(4);
    System.out.println("The updated number list 2 second time is " + numbersList2);
    Boolean value = numbersList1.containsAll(numbersList2);
    System.out.println("This is the test on containsAll method " + value);
    if (numbersList2 != null && numbersList2.size() > 0) {
      for (Integer element : numbersList2) {
        System.out.println(element);
      }
      /*numbers.stream().forEach(System.out::println);
      numbers.stream().forEach(a -> System.out.println("Elements in ArrayList -> " + a));*/
      System.out.println(numbersList1.equals(numbersList2));
      System.out.println("Test index of equals method " + numbersList1.indexOf(30));
      ListIterator<Integer> listItr = numbersList2.listIterator();
      Iterator<Integer> e = numbersList1.iterator();
      while (e.hasNext()) {
        System.out.println("Elements in numberList1 from beginning " + e.next());
      }
      while (listItr.hasNext()) {
        Integer ele = listItr.next();
        System.out.println("Element in numberList 2 from beginning " + ele);
      }
      while (listItr.hasPrevious()) {
        System.out.println("Reverse order of numberList2 is " + listItr.previous());
      }
      for (Integer ele : numberList3) {
        System.out.println("These are the elements of list 3 :" + ele);
      }
    }
  }
}
