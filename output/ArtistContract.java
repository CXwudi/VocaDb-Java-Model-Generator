// auto-generated by get-my-vocadb-java-model at 2020-06-24T21:05:23.276282200
package dummy_package;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.eclipse.collections.api.list.MutableList;

@Getter(onMethod_ = {@JsonIgnore}) @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArtistContract {

  @JsonProperty
  private String additionalNames;

  @JsonProperty
  private String artistType;

  @JsonProperty
  private boolean deleted;

  @JsonProperty
  private int id;

  @JsonProperty
  private String name;

  @JsonProperty
  private String pictureMime;

  @JsonProperty
  private String releaseDate;

  @JsonProperty
  private String status;

  @JsonProperty
  private int version;

}
