package xyz.com.marcelo.bussinescard

import android.app.Application
import xyz.com.marcelo.bussinescard.data.AppDatabase
import xyz.com.marcelo.bussinescard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}