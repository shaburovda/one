fun main(args: Array<String>) {
    println("Hello, world!")
    var user1 = User("foo@example.com", "123458")
    var user2 = User("Bar.baz@gmail.com", "qwerty")
    val users = listOf(user1, user2)

    val cmd = CmdService().parse(args)

    val businessLogic = BusinessLogic().authenticate(cmd, users)

    println(businessLogic)

    for (user in users){
        user.pass = user.hash(user.pass) + user.getNextSalt()
        println(user.pass)
    }

    val userN = UserService().findUserByLogin("foo@example.com", users)

    println(userN.login + ":" + userN.pass)
}