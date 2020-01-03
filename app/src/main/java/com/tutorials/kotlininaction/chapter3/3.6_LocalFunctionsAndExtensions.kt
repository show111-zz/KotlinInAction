package com.tutorials.kotlininaction.chapter3

class User(val id: Int, val name: String, val address : String)

fun saveUser1(user: User){
    if(user.name.isEmpty()){
        throw IllegalArgumentException("Can't save user ${user.id}: empty Name")
    }
    if(user.address.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty Address")
    }
}

fun saveUser2(user: User){
    fun validate(user: User, value: String, fieldName : String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }
    validate(user,user.name, " Name")
    validate(user, user.address, "Address")
}

fun saveUser3(user: User){
    fun validate(value: String, fieldName : String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }
    validate(user.name, " Name")
    validate(user.address, "Address")
}

fun User.validateBeforeSave(){
    fun validate3(value: String, fieldName : String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
        validate3(name, "Name")
        validate3(address, "Address")
    }
}

fun saveUser4(user : User){
    user.validateBeforeSave()
}

fun main(){
//    saveUser1(User(1,"",""))
//    saveUser2(User(2, "",""))
//    saveUser3(User(2, "",""))
    saveUser4(User(3, "",""))
}