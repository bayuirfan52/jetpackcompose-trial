package test.bayu.jetpackcomposetrial.route

sealed class Routes(val route: String) {
    object Splash : Routes("splash")
    object Main : Routes("main")
}
