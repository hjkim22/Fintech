package com.sandbox.api.loan.request

import com.sandbox.domain.domain.UserInfo

interface LoanRequestService {
    fun loanRequestMain(
        loanRequestInputDto: LoanRequestDto.LoanRequestInputDto
    ): LoanRequestDto.LoanRequestResponseDto

    fun saveUserInfo(
        userInfoDto: UserInfoDto
    ): UserInfo

    fun loanRequestReview(userInfoDto: UserInfoDto)
}