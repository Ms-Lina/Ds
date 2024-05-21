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
        String inputDir = "./hw01/sample_inputs/";
        String outputDir = "./hw01/sample_results/";

        try {
            Files.createDirectories(Paths.get(outputDir));
            Files.list(Paths.get(inputDir)).forEach(inputPath -> {
                if (Files.isRegularFile(inputPath)) {
                    String inputFileName = inputPath.getFileName().toString();
                    String outputFileName = inputFileName + "_results.txt";
                    processFile(inputPath.toString(), outputDir + outputFileName);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

