# Drilled Alts Wrapper (Java)

This Wrapper can be used to easily implement the Drilled generator API into your client

![https://www.oracle.com/java/technologies/downloads/#java8](https://img.shields.io/badge/java-8%2B-blue)
![https://github.com/moon-client/drilled-api/releases/tag/1.0.0](https://img.shields.io/badge/version-1.0.0-yellowgreen)
![https://github.com/moon-client/drilled-api/blob/master/LICENSE.md](https://img.shields.io/github/license/moon-client/drilled-api)

## Requirements

* Java 8
* Gson (version shouldn't matter)

## Usage

To create a `Generator` you need to use the `DrilledApiFactory`

```java
import com.moon.drilled.DrilledApiFactory;

// Basic generator implementation
Generator generator = DrilledApiFactory.createGenerator("your api key");
// Asynchronous version of the generator
AsynchronousGenerator = DrilledApiFactory.createAsyncGenerator("your api key");
```
The usage of the so called `Generator` should be straight forward and easy to understand<br>
We do not provide **any** support on the api / how to implement it fully, only for actual issues which need to be fixed

## License
Copyright (c) 2022 Moon Client<br>
This project uses the MIT License