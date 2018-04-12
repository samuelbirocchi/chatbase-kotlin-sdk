package com.samuelbirocchi.chatbase.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

data class ChatbaseRequestMessage(

    @field:JsonProperty("api_key")
    val apiKey: String,

    @field:JsonProperty("user_id")
    val userId: String,

    @field:JsonProperty("type")
    val type: AgentType,

    @field:JsonProperty("message")
    val message: String,

    @field:JsonProperty("intent")
    val intent: String? = null,

    @field:JsonProperty("version")
    val version: String = "1.0",

    @field:JsonProperty("platform")
    val platform: String,

    @field:JsonProperty("not_handled")
    val notHandled: Boolean? = null,

    @field:JsonProperty("properties")
    val properties: List<Property>? = null,

    @field:JsonProperty("time_stamp")
    val timeStamp: Long = Date().time
)