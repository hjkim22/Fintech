package com.sandbox.com.sandbox.css.dto

class LoanResultDto {
    data class ResponseDto(
        val userKey: String,
        val interest: Double,
        val limitAmount: Long
    )
}