package uk.ac.nulondon;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class AppTest {
//    @Test
//    void helloTest() {
//        Assertions.assertThat(2 + 2).isEqualTo(4);
//    }

    @Test
    void startsWithYTest() {
        Assertions.assertThat(App.startsWithY("y")).isTrue();
        Assertions.assertThat(App.startsWithY("Y")).isTrue();
        Assertions.assertThat(App.startsWithY("yes")).isTrue();
        Assertions.assertThat(App.startsWithY("Yes")).isTrue();
        Assertions.assertThat(App.startsWithY("no")).isFalse();
        Assertions.assertThat(App.startsWithY("No")).isFalse();
    }

    @Test
    void bingoWordTest() {
        Assertions.assertThat(App.bingoWord("bingo")).isEqualTo("B 5");
        Assertions.assertThat(App.bingoWord("Win")).isEqualTo("W 3");
        Assertions.assertThat(App.bingoWord("Dog")).isEqualTo("D 3");
        Assertions.assertThat(App.bingoWord("Cat")).isEqualTo("C 3");
        Assertions.assertThat(App.bingoWord("Long")).isEqualTo("L 4");
    }
}
