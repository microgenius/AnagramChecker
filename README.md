# Anagram Checker

This is a Java program that checks whether two words are anagrams of each other.

## Usage

To run the Anagram Checker program locally, you can use the following command:

```bash
java -jar anagram-checker-1.0-SNAPSHOT.jar <word1> <word2>
```

Replace `<word1>` and `<word2>` with the words you want to check for anagrams.

For example, to check if "listen" and "silent" are anagrams, run:

```bash
java -jar anagram-checker-1.0-SNAPSHOT.jar listen silent
```

## Build with Maven

If you prefer to build the project with Maven, you can use the following command:

```bash
mvn package
```

This command compiles the Java source code, runs the tests, and packages the application into a JAR file.

## Running the Tests

To run the unit tests, use the following command:

```bash
mvn test
```

This command executes the JUnit tests and displays the test results.

## Docker

You can also run the Anagram Checker program using Docker. Ensure you have Docker installed on your system.

To build the Docker image, use the following command:

```bash
docker build -t anagram-checker .
```

To run the container and check if two words are anagrams, execute the following command:

```bash
docker run anagram-checker <word1> <word2>
```

Replace `<word1>` and `<word2>` with the words you want to check for anagrams. If either word contains spaces, enclose it in quotation marks (`"`).

For example, to check if "hello world" and "world hello" are anagrams:

```bash
docker run anagram-checker "hello world" "world hello"
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
