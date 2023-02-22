package com.gui1612.demo.datasource

import com.gui1612.demo.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}