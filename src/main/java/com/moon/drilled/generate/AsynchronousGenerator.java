package com.moon.drilled.generate;

import com.moon.drilled.struct.Account;

import java.util.concurrent.CompletableFuture;

public class AsynchronousGenerator extends Generator {
  public AsynchronousGenerator(String apiKey) {
    super(apiKey);
  }

  public CompletableFuture<Account> generateAsync() {
    return CompletableFuture.supplyAsync(this::generate);
  }
}
