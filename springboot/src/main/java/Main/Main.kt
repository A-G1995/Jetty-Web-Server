package Main

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.web.servlet.server.ServletWebServerFactory
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.*


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
open class Main : SpringBootServletInitializer(){
    @Bean
    open fun servletWebServerFactory(): ServletWebServerFactory {
        return JettyServletWebServerFactory()
    }
}

@RestController
class Router {
//    @RequestMapping(value = "/get/{n}" , method = arrayOf(RequestMethod.GET))
    @GetMapping("/get/{n}")
    fun doGet(@PathVariable("n") n:Int):String{
        return "Hi from get ${n}\n"
    }

    @RequestMapping(value = "/post" , method = arrayOf(RequestMethod.POST))
    fun doPost(@RequestBody map:HashMap<String,String>):String{
        return "Hi from post\n${map}"
    }
}
fun main(args: Array<String>) {
    SpringApplication.run(Main::class.java)
}