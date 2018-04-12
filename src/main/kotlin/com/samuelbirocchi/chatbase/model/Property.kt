package com.samuelbirocchi.chatbase.model

import com.fasterxml.jackson.annotation.JsonValue

data class Property (
    private val propertyName: String,
    private val value: Any,
    private val propertyType: PropertyType
) {
    @JsonValue
    fun getJson(): Map<String, Any> =
            mapOf("property_name" to propertyName, propertyType.value to value)
}