import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.within;

public class simpleJunit1 {
    @Test
    public void number_assertions_examples() throws Exception {

        // equals / no equals assertions
        assertThat(10).isEqualTo(38)
                .isCloseTo(40, within(10));

    }
}
