package org.example

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class MessageListener : ListenerAdapter() {

    override fun onMessageReceived(event: MessageReceivedEvent) {
        if (event.author.isBot) return

        val message = event.message.contentRaw
        if (message == "!ping") {
            event.channel.sendMessage("Pong!").queue()
        }

        if (message == "!categories") {
            val categories = listOf("Coocking", "Ingredients", "Utensils")
            event.channel.sendMessage(
                "Here are the categories:\n" + categories.joinToString(separator=",\n")
            ).queue()
        }
    }
}

