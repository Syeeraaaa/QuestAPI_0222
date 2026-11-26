package com.example.pertemuan12.viewmodel



import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pertemuan12.repositori.DefaultContainerApp

fun CreationExtras.aplikasiDataSiswa() : DefaultContainerApp.AplikasiDataSiswa = (
        this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]
                as DefaultContainerApp.AplikasiDataSiswa
        )
object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HoemViewModel (aplikasiDataSiswa().container
            .repositoryDataSiswa) }
        initializer { EntryViewModel(aplikasiDataSiswa().container
            .repositoryDataSiswa) }
    }
}