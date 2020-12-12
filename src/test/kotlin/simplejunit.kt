import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.assertj.core.api.AssertionsForClassTypes.within
import org.assertj.core.data.Percentage
import org.assertj.core.data.Percentage.withPercentage

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.lang.Math.pow
import kotlin.math.exp
import kotlin.math.sin

class simplejunit {
    @Test
    internal fun function0() {

        assertThat(equation1(1.0)).isCloseTo(6.547, within(0.01))
        assertThat(equation1(1.0)).isCloseTo(6.547, withPercentage(10.0))
    }

    @Test
    internal fun function1() {
        assertThat(equation1(1.0)).isEqualTo(6.547)
    }

    fun equation1(x: Double):Double{
        //exp(x)^2-sin(x) dla x = 1
        return pow(exp(x),2.0)-sin(x)
    }

}
