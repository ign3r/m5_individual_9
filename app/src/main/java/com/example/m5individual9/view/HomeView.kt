package com.example.m5individual9.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.m5individual9.components.Boton
import com.example.m5individual9.components.CustomOutlinedTextField
import com.example.m5individual9.components.EspacioNormal
import com.example.m5individual9.components.MultiBoton
import com.example.m5individual9.components.Titulo

@Composable
fun HomeView() {

    Scaffold(modifier = Modifier
        .fillMaxSize(),
        containerColor = Color.White
    ) {
        ContentHomeView(it)
    }

}

@Composable
fun ContentHomeView(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        EspacioNormal()
        MultiBoton()
        EspacioNormal()
        Titulo()
        EspacioNormal()
        CustomOutlinedTextField("Edad")
        CustomOutlinedTextField("Peso (Kg)")
        CustomOutlinedTextField("Altura (cm)")

        EspacioNormal()
        Boton(text = "Enviar")
    }
}