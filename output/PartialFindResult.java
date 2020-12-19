// auto-generated by get-my-vocadb-java-model at 2020-12-19T03:10:29.269325
package dummy_package;

import lombok.*;
import lombok.experimental.*;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter @ToString
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@SuperBuilder(toBuilder = true) @Jacksonized
public class PartialFindResult<T> {

   List<T> items;
   String term;
   int totalCount;

}
