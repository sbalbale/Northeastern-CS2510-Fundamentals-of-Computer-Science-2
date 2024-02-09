package uk.ac.nulondon;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class StringFuncsTest {
    @Test
    void startsWithYTest() {
        Assertions.assertThat(StringFuncs.startsWithY("Yes")).isEqualTo(true);
        Assertions.assertThat(StringFuncs.startsWithY("yes")).isEqualTo(true);
        Assertions.assertThat(StringFuncs.startsWithY("no")).isEqualTo(false);
        Assertions.assertThat(StringFuncs.startsWithY("No")).isEqualTo(false);
        Assertions.assertThat(StringFuncs.startsWithY("yellow")).isEqualTo(true);

    }

    @Test
    void startsWithYTest_Failure() {
        Assertions.assertThat(StringFuncs.startsWithY("Yes")).isEqualTo(false);
    }

    @Test
    void bingoWordTest() {
        Assertions.assertThat(StringFuncs.bingoWord1("ben")).isEqualTo("B3");
        Assertions.assertThat(StringFuncs.bingoWord1("Ben")).isEqualTo("B3");
        Assertions.assertThat(StringFuncs.bingoWord1("BEN")).isEqualTo("B3");
        Assertions.assertThat(StringFuncs.bingoWord1("Join")).isEqualTo("J4");
    }
}
