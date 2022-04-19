package com.moon.drilled;

import com.moon.drilled.generate.AsynchronousGenerator;
import com.moon.drilled.generate.Generator;

public class DrilledApiFactory {
  public static Generator createGenerator(String apiKey) {
    return new Generator(apiKey);
  }

  public static AsynchronousGenerator createAsyncGenerator(String apiKey) {
    return new AsynchronousGenerator(apiKey);
  }
}
