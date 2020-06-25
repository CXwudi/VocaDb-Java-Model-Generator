// auto-generated by get-my-vocadb-java-model at 2020-06-24T21:05:23.255337200
package dummy_package;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.eclipse.collections.api.list.MutableList;

@Getter(onMethod_ = {@JsonIgnore}) @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArtistForSongContract {

  @JsonProperty
  private ArtistContract artist;

  @JsonProperty
  private String categories;

  @JsonProperty
  private String effectiveRoles;

  @JsonProperty
  private int id;

  @JsonProperty
  private boolean isCustomName;

  @JsonProperty
  private boolean isSupport;

  @JsonProperty
  private String name;

  @JsonProperty
  private String roles;

}
