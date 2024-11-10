package org.example

import org.example.Developer

class ScalaDeveloper : Developer {
    // super означает, что параметры будут переданы в родительский класс
    constructor(name: String, age: Int) : super(name, age)

    constructor(name: String, age: Int, experience: Int) : super(name, age, experience)

    // override - эта переменная есть в базовом классе, а здесь она переопределена
    override val paradigm: String
        get() = super.paradigm

    // override означает, что данная функция есть в базовом классе, а здесь она переопределена
    override fun writeCode() = println("Scala developer writing code")


}