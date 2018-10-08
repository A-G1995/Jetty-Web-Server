
import java.nio.charset.Charset
import java.util.Random

class PassGen{
    fun givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() : String {
        val array = ByteArray(7) // length is bounded by 7
        Random().nextBytes(array)
        val generatedString = String(array, Charset.forName("UTF-8"))

        return generatedString
    }



}