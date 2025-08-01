package com.dmm.bootcamp.yatter2025.ui.Register

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.dmm.bootcamp.yatter2025.common.navigation.Destination
import com.dmm.bootcamp.yatter2025.ui.Register.RegisterPage

class RegisterDestination : Destination(ROUTE) {
    companion object {
        private const val ROUTE = "register"

        fun createNode(builder: NavGraphBuilder) {
            builder.composable(ROUTE) {
                RegisterPage()
            }
        }
    }
}