package com.company.dayone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestExercise {

  @Test
  public void testUniqueCharacters() {
    // Given
    Exercise exc = new Exercise();

    // When / Then
    assertFalse(exc.identifyUniqueCharactersOnly("There should not be unique characters"));
    assertTrue(exc.identifyUniqueCharactersOnly("A b c d e f g h i j k l m n o p q r s t u v w x y z"));
  }
}

