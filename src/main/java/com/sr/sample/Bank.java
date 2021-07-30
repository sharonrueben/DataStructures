package com.sr.sample;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Bank {
  private AccountType type;
  private Integer accountNumber;
  private Integer routingNumber;
  private String firstName;
  private String lastName;
  private LocalDate dateOfBirth;
  private Address address;
  private String phone;
  private String primaryEmail;
  private String secondaryEmail;
}
