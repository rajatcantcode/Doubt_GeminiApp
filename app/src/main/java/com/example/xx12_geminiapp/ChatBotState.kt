package com.example.xx12_geminiapp

sealed interface ChatBotState {
    data object Ideal : ChatBotState
    data object Loading : ChatBotState
    data class Success(val chatData: String) : ChatBotState
    data class Error(val message: String) : ChatBotState
}