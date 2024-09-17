package com.myplugin;

import io.camunda.plugin.search.header.CustomHeader;
import io.camunda.plugin.search.header.DatabaseCustomHeaderSupplier;

public class MyCustomHeaderPlugin implements DatabaseCustomHeaderSupplier {

  @Override
  public CustomHeader getSearchDatabaseCustomHeader() {
    final var header = new CustomHeader("X-Hello", "World");
    System.out.println(header);
    return header;
  }
}
