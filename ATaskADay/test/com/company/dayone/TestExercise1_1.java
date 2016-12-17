package com.company.dayone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestExercise1_1 {

  @Test
  public void testUniqueCharacters() {
    // Given
    Exercise1_1 exc = new Exercise1_1();

    // When / Then
    try {
      exc.usingDataStructures("      ");
      fail("Exception should have been thrown");
    } catch (IllegalArgumentException e) {
      assertEquals("Blank string arg invalid", e.getMessage());
    }

    assertFalse(exc.usingDataStructures("There should not be unique characters"));
    assertFalse(exc.usingDataStructures("AaBbCcDdEeFfGgHhIiJj"));
    assertTrue(exc.usingDataStructures("A b c d e f g h i j k l m n o p q r s t u v w x y z"));

    try {
      exc.withoutUsingDataStructures("      ");
      fail("Exception should have been thrown");
    } catch (IllegalArgumentException e) {
      assertEquals("Blank string arg invalid", e.getMessage());
    }

    assertFalse(exc.withoutUsingDataStructures("There should not be unique characters"));
    assertFalse(exc.withoutUsingDataStructures("AaBbCcDdEeFfGgHhIiJj"));
    assertTrue(exc.withoutUsingDataStructures("A b c d e f g h i j k l m n o p q r s t u v w x y z"));
  }
}

