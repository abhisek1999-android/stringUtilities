# String Utils Library

The String Utils Library is a collection of useful utility functions for manipulating strings in Kotlin. It provides additional functionality beyond what is available in the standard library, making common string operations easier and more convenient.

## Features

- `capitalizeWords()`: Capitalise first character of every string. Eg : string util = String util
- `capitalizeFirstLetter()`: Capitalise first charcters of every word in a sentence.
-  MORE TO BE ADD

## Usage

To use the String Utils Library in your Kotlin project, follow these steps:

1. Add the library as a dependency in your project.

2. Import the necessary utility functions from the library into your code.

3. Call the utility functions with the appropriate arguments to perform the desired string manipulation operations.
```kotlin
var sampleString = "string utils"
var res = sampleString.capitalizeWords() // String utils

```

4. Enjoy the enhanced string manipulation capabilities provided by the library!
5. Note : These are all extension functions . So, use those like that way.

## Installation [![](https://jitpack.io/v/abhisek1999-android/stringUtilities.svg?style=flat-square)](https://jitpack.io/#abhisek1999-android/stringUtilities)

You can install the String Utils Library by adding the following dependency to your project's build.gradle or build.gradle.kts file:
Step 1. Add the JitPack repository to your build file
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
   Step 2. Add the dependency
  ```gradle
	dependencies {
	        implementation 'com.github.abhisek1999-android:StringUtils:Tag'
	}
  ```

