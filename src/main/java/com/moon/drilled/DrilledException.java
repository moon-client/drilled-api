package com.moon.drilled;

import org.jetbrains.annotations.NotNull;

public class DrilledException extends RuntimeException {
  public DrilledException(@NotNull String message, @NotNull Throwable cause) {
    super(message, cause);
  }
}
