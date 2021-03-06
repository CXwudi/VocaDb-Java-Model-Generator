package mikufan.cx.generate;

import lombok.SneakyThrows;
import mikufan.cx.generate.store_info.ClassInfo;
import mikufan.cx.generate.store_info.FieldInfo;

import java.util.regex.Pattern;

public class FieldReader {

  public static final Pattern FIELD_MATCHER =
      Pattern.compile("(?<className>\\w+)\\s+\\((?<type>[\\w\\[\\]]+),\\s+(?<optional>\\w+)\\)");

  @SneakyThrows
  public String readFieldAndStore(String line, ClassInfo.ClassInfoBuilder builder, Action whatClazz) {
    //use regax match
    var matcher = FIELD_MATCHER.matcher(line);
    var fieldName = "";
    var typeName = "";
    var optional = "";
    if (matcher.find()){
      fieldName = matcher.group("className");
      typeName = matcher.group("type");
      optional = matcher.group("optional");
    } else {
      throw new Exception("fail to match: " + line);
    }
    builder.field(FieldInfo.builder()
        .type(getJavaType(typeName))
        .name(fieldName)
        //.annotation("@JsonProperty")
        // for concrete class, use field default lombok annotation
        //.modifier(whatClazz == Action.NEW_GENERIC_CLASS ? "protected" : "private")
        .build());

    return builder.toString();
  }

  private String getJavaType(String typeName){
    String realType = "";
    if (typeName.equalsIgnoreCase("string")){
      realType = "String";
    } else if (typeName.equalsIgnoreCase("integer")){
      realType = "int";
    } else if (typeName.equalsIgnoreCase("number")){
      realType = "double";
    } else if (typeName.equalsIgnoreCase("boolean")){
      realType = "boolean";
    } else if (typeName.contains("Array")){
      realType = "List<" + typeName.substring(typeName.indexOf("[")+1, typeName.indexOf("]")) + ">";
    } else {
      realType = typeName;
    }
    return realType;
  }
}
