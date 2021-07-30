package com.sr.sample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Address {
  private String line1;
  private String line2;
  private String city;
  private String state;
  private String zipCode;
}
