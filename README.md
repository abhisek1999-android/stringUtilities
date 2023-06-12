# String Utils Library

The String Utils Library is a collection of useful utility functions for manipulating strings in Kotlin. It provides additional functionality beyond what is available in the standard library, making common string operations easier and more convenient.

## Features

- `capitalizeWords()`: Checks if a string is null or empty.
- `capitalizeFirstLetter()`: Checks if a string is null, empty, or consists only of whitespace characters.
- `countOccurrences(String str, String target)`: Counts the number of occurrences of a substring within a string.
- `reverse(String str)`: Reverses the characters in a string.
- `splitAndTrim(String str, String delimiter)`: Splits a string by a delimiter and trims leading/trailing whitespace from each resulting substring.
- `removeDuplicates(String str)`: Removes duplicate characters from a string.

## Usage

To use the String Utils Library in your Kotlin project, follow these steps:

1. Add the library as a dependency in your project.

2. Import the necessary utility functions from the library into your code.

3. Call the utility functions with the appropriate arguments to perform the desired string manipulation operations.

4. Enjoy the enhanced string manipulation capabilities provided by the library!

## Installation [![](https://jitpack.io/v/abhisek1999-android/StringUtils.svg)](https://jitpack.io/#abhisek1999-android/StringUtils)

You can install the String Utils Library by adding the following dependency to your project's build.gradle or build.gradle.kts file:
Step 1. Add the JitPack repository to your build file
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
   Step 2. Add the dependency
  ```
	dependencies {
	        implementation 'com.github.abhisek1999-android:StringUtils:Tag'
	}
  ```

