// auto-generated by get-my-vocadb-java-model at 2020-12-19T03:10:29.8577536
package dummy_package;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter @ToString
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Builder(toBuilder = true) @Jacksonized
public final class ArtistForEvent {

   Artist artist;
   String effectiveRoles;
   int id;
   String name;
   String roles;

}
