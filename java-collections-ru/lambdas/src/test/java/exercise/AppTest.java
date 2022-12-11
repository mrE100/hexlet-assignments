package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
@Test
    void testAppEnlargeArrayImage() {
        String[][] image ={
            {"*","*","*","*"},
            {"*"," "," ","*"},
            {"*"," "," ","*"},
            {"*","*","*","*"},
            };
        String[][] actual = App.enlargeArrayImage(image);
        String[][] expected ={
            {"*","*","*","*","*","*","*","*"},
            {"*","*","*","*","*","*","*","*"},
            {"*","*"," "," "," "," ","*","*"},
            {"*","*"," "," "," "," ","*","*"},
            {"*","*"," "," "," "," ","*","*"},
            {"*","*"," "," "," "," ","*","*"},
            {"*","*","*","*","*","*","*","*"},
            {"*","*","*","*","*","*","*","*"},
            };
        assertThat(actual).isEqualTo(expected);
        }


@Test
    void testAppEnlargeArrayImageWithEmptyList() {
        String[][] image ={
            };
        String[][] expected ={
            };
        String[][] actual = App.enlargeArrayImage(image);
        assertThat(actual).isEqualTo(expected);
        }
// END
