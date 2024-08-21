package jom.com.softserve.s6.task6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Objects;



public class MyUtils {
    public Map<String, Stream<String>> phoneNumbers(List<Stream<String>> list){

        return list.stream()
                .flatMap(s -> s)
                .distinct()
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(phone -> !phone.isEmpty())
                .map(phone -> phone.replaceAll("[\\s\\-()]", ""))
                .collect(Collectors.groupingBy(phone -> {
                    if (phone.length() < 7) {
                        return "err";
                    } else if (phone.startsWith("0")) {
                        return phone.substring(0, 3);
                    } else {
                        return "loc";
                    }
                }, Collectors.mapping(phone -> {
                    if (phone.startsWith("0") && phone.length() > 3) {
                        return phone.substring(3);
                    } else {
                        return phone;
                    }
                }, Collectors.collectingAndThen(Collectors.toList(), listToSort -> listToSort.stream().sorted()))));
    }
}

