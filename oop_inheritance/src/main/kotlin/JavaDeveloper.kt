package org.example

class JavaDeveloper : Developer {
    // super означает, что параметры будут переданы в родительский класс
    constructor(name: String, age: Int) : super(name, age)

    constructor(name: String, age: Int, experience: Int) : super(name, age, experience)

    // override означает, что данная функция есть в базовом классе, а здесь она переопределена
    override fun writeCode() = println("Java developer writing code")
}