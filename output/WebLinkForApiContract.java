// auto-generated by get-my-vocadb-java-model at 2020-06-24T20:55:05.195681500
package dummy_package;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.eclipse.collections.api.list.MutableList;

@Getter(onMethod_ = {@JsonIgnore}) @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WebLinkForApiContract {

  @JsonProperty
  private String category;

  @JsonProperty
  private String description;

  @JsonProperty
  private String descriptionOrUrl;

  @JsonProperty
  private int id;

  @JsonProperty
  private String url;

}