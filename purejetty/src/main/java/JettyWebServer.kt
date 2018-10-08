import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletContextHandler
import org.eclipse.jetty.util.thread.QueuedThreadPool





 fun main(args: Array<String>) {
     val server = Server(7070)
     val threadPool = QueuedThreadPool()
     threadPool.maxThreads = 1000
     server.threadPool
     val handler = ServletContextHandler(server, "/example")
     handler.addServlet(ExampleServlet::class.java, "/")
     server.start()

}

