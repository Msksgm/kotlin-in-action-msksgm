package ch03.ex6_2_LocalFunctionsAndExtensions1

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }

    validate(user, user.name, "User")
    validate(user, user.address, "Address")
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}
