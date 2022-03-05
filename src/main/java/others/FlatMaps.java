package others;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Slf4j
public class FlatMaps {
    public static void main(String[] args) {
        var stringList = List.of(List.of("one", "two", "three", "four", "five"), List.of("one", "two", "three", "four", "five"));

        var strs = stringList.stream().flatMap(numbers -> numbers.stream().map(String::toUpperCase)).distinct().toList();

        log.info(strs.toString());
    }
}
