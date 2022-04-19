package com.moon.drilled;

import com.moon.drilled.generate.AsynchronousGenerator;
import com.moon.drilled.generate.Generator;
import org.jetbrains.annotations.NotNull;

public class DrilledApiFactory {
  public static Generator createGenerator(@NotNull String apiKey) {
    return new Generator(apiKey);
  }

  public static AsynchronousGenerator createAsyncGenerator(@NotNull String apiKey) {
    return new AsynchronousGenerator(apiKey);
  }
}
