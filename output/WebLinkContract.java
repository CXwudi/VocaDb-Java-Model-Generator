// auto-generated by get-my-vocadb-java-model at 2020-06-24T21:05:23.298224500
package dummy_package;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.eclipse.collections.api.list.MutableList;

@Getter(onMethod_ = {@JsonIgnore}) @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WebLinkContract {

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
