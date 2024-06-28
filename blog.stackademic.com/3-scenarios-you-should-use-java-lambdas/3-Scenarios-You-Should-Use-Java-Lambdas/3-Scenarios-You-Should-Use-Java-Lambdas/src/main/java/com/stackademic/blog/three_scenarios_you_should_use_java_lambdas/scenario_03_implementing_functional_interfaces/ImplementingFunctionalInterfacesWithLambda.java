package com.stackademic.blog.three_scenarios_you_should_use_java_lambdas.scenario_03_implementing_functional_interfaces;

import java.util.function.Predicate;
import java.util.logging.Logger;

public class ImplementingFunctionalInterfacesWithLambda {
  private static final Logger LOGGER =
    Logger.getLogger(ImplementingFunctionalInterfacesWithLambda.class.getName());
  public static void main(String... args) {
      Predicate<String> isStringLengthGreaterThanFiveCharacters =
        (String string) -> string.length() > 5;
      LOGGER.info(
        String.format(
          "Length of string '%s' greater than five characters? '%s'\n",
          "Hello",
          isStringLengthGreaterThanFiveCharacters.test("Hello")
        )
      );
      LOGGER.info(
        String.format(
          "Length of string '%s' greater than five characters? '%s'\n",
          "HelloWorld",
          isStringLengthGreaterThanFiveCharacters.test("HelloWorld")
        )
      );
    return;
  }
}
