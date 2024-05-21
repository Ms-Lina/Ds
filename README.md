# UniqueInt

## Description
UniqueInt is a Java program that reads a list of integers from input files, filters out non-integer lines, and writes unique, sorted integers to output files.

## Project Structure
```
/Ds/
└── UniqueInt.java
└── /hw01/
  ├── sample_inputs/
  │   └── sample_input_01.txt
  │   └── ....
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
   cd /Ds/
   ```


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
## Developer
-`Lina IRATWE`
---
