package com.example.ejemploPropio

import org.springframework.data.jpa.repository.JpaRepository

interface CryptoRepository:JpaRepository<CryptoCurrency, Long>