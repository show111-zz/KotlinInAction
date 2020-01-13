package com.tutorials.kotlininaction.chapter4

import com.tutorials.kotlininaction.chapter2.Person
import java.io.File

/**
 *  Created by hannah on 2020-01-10
 */
object Payroll{
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary(){
        for (person in allEmployees){

        }
    }
}

object CaseInsentiveFileComparator: Comparator<File>{
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}

data class PersonO(val name: String){
    object NameComparator: Comparator<PersonO>{
        override fun compare(o1: PersonO, o2: PersonO): Int = o1.name.compareTo(o2.name)
    }
}

fun main(){
    Payroll.allEmployees.add(Person("Bob", false))
    Payroll.calculateSalary()

    println(CaseInsentiveFileComparator.compare(File("/User"), File("/user")))

    val files = listOf(File("/Z"),File("/a"))
    println(files.sortedWith(CaseInsentiveFileComparator))

    val persons = listOf(PersonO("Bob"), PersonO("Alice"))
    println(persons.sortedWith(PersonO.NameComparator))
}
