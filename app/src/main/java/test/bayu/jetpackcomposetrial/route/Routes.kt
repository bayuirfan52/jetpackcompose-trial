package test.bayu.jetpackcomposetrial.route

sealed class Routes(val route: String) {
    object Main : Routes("main")
    object Settings : Routes("settings")
}
