package com.example.xx12_geminiapp

data class ChatData(
    val message: String,
    val isBot: Boolean,
)


enum class ChatRoleEnum(val role: String) {
    USER("User"),
    MODEL("Model")
}