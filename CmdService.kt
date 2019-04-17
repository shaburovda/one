class CmdService{
    fun parse (arg: Array<String>): Cmd {
            return Cmd(login = arg[1], pass = arg[3], h = false)
    }
}