import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class simplejunit {
    @Test
    internal fun function0() {
        Assertions.assertEquals(10,10)

    }

    @Disabled("Test jeszcze nie został zaimpementowany")
    @Test
    internal fun function1() {
        assert(true)
    }
}
