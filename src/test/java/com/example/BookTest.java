package com.example;

import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

import com.example.classes.Book;

public class BookTest {
  @Test

  public void testGetAge(){
    Book book = new Book("Autant En Emporte Le Vent", "Margarett Mitchell", 1936);
    int result = book.getAge();
    assertEquals(88, result);
  }
}
