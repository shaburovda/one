class BusinessLogic {

    fun authenticate(cmd: Cmd, users: List<User>): Int {
        var j: Int = 0
        for (i in users) {
            if (cmd.login == i.login && cmd.pass == i.pass) j = 0
            else if (cmd.login == i.pass && cmd.pass == i.login) j = 0
            else if (cmd.login == "" || cmd.pass == "") j = 1
            else if (cmd.login == i.pass && !cmd.pass.contains("@") || cmd.pass == i.pass && !cmd.login.contains("@")) j = 2
            else if (cmd.login != i.login && cmd.pass == i.pass) j = 3
            else if (cmd.login == i.login && cmd.pass != i.pass) j = 4
        }
        return j
    }
}