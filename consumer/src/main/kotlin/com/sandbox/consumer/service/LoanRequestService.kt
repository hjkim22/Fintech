package com.sandbox.consumer.service

import com.sandbox.domain.domain.LoanReview
import com.sandbox.domain.repository.LoanReviewRepository
import org.springframework.stereotype.Service

@Service
class LoanRequestService(
    private val loanReviewRepository: LoanReviewRepository
) {

    fun loanRequest() {
        // TODO : CB Component 로 요청 보내기 -> 응답값을 DB에 저장하기
    }

    fun loanRequestToCb() {
        // TODO
    }

    fun saveLoanReviewData(loanReview: LoanReview) = loanReviewRepository.save(loanReview)
}