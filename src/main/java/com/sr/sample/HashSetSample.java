package com.sr.sample;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class HashSetSample<num> {

  public void testHashSet() {
    Set<Bank> customerSet = new HashSet<>();
    Address addressSharon = new Address("3 Dorchester", "Apt 107", "Pittsburgh", "PA", "15241");
    Address addressDheepika =
        Address.builder()
            .line1("4 Dorchester")
            .line2("Apt 503")
            .city("Charlotte")
            .state("NC")
            .zipCode("28211")
            .build();
    Bank sharonAccount =
        Bank.builder()
            .accountNumber(1234567)
            .routingNumber(178348999)
            .address(addressSharon)
            .dateOfBirth(LocalDate.of(2001, 04, 01))
            .firstName("Sharon")
            .lastName("Rueben")
            .phone("+19803093952")
            .primaryEmail("abc@xyz.com")
            .secondaryEmail("bcd@xyz.com")
            .type(AccountType.CHECKING_ACCOUNT)
            .build();
    Bank dheepikaAccount =
        Bank.builder()
            .accountNumber(1294567)
            .routingNumber(178343299)
            .address(addressDheepika)
            .dateOfBirth(LocalDate.of(2005, 04, 01))
            .firstName("Dheepika")
            .lastName("Kannan")
            .phone("+19803090952")
            .primaryEmail("axc@xyz.com")
            .secondaryEmail("hcd@xyz.com")
            .type(AccountType.CHECKING_ACCOUNT)
            .build();

    customerSet.add(sharonAccount);
    customerSet.add(dheepikaAccount);
    Set<Integer> numberSet = new HashSet<>();
    Set<Integer> numberSet2 = new HashSet<>();
    Set<String> nameSet = new HashSet<>();
    List<String> names =
        new ArrayList<>(
            Arrays.asList(
                new String[] {"Sharon", "HariPriya", "Megala", "bujji", "Sharon", "bujji"}));
    numberSet.add(1);
    numberSet.add(20);
    numberSet.add(34);
    numberSet.add(56);
    numberSet2.add(10);
    numberSet2.add(15);
    numberSet2.add(30);
    numberSet2.add(50);
    System.out.println("This is to print the objects in list num");
    Integer removeElement = Integer.valueOf(56);
    numberSet.addAll(numberSet2);
    System.out.println("The updated numberSet before removal is " + numberSet);
    Set<Integer> filteredUnion = numberSet.stream().filter(e -> e != removeElement).collect(Collectors.toSet());
    System.out.println("The updated numberSet after removal is " + filteredUnion);
//    Iterator<Integer> iteratorNum = numberSet.iterator();
//    while (iteratorNum.hasNext()) {
//      Integer element = iteratorNum.next();
//      // if (element.compareTo(56) == 0) {
//      if (element == removeElement) {
//        numberSet.remove(removeElement);
//        System.out.println("Removed Value is " + removeElement);
//
//      }
//    }

    System.out.println("These are duplicate elements in the list");
    for (String e : names) {
      if (!nameSet.add(e)) {
        System.out.println(e);
      }
    }
    System.out.println("The elements in the set are" + nameSet);

    System.out.println(nameSet.stream().count());
    System.out.println(nameSet);
  }
}
