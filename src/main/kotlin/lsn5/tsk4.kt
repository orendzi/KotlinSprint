package lsn5

// Lesson 5, task 4
const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"
const val SPACESHIP_NAME = "Heart of Gold"
const val ROBOT_NAME = "Marvin"
fun main() {
    println("""
        Вас приветствует робот $ROBOT_NAME на борту корбаля "$SPACESHIP_NAME":
        "Внимание, пассажир. 
         Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold". 
         [вздыхает...] 
         Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. 
         Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. 
         [вздыхает ещё глубже...] 
         Да, вперед, пожалуйста, вводите свои данные..."
    """.trimIndent())
    val userInputLogin = readln()
    println("Идёт проверка..")
    if(userInputLogin == LOGIN) {
        println("Система нашла пользователя, зарегестрированного под логином $userInputLogin.\n" +
                    "Введите пароль, пожалуйста:")
        val userInputPass = readln()
        if(userInputPass == PASSWORD) println("""$ROBOT_NAME:
            |"[вздыхает...] 
            | Ваши данные проверены, и о, чудо, они верны... 
            | Пользователь $userInputLogin, вам разрешено входить на борт корабля $SPACESHIP_NAME. 
            | Хотя мне всё равно... 
            | Ну вперед, войдите... 
            | Если вам так уж надо, в конце концов... 
            | [меланхолический вздох...] 
            | Надеюсь, вам понравится пребывание здесь больше, чем мне."
        """.trimMargin())
        else println("Неверный пароль!")
    } else {
        println("Пользователь с логином $userInputLogin не найден!\n" +
                "Хотите зарегистрироваться?")
    }
}