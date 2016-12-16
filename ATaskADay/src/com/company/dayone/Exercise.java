package com.company.dayone;

import java.util.HashSet;
import java.util.Set;

class Exercise {

  public boolean identifyUniqueCharactersOnly(String string) {
    // Remove white spaces
    string = string.replaceAll(" ", "");

    Set<Character> set = new HashSet<>();

    for (int i = 0 ; i < string.length() - 1; i++) {
      if (!set.add(string.charAt(i))) {
        return false;
      }
    }

    return true;
  }
}