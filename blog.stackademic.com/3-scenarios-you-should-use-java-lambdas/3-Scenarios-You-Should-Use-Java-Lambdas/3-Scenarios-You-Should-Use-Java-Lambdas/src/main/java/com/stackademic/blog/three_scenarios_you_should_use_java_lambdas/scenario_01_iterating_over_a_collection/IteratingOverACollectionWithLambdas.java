package com.stackademic.blog.three_scenarios_you_should_use_java_lambdas.scenario_01_iterating_over_a_collection;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class IteratingOverACollectionWithLambdas {
  private static final Logger LOGGER =
    Logger.getLogger(IteratingOverACollectionWithoutLambdas.class.getName());
  static public void main(String... args) {
      List<String> listOfNames = Arrays.<String>asList(
        "Alice",
        "Bob",
        "Charlie"
      );
      listOfNames.forEach(
        aName -> LOGGER.info(
          String.format(
            "Name is: '%s'\n",
            aName
          )
        )
      );
    return;
  }
}
