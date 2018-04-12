package com.samuelbirocchi.chatbase.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class AgentType(@JsonValue val value: String) {
    USER("user"),
    BOT("agent");

    companion object {
        @JvmStatic @JsonCreator
        fun get(value: String): AgentType =
            AgentType.values().first { it.value == value }
    }
}