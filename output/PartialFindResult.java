// auto-generated by get-my-vocadb-java-model at 2020-06-24T20:55:04.554394400
package dummy_package;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.eclipse.collections.api.list.MutableList;

@Getter(onMethod_ = {@JsonIgnore}) @ToString
@Builder
public class PartialFindResult<T> {

  protected MutableList<T> items;

  protected String term;

  protected int totalCount;

  @JsonCreator
  public PartialFindResult (
      @JsonProperty("items") MutableList<T> items, 
      @JsonProperty("term") String term, 
      @JsonProperty("totalCount") int totalCount){
    this.items = items;
    this.term = term;
    this.totalCount = totalCount;
  }
}