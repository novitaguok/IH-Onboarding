package com.example.ihonboarding.presentation.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ihonboarding.R
import com.example.ihonboarding.presentation.theme.IHOnboardingTheme

@Composable
fun CustomButton(btnText: String) {
    Button(
        onClick = { /* Do something! */ },
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = MaterialTheme.colors.primaryVariant
        ),
        contentPadding = PaddingValues(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 4.dp)
    ) {
        Text(btnText)
    }
}

@Preview(showBackground = true)
@Composable
fun CustomButtonPreview() {
    IHOnboardingTheme {
        CustomButton("Android")
    }
}