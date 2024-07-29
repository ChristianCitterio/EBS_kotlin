package org.example

import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.hooks.ListenerAdapter
import javax.security.auth.login.LoginException

class Main {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val token = System.getenv("DISCORD_TOKEN") ?: "default"; // Replace with your bot token

            try {
                val jda = JDABuilder.createDefault(token)
                    .addEventListeners(MessageListener())
                    .build()
                jda.awaitReady() // Blocking guarantees that JDA will be completely loaded.
                println("Bot is ready!")
            } catch (e: LoginException) {
                e.printStackTrace()
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
    }
}