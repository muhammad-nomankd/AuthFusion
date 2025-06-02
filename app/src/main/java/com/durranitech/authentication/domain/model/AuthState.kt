package com.durranitech.authentication.domain.model

sealed class AuthState {
    object Initial: AuthState()
    object Loading: AuthState()
    data class Success(val user: FacebookUser): AuthState()
    data class Error(val message: String,val errorType: AuthError): AuthState()
}