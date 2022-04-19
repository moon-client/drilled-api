package com.moon.drilled.generate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.moon.drilled.DrilledException;
import com.moon.drilled.struct.Account;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Generator {
  private static final String DRILLED_API_URL = "http://drilledalts.xyz/api/gen?key=";
  private static final Gson GSON = new GsonBuilder().create();
  private final String apiKey;

  public Generator(String apiKey) {
    this.apiKey = apiKey;
  }

  @Nullable
  public Account generate() {
    try {
      String response = request(DRILLED_API_URL + apiKey);
      return GSON.fromJson(response, Account.class);
    } catch (IOException e) {
      throw new DrilledException("Failed to generate an account with drilled alts", e);
    }
  }

  private String request(@NotNull String url) throws IOException {
    URLConnection connection = new URL(url).openConnection();
    InputStream stream = connection.getInputStream();

    byte[] content = new byte[stream.available()];
    //noinspection ResultOfMethodCallIgnored
    stream.read(content);

    return new String(content);
  }
}
