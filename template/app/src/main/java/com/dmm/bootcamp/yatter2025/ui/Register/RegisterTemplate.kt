package com.dmm.bootcamp.yatter2025.ui.Register

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dmm.bootcamp.yatter2025.ui.theme.Yatter2025Theme

@Composable
fun RegisterTemplate(
    userName: String,
    onChangedUserName: (String) -> Unit,
    password: String,
    onChangedPassword: (String) -> Unit,
    isEnableLogin: Boolean,
    isLoading: Boolean,
    onClickLogin: () -> Unit,
    onClickRegister: () -> Unit,
    ) {
    Scaffold(
    topBar = {
        TopAppBar(
            title = {
                Text(text = "新規登録")
            }
        )
    }
) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(8.dp),
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Button(
                    enabled = isEnableLogin,
                    onClick = onClickLogin,
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {
                    Text(text = "新規登録")
                }

                Divider(modifier = Modifier.padding(vertical = 16.dp))

//                Text(
//                    text = "はじめてご利用の方は",
//                    modifier = Modifier.fillMaxWidth(),
//                    textAlign = TextAlign.Center,
//                    style = MaterialTheme.typography.body2
//                )
//                TextButton(
//                    onClick = onClickRegister,
//                    modifier = Modifier.fillMaxWidth()
//                ) {
//                    Text(text = "新規ユーザー登録")
//                }
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    text = "ユーザー名"
                )
                OutlinedTextField(
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    value = userName,
                    onValueChange = onChangedUserName,
                    placeholder = {
                        Text(text = "username")
                    },
                )

                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "パスワード"
                )
                OutlinedTextField(
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    value = password,
                    onValueChange = onChangedPassword,
                    placeholder = {
                        Text(text = "password")
                    },
                )
                if (isLoading) {
                    CircularProgressIndicator()
                }

            }
        }
    }

}

@Preview
@Composable
private fun RegissterTemplatePreview() {
    Yatter2025Theme {
        Surface {
            RegisterTemplate(
                userName = "",
                onChangedUserName = {},
                password = "",
                onChangedPassword = {},
                isEnableLogin = true,
                isLoading = false,
                onClickLogin = {},
                onClickRegister = {},
            )
        }
    }
}