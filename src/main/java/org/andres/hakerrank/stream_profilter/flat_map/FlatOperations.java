package org.andres.hakerrank.stream_profilter.flat_map;

import java.util.List;
import java.util.Optional;

public class FlatOperations {

    public List<String> getAListFromListOfList(List<List<String>> listOfLists) {
        return listOfLists.stream().flatMap(List::stream).toList();
    }

    public List<String> getAllDevSkills(List<Developer> developers) {
        if (developers == null) {
            throw new IllegalArgumentException("List cannot be null");
        }

        return developers
                .stream()
                .flatMap(
                        developer -> developer.skills().stream()
                )
                .distinct()
                .toList();
    }

    public Optional<String> getOptionalString(Optional<String> optionalString) {
        return optionalString.flatMap(os -> Optional.of(os.toUpperCase()));
    }
}
