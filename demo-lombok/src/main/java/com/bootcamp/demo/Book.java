package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter; // code
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Java Developer: You have to 100% understand the generated code after compile

// Maven:
// Re-define compile process:
// 1. "mvn clean compile" -> Check if any External annoitation (outside JDK)
// 2. if yes, re-generate the java source code (java file)
// 3. Compile class file (byte code)

@Getter // class level annotation, apply for all attributes
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString (exclude = "author") //or exclude a String[] (exclude = {"author", "price"})
@EqualsAndHashCode
public class Book {
  private int id;
  private String author;
  private double price;
}
