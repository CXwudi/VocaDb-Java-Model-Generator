// auto-generated by get-my-vocadb-java-model at 2020-12-18T02:25:49.779287
package dummy_package;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter @ToString
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Builder(toBuilder = true) @Jacksonized
public final class LyricsForSong {

   String cultureCode;

   int id;

   String source;

   String translationType;

   String url;

   String value;

}
