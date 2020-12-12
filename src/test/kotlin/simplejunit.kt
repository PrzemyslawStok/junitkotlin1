import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.assertj.core.api.AssertionsForClassTypes.within

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class simplejunit {
    @Test
    internal fun function0() {
        assertThat(10.0).isCloseTo(9.91, within(0.1))
    }

    @Disabled("Test jeszcze nie został zaimpementowany")
    @Test
    internal fun function1() {
        assert(true)
    }

    //exp(x)^2-sin(x) dla x = 1
}
