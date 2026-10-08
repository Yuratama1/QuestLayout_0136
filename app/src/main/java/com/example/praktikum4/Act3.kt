package com.example.praktikum4

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import java.lang.reflect.Modifier

@Composable
fun ActivitasPertama(modifier: Modifier){
    Colomn(
        modifier = modifier.padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Aligmnent.CenterHorizontally
    )
}