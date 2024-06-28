package com.stackademic.blog.three_scenarios_you_should_use_java_lambdas.scenario_03_implementing_functional_interfaces;

import java.util.function.Predicate;
import java.util.logging.Logger;

public class ImplementingFunctionalInterfacesWithoutLambda {
  private static final Logger LOGGER =
    Logger.getLogger(ImplementingFunctionalInterfacesWithoutLambda.class.getName());
  static public void main(String[] args) {
      Predicate<String> isStringLengthGreaterThanFive =
        new Predicate<String>() {
        @Override
        public boolean test(String string) {
          return string.length() > 5;
        }
      };
      LOGGER.info(
        String.format(
          "Length of string '%s' greater than five characters? '%s'\n",
          "Hello",
          isStringLengthGreaterThanFive.test("Hello")
        )
      );
    LOGGER.info(
      String.format(
        "Length of string '%s' greater than five characters? '%s'\n",
        "HelloWorld",
        isStringLengthGreaterThanFive.test("HelloWorld")
      )
    );
    return;
  }
}
