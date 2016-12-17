package com.company.dayone;

import java.util.HashSet;
import java.util.Set;

class Exercise1_1 {

  public boolean usingDataStructures(String string) {
    string = cleanAndValidateInput(string);

    Set<Character> set = new HashSet<>();

    for (char ch : string.toCharArray()) {
      if (!set.add(ch)) {
        return false;
      }
    }
    return true;
  }


  public boolean withoutUsingDataStructures(String string) {
    string = cleanAndValidateInput(string);

    int length = string.length();

    String lastCharacter = Character.toString(string.charAt(length -1));
    string = string.substring(0, length - 1);

    return recursivelyCheckForUniqueChars(string, lastCharacter);
  }


  private boolean recursivelyCheckForUniqueChars(String string, String character) {
    if (string.length() == 0) {
      return true;
    } else if (string.contains(character)) {
      return false;
    } else {
      return recursivelyCheckForUniqueChars(string.substring(0, string.length() -1), Character.toString(string.charAt(string.length() -1)));
    }
  }


  private String cleanAndValidateInput(String string) {
    string = string.replaceAll(" ", "");
    string = string.toLowerCase();

    if (string.length() == 0) {
      throw new IllegalArgumentException("Blank string arg invalid");
    }

    return string;
  }
}