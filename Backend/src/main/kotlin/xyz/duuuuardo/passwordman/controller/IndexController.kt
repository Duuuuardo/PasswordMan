package xyz.duuuuardo.passwordman.controller

import kotlinx.serialization.json.*
import com.fasterxml.jackson.databind.util.JSONPObject
import io.swagger.v3.oas.annotations.Operation
import org.springframework.boot.system.ApplicationHome
import org.springframework.core.SpringVersion
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.lang.management.ManagementFactory
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

@Controller
class IndexController {
    @Operation(summary = "Index API route", description = "Returns the API current status! can be used for response and uptime testing.")
    @GetMapping("/")
    @ResponseBody
    fun root(): JsonObject {
        val status: MutableMap<String, Any?> = HashMap()
        val mb = 1024 * 1024
        val runtime = Runtime.getRuntime()
        val usedMemory = (runtime.totalMemory() - runtime.freeMemory()) / mb
        val freeMemory = runtime.freeMemory() / mb
        val maxMemory = runtime.maxMemory() / mb
        val totalMemory = runtime.totalMemory() / mb

        val jsonObject = buildJsonObject {
            put("status", "OK")
            putJsonObject("versions") {
                put("kotlin", KotlinVersion.CURRENT.toString())
                put("java", System.getProperty("java.version"))
                put("spring", SpringVersion.getVersion())
            }

            putJsonObject("memory") {
                put("used", usedMemory)
                put("free", freeMemory)
                put("max", maxMemory)
                put("total", totalMemory)
            }
            put("threadCount", ManagementFactory.getThreadMXBean().threadCount)
            put("uptime", ManagementFactory.getRuntimeMXBean().uptime)
        }


        return jsonObject
    }

    @GetMapping("/docs")
    fun docs(): String = "redirect:swagger-ui/index.html"
}