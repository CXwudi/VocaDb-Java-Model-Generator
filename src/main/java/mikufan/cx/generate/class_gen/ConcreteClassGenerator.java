package mikufan.cx.generate.class_gen;

import lombok.SneakyThrows;
import mikufan.cx.generate.appender.CommonAppender;
import mikufan.cx.generate.store_info.FieldInfo;
import org.apache.logging.log4j.util.Strings;
import org.eclipse.collections.api.factory.Lists;

import java.util.List;

public class ConcreteClassGenerator extends AbstractClassGenerator{

  @Override
  public String generateClass(
      List<FieldInfo> fields,
      String clazz,
      String genericClazz //should ignore
  ) {
    generateBeforeClass(beforeClassSb);
    generateClassDeclaration(clazz, classDeclarationSb);
    generateFields(fields, fieldSb);
    return finalGeneration(beforeClassSb, classDeclarationSb, fieldSb);

  }

  /**
   * //auto-generated ...
   * package ...
   *
   * import ...
   * ...
   *
   */
  protected String generateBeforeClass(StringBuilder beforeClassSb) {
    CommonAppender.addComments(beforeClassSb);
    CommonAppender.addPackage(beforeClassSb, "dummy_package");
    beforeClassSb.append(Strings.LINE_SEPARATOR);
    CommonAppender.addEclispeCollAndLombokImport(beforeClassSb);
    beforeClassSb.append(Strings.LINE_SEPARATOR);

    return beforeClassSb.toString();
  }
  /**
   * \@Annotation
   * public class Clazz {
   *
   *
   */
  protected String generateClassDeclaration(String clazz, StringBuilder classDeclarationSb) {
    CommonAppender.addBasicLombokAnnotationOnClass(classDeclarationSb);
    CommonAppender.addLombokConstructorAnnotationOnClass(classDeclarationSb);
    return classDeclarationSb.append("public class ").append(clazz.strip()).append(" {")
        .append(Strings.LINE_SEPARATOR).append(Strings.LINE_SEPARATOR).toString();
  }

  /**
   *   \@JsonProperty
   *   private Type field\;
   *
   *
   */
  @SneakyThrows
  protected String generateFields(List<FieldInfo> fields, StringBuilder fieldSb) {

    for (int i = 0; i < fields.size(); i++) {
      var field = fields.get(i);
      var annotations = Lists.immutable.withAll(field.getAnnotations());
      fieldSb.append("  ").append(annotations.makeString(" ")).append(Strings.LINE_SEPARATOR);
      fieldSb.append("  ").append("private ").append(field.getType()).append(" ").append(field.getName())
          .append(';').append(Strings.LINE_SEPARATOR).append(Strings.LINE_SEPARATOR);
    }

    return fieldSb.toString();
  }

  /**
   * //aggregate all above in order and add:
   * /}
   *
   * @param stringBuilders an array of string builder,
   *                       first one must be the final sb, followed by a list of sbs that will be concat into the first one
   */
  protected String finalGeneration(StringBuilder... stringBuilders) {
    var destSb = stringBuilders[0];
    for (int i = 1; i < stringBuilders.length; i++) {
      destSb.append(stringBuilders[i].toString());
    }
    destSb.append("}").append(Strings.LINE_SEPARATOR);
    return destSb.toString();
  }
}