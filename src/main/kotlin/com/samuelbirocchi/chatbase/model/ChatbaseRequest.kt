package br.com.gobots.webservice.analytics

import com.samuelbirocchi.chatbase.model.ChatbaseRequestMessage

data class ChatbaseRequest(val messages: List<ChatbaseRequestMessage>)