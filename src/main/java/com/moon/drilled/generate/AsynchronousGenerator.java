package com.moon.drilled.generate;

import com.moon.drilled.struct.Account;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class AsynchronousGenerator extends Generator {
  public AsynchronousGenerator(String apiKey) {
    super(apiKey);
  }

  @NotNull
  public CompletableFuture<Account> generateAsync() {
    return CompletableFuture.supplyAsync(this::generate);
  }
}
