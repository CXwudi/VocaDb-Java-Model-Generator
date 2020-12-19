// auto-generated by get-my-vocadb-java-model at 2020-12-19T03:10:29.8697224
package dummy_package;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter @ToString
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Builder(toBuilder = true) @Jacksonized
public final class WebLink {

   String category;
   String description;
   String descriptionOrUrl;
   boolean disabled;
   int id;
   String url;

}
