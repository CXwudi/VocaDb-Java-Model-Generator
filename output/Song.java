// auto-generated by get-my-vocadb-java-model at 2020-12-18T02:33:31.8212511
package dummy_package;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter @ToString
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Builder(toBuilder = true) @Jacksonized
public final class Song {

   String additionalNames;
   List<Album> albums;
   List<ArtistForSong> artists;
   String artistString;
   String createDate;
   String defaultName;
   String defaultNameLanguage;
   boolean deleted;
   int favoritedTimes;
   int id;
   int lengthSeconds;
   List<LyricsForSong> lyrics;
   EntryThumb mainPicture;
   int mergedTo;
   String name;
   List<LocalizedString> names;
   int originalVersionId;
   String publishDate;
   List<PV> pvs;
   String pvServices;
   int ratingScore;
   ReleaseEvent releaseEvent;
   String songType;
   String status;
   List<TagUsage> tags;
   String thumbUrl;
   int version;
   List<WebLink> webLinks;

}
