package com.example.ejemploPropio

import org.springframework.web.bind.annotation.*

@RestController
class CryptoController(private val cryptoRepository:CryptoRepository) {

    @GetMapping("/coins")
    fun getCoins():List<CryptoCurrency>{
        return cryptoRepository.findAll()
    }
    @GetMapping("/coins/{id}")
    fun getSpecificCoin(@PathVariable id: Long):CryptoCurrency{
        return cryptoRepository.findById(id).get()
    }
    @GetMapping("/coins/getMax/{number}")
    fun getMaxCoins(@PathVariable number: Int): MutableList<CryptoCurrency> {
        return cryptoRepository.findAll().subList(0,number)
    }
}