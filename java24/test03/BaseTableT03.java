
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List; // Add this import statement
import java.io.IOException; // Add this import statement

public abstract class BaseTableT03 {
  protected String fname;

  abstract void inputData();

  abstract void printData();

  abstract void find(String name) throws HeroNotFoundExceptionT03, MonsterNotFoundExceptionT03;

  public List<String> readFile() throws IOException {
    Path inputFilePath = Paths.get(fname);
    List<String> lines = Files.readAllLines(inputFilePath);
    return lines;
  }
}
