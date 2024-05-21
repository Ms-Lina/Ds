ertainly! Below is a sample README file for your project. It includes instructions on how to set up, compile, and run the Java program.

---

# UniqueInt

## Description
UniqueInt is a Java program that reads a list of integers from input files, filters out non-integer lines, and writes unique, sorted integers to output files.

## Project Structure
```
/dsa/hw01/
  ├── code/
  │   └── src/
  │       └── UniqueInt.java
  ├── sample_inputs/
  │   └── sample_input_01.txt
  │   └── sample_input_02.txt
  └── sample_results/
```

- `code/src/`: Contains the Java source code.
- `sample_inputs/`: Contains the input files with lists of integers.
- `sample_results/`: This directory will be populated with output files containing unique, sorted integers.

## Prerequisites
- Java Development Kit (JDK) installed on your system.

## Installation
1. **Update package index and install JDK:**
   ```bash
   sudo apt update
   sudo apt install default-jdk
   ```

2. **Verify the JDK installation:**
   ```bash
   javac -version
   java -version
   ```

## Setup
1. **Clone the repository or copy the project structure to your local system.**

2. **Navigate to the source code directory:**
   ```bash
   cd /dsa/hw01/code/src/
   ```

3. **Ensure the source file is named `UniqueInt.java` and contains the following code:**
   ```java
   import java.io.*;
   import java.nio.file.*;
   import java.util.*;

   public class UniqueInt {

       public static void processFile(String inputFilePath, String outputFilePath) {
           Set<Integer> uniqueIntegers = new TreeSet<>(); // TreeSet to keep sorted order

           try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFilePath))) {
               String line;
               while ((line = reader.readLine()) != null) {
                   line = line.trim();
                   if (line.isEmpty()) {
                       continue; // Skip empty lines
                   }
                   try {
                       int number = Integer.parseInt(line);
                       uniqueIntegers.add(number);
                   } catch (NumberFormatException e) {
                       // Ignore lines that are not valid integers
                   }
               }
           } catch (IOException e) {
               e.printStackTrace();
           }

           try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath))) {
               for (int number : uniqueIntegers) {
                   writer.write(String.valueOf(number));
                   writer.newLine();
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
       }

       public static void main(String[] args) {
           String inputDir = "/dsa/hw01/sample_inputs/";
           String outputDir = "/dsa/hw01/sample_results/";

           try {
               Files.createDirectories(Paths.get(outputDir));
               Files.li```

## Usage
1. **Compile the Java program:**
   ```bash
   javac UniqueInt.java
   ```

2. **Run the compiled program:**
   ```bash
   java UniqueInt
   ```

## Expected Output
- For each input file in `/dsa/hw01/sample_inputs/`, an output file will be created in `/dsa/hw01/sample_results/`.
- The output file will contain unique, sorted integers from the corresponding input file, with one integer per line.

## Example
### Input File: `sample_input_01.txt`
```
5
14
5
-9
62
-1
-9
-9
```

### Output File: `sample_input_01.txt_results.txt`
```
-9
-1
5
14
62
```

## Notes
- The program handles variations such as white spaces, empty lines, lines with multiple integers, and non-integer lines by skipping them.
- Ensure the directory paths are correctly set up before running the program.

---
