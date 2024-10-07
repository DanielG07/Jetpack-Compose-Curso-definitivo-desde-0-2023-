package com.example.jetpackcomposecatalogo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

@Composable
fun MyCustomAlertDialog(
    show: Boolean,
    onDismiss: () -> Unit,
) {
    if (show) {
        Dialog(
            onDismissRequest = onDismiss,
            properties =
                DialogProperties(
                    dismissOnBackPress = false,
                    dismissOnClickOutside = false,
                ),
        ) {
            Column(
                modifier =
                    Modifier
                        .background(Color.White)
                        .padding(24.dp)
                        .fillMaxWidth(),
            ) {
                Text(text = "Esto es un ejemplo")
            }
        }
    }
}

@Composable
fun MyDialog(
    show: Boolean,
    onConfirm: () -> Unit,
    onDismiss: () -> Unit,
) {
    if (show) {
        AlertDialog(
            title = {
                Text(text = "Titulo")
            },
            text = {
                Text(text = "Hola soy una descripción super padre")
            },
            confirmButton = {
                TextButton(onClick = { onConfirm() }) {
                    Text(text = "Confirmar")
                }
            },
            onDismissRequest = { onDismiss() },
            dismissButton = {
                TextButton(onClick = { onDismiss() }) {
                    Text(text = "Denegar")
                }
            },
        )
    }
}
