package com.example.ejemploPropio

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class CryptoCurrency(var id:String,
                     var name: String,
                     var symbol:String,
                     var type:String) {
    @Id
    @GeneratedValue
    private val idAuto: Long? = null

    override fun equals(other: Any?): Boolean {
        if (other is CryptoCurrency){
            return other.idAuto == idAuto && idAuto != null
        } else {
            return false
        }
    }

    override fun hashCode(): Int {
        return Objects.hash(idAuto,id,name)
    }

    override fun toString(): String {
        return "$id es la moneda : $name con un id de $id"


    }
}