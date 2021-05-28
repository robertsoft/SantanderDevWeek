package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Conta
import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente

class FakeData{
    fun getLocalData(): Conta {
        val cliente = Cliente("Roberto" )
        val cartao = Cartao("45682154")

        return Conta("414582-6",
                     "5897-6",
                     "R$ 10.456,06",
                     "R$ 25.456,06",
                     cliente,
                     cartao)
    }
}