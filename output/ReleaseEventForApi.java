// auto-generated by get-my-vocadb-java-model at 2020-12-19T03:10:29.8398016
package dummy_package;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter @ToString
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Builder(toBuilder = true) @Jacksonized
public final class ReleaseEventForApi {

   String additionalNames;
   List<ArtistForEvent> artists;
   String category;
   String date;
   String description;
   String endDate;
   int id;
   EntryThumbForApi mainPicture;
   String name;
   List<LocalizedString> names;
   ReleaseEventSeries series;
   int seriesId;
   int seriesNumber;
   String seriesSuffix;
   SongListBase songList;
   String status;
   List<TagUsageForApi> tags;
   String urlSlug;
   VenueForApi venue;
   String venueName;
   int version;
   List<WebLinkForApi> webLinks;

}