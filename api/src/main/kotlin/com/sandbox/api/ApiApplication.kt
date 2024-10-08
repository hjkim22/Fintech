package com.sandbox.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EntityScan(basePackages = ["com.sandbox.domain"])
@ComponentScan(basePackages = ["com.sandbox"])
@EnableCaching
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}