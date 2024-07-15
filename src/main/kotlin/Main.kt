package org.example

import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.hooks.ListenerAdapter
import javax.security.auth.login.LoginException

fun main(args: Array<String>) {
    val token =
        "MTIyNzY4NzUwNjY3MDEyOTE5Mg.GYlvYb.hScKDe-q2UDSbkOzUgRMclkiB6ABLULFeb_imo" // Replace with your bot token

    try {
        val jda = JDABuilder.createDefault(token)
            .addEventListeners(Bot())
            .build()
        jda.awaitReady() // Blocking guarantees that JDA will be completely loaded.
        println("Bot is ready!")
    } catch (e: LoginException) {
        e.printStackTrace()
    } catch (e: InterruptedException) {
        e.printStackTrace()
    }
}