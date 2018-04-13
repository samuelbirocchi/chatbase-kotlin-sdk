package com.samuelbirocchi.chatbase

import com.samuelbirocchi.chatbase.model.ChatbaseRequest
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.github.kittinunf.fuel.httpPost
import mu.KotlinLogging

class ChatbaseClient {

    private val logger = KotlinLogging.logger { }
    private val objectMapper = jacksonObjectMapper()

    fun sendAnalytics(chatbaseRequest: ChatbaseRequest) {
        logger.debug { "Chatbase analytics body: $chatbaseRequest" }
        "https://chatbase.com/api/messages".httpPost()
            .body(objectMapper.writeValueAsBytes(chatbaseRequest))
            .responseString { _, _, result ->
                result.fold({
                    logger.info { "Analytic sent to Chatbase" }
                }, {
                    logger.error(it.exception) { "Error sending analytic to chatbase: ${String(it.errorData)}" }
                })
            }
    }

}