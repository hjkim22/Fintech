package com.sandbox.domain.repository

import com.sandbox.domain.domain.LoanReview
import org.springframework.data.jpa.repository.JpaRepository

interface LoanReviewRepository : JpaRepository<LoanReview, Long>