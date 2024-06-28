package com.stackademic.blog.three_scenarios_you_should_use_java_lambdas.scenario_01_iterating_over_a_collection;

import java.util.List;
import java.util.logging.Logger;

public class IteratingOverACollectionWithoutLambdas {
  private static final Logger LOGGER =
    Logger.getLogger(IteratingOverACollectionWithoutLambdas.class.getName());
  public static void main(String[] args) {
      List<String> listOfNames = List.of(
        "Alice",
        "Bob",
        "Charlie"
      );
      for (var aName : listOfNames) {
        LOGGER.info(
          String.format(
            "Name is: '%s'\n",
            aName
          )
        );
      }
    return;
  }
}