package mikufan.cx.generate;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

import static mikufan.cx.generate.Action.*;

@Slf4j
public class Main {

  @SneakyThrows
  public static void main(String[] args) {
    var modelFile = Path.of(args[0]);
    var modelString = Files.readString(modelFile);
    var eachLine = modelString.split("\n");
    Set<String> existingClasses = new HashSet<>();

    String currentClassName = "";
    ActionPerformer actionPerformer = new ActionPerformer();
    for (var line : eachLine){
      if(line.isEmpty() || line.equals(Strings.LINE_SEPARATOR)){
        continue;
      }
      var indication = ActionDecider.whatNext(line);
      var returnString = actionPerformer.performAction(indication, line);
      log.info("indication = {}, line = {}", indication, line);
      if (indication == NEW_CLASS || indication == NEW_GENERIC_CLASS){
        currentClassName = returnString;
        if (existingClasses.contains(currentClassName)){
          throw new RuntimeException(currentClassName + " already exist, correct your model txt input file");
        }
      }
      if (indication == END_CLASS && returnString.length() > 0){
        var dir = Path.of("output");
        var outputFile = dir.resolve(currentClassName + ".java");
        if (!dir.toFile().isDirectory()){
          Files.createDirectories(dir);
        }
        outputFile.toFile().createNewFile();
        Files.writeString(outputFile, returnString);
        existingClasses.add(currentClassName);
        actionPerformer = new ActionPerformer();
      }
    }
  }
}
