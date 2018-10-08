import javax.servlet.http.HttpServlet
import java.io.IOException
import javax.servlet.ServletException
import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpServletRequest
import kotlin.concurrent.thread


class ExampleServlet : HttpServlet() {
    @Override
    @Throws(ServletException::class, IOException::class)

    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {


        resp.writer.println(PassGen().givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect())

    }

    override fun doPost(req: HttpServletRequest?, resp: HttpServletResponse?) {


            resp!!.writer.println(PassGen().givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect())

        }


    }
