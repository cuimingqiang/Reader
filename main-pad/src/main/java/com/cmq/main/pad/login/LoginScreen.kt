package com.cmq.main.pad.login

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cmq.base.view.theme.InkPadTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginBody() {
    Scaffold(
        modifier = Modifier.systemBarsPadding()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "移动阅卷",
                style = MaterialTheme.typography.displayMedium,
                color = Color.Black,
                modifier = Modifier
            )

            OutlinedTextField(value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(top = 20.dp),
                label = { Text(text = "账号") })
            OutlinedTextField(value = "",
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password),
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(top = 20.dp),
                label = { Text(text = "密码") })

            Button(onClick = { },
                modifier = Modifier.fillMaxWidth(0.8f)
                    .padding(top = 20.dp)) {
                Text(
                    text = "确定",
                    style = MaterialTheme.typography.bodySmall,
                )
            }

        }
    }
}

@Preview(name = "13.3英寸", device = Devices.TABLET)
@Composable
fun LoginScreen400Preview() {
    InkPadTheme {
        LoginBody()
    }
}