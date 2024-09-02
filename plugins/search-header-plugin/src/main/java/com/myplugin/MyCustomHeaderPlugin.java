package com.myplugin;

import io.camunda.plugin.search.header.CustomHeader;
import io.camunda.plugin.search.header.DatabaseCustomHeaderSupplier;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class MyCustomHeaderPlugin implements DatabaseCustomHeaderSupplier {

  public MyCustomHeaderPlugin() {
    try {
      new File("/tmp/123.test").createNewFile();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public CustomHeader getElasticsearchCustomHeader() {
    var x = new CustomHeader("X-Custom-Header", UUID.randomUUID().toString());
    System.out.println(x);
    return x;
  }
}
