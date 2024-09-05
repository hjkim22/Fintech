package com.sandbox.consumer.service

import com.sandbox.consumer.dto.ReviewResponseDto
import com.sandbox.domain.domain.LoanReview
import com.sandbox.domain.repository.LoanReviewRepository
import com.sandbox.kafka.dto.LoanRequestDto
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Service
import java.time.Duration

@Service
class LoanRequestService(
    private val loanReviewRepository: LoanReviewRepository
) {
    companion object {
        const val cssUrl = "http://localhost:8081/css/api/v1/request"
    }

    fun loanRequest(loanRequestDto: LoanRequestDto) {
        // CB Component 로 요청 보내기 -> 응답값을 DB에 저장하기
        val reviewResult = loanRequestToCb(loanRequestDto)

        saveLoanReviewData(reviewResult.toLoanReviewEntity())
    }

    private fun loanRequestToCb(loanRequestDto: LoanRequestDto): ReviewResponseDto {
        val restTemplate = RestTemplateBuilder()
            .setConnectTimeout(Duration.ofMillis(1000))
            .setReadTimeout(Duration.ofMillis(1000))
            .build()

        return restTemplate.postForEntity(cssUrl, loanRequestDto, ReviewResponseDto::class.java).body!!
    }

    private fun saveLoanReviewData(loanReview: LoanReview) = loanReviewRepository.save(loanReview)
}