package com.example.ejemploPropio

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LoadDatabase {
    companion object {
        var logger = LoggerFactory.getLogger(LoadDatabase.javaClass)
    }

    @Bean
    fun initDatabase(cryptoRepository: CryptoRepository): CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
            logger.info("Preloading " + cryptoRepository.save(CryptoCurrency("btc-bitcoin", "bitcoin","BTC","COIN")))
            logger.info("Preloading " + cryptoRepository.save(CryptoCurrency("eth-ethereum", "Ethereum","ETH","COIN")))
            logger.info("Preloading " + cryptoRepository.save(CryptoCurrency("usdt-tether", "Tether","USDT","TOKEN")))
            logger.info("Preloading " + cryptoRepository.save(CryptoCurrency("xrp-xrp", "XRP","XRP","COIN")))
        }
    }
}