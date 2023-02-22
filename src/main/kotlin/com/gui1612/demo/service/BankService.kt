package com.gui1612.demo.service

import com.gui1612.demo.datasource.BankDataSource
import com.gui1612.demo.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

}