package live.cakeyfox.lotus.server

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.http.content.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

class ServerInstance {
    fun start() {
        embeddedServer(Netty, port = 3001) {
            routing {
                staticResources("/", "static")
                print("Server started on port 3001")
                get("/") {
                    call.respondText { "owo" }
                }
            }
        }.start(wait = true)
    }
}