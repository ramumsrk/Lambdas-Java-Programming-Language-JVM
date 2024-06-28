package com.stackademic.blog.three_scenarios_you_should_use_java_lambdas.scenario_02_sorting_a_list;

import java.util.List;
import java.util.logging.Logger;
import java.util.Arrays;

public class SortingAListWithLambdas {
  private static final Logger LOGGER =
    Logger.getLogger(SortingAListWithLambdas.class.getName());
  static public void main(String... args) {
       List<String> listOfNames = Arrays.<String>asList(
         "Charlie",
         "Alice",
         "Bob"
       );
       listOfNames.sort((string, anotherString) -> string.compareTo(anotherString));
       LOGGER.info(
         String.format(
           "Sorted list is: '%s'\n",
           listOfNames
         )
       );
    return;
  }
}
