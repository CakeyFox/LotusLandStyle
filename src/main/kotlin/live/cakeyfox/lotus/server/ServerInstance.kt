package live.cakeyfox.lotus.server

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.http.content.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.net.BindException

class ServerInstance {
    fun start() {
        try {
            embeddedServer(Netty, port = 3001) {
                routing {
                    staticResources("/", "static")
                    print("Server started on port 3001")
                    get("/") {
                        call.respondText { "owo" }
                    }
                }
            }.start(wait = true)
        } catch (e: BindException) {
            println("Port 3001 is already in use!")
        } catch (e: Exception) {
            println("An error occurred: ${e.message}")
        }
    }
}