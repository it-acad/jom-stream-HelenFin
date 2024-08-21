package jom.com.softserve.s6.task5;

import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public class MyUtils {

    public Stream<String> nameList(Map<String, Stream<String>> map) {
        if (map == null) {
            throw new NullPointerException("Map cannot be null");
        }

        return map.values().stream()
                .flatMap(s -> s)
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(s -> s.replaceAll("\\s+", ""))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1));
    }

}
