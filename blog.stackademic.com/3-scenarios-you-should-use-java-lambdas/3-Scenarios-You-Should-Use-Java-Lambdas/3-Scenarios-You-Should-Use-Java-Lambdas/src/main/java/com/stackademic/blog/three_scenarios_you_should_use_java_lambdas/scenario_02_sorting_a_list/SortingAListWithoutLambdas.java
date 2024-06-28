package com.stackademic.blog.three_scenarios_you_should_use_java_lambdas.scenario_02_sorting_a_list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class SortingAListWithoutLambdas {
  private static final Logger LOGGER =
    Logger.getLogger(SortingAListWithoutLambdas.class.getName());
  public static void main(String... args) {
      List<String> listOfNames = Arrays.<String>asList(
        "Charlie",
        "Alice",
        "Bob"
      );
      listOfNames.sort(
        new Comparator<String>() {
          @Override
          public int compare(String string, String anotherString) {
            return string.compareTo(anotherString);
          }
        }
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