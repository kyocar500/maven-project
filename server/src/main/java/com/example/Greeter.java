package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

/**
 * This method returns a simple greeting using a name parameter.
 * @param someone name of a person.
 * @return a simple greeting String.
 */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
