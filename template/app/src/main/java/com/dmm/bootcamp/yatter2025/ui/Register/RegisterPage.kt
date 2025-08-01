package com.dmm.bootcamp.yatter2025.ui.Register

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.androidx.compose.getViewModel

@Composable
fun RegisterPage(
    registerViewModel: RegisterViewModel= getViewModel(),
){
    val uiState by registerViewModel.uiState.collectAsStateWithLifecycle()
    RegisterTemplate(
        userName = uiState.registerBindingModel.username,
        onChangedUserName = registerViewModel::onChangedUsername,
        password = uiState.registerBindingModel.password,
        onChangedPassword = registerViewModel::onChangedPassword,
        isEnableLogin = uiState.isEnableRegister,
        isLoading = uiState.isLoading,
        onClickLogin = registerViewModel::onClickLogin,
        onClickRegister = registerViewModel::onClickRegister,

        )
}