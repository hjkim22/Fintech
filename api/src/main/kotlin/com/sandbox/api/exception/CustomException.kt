package com.sandbox.api.exception

class CustomException(val customErrorCode: CustomErrorCode) : RuntimeException() {
}