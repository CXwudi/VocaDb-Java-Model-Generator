// auto-generated by get-my-vocadb-java-model at 2020-06-24T21:05:23.289246700
package dummy_package;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.eclipse.collections.api.list.MutableList;

@Getter(onMethod_ = {@JsonIgnore}) @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SongListBaseContract {

  @JsonProperty
  private String featuredCategory;

  @JsonProperty
  private int id;

  @JsonProperty
  private String name;

}
