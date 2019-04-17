class UserService {
    fun findUserByLogin(login: String, users: List<User>): User {
        var user1 = User("", "")
        for (user in users)
            if (user.login == login)
                user1 = user
        return user1
    }

    fun validatePass(user: User, pass: String) {
        if (user.pass == pass) true
    }
}