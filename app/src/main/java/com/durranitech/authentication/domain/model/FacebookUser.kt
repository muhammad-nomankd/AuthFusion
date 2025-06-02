package com.durranitech.authentication.domain.model

data class FacebookUser(
    val id: String,
    val name: String,
    val email: String?,
    val profilePictureUrl: String?,
    val isNewUser: Boolean = false)
