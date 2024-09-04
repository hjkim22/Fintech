package com.sandbox.api.loan.review

import com.sandbox.domain.domain.LoanReview

interface LoanReviewService {

    fun loanReviewMain(userKey: String): LoanReviewDto.LoanReviewResponseDto

    fun getLoanResult(userKey: String): LoanReview?
}