import java.security.MessageDigest
import java.security.SecureRandom


class User(login: String, pass: String) {

    val login: String = login
    var pass: String = pass

    fun hash(password: String): String {
        val bytes = password.toByteArray()
        val md = MessageDigest.getInstance("SHA-256")
        val digest = md.digest(bytes)
        return digest.fold("", { str, it -> str + "%02x".format(it) })
    }

    fun getNextSalt(): ByteArray {
        val RANDOM = SecureRandom()
        val salt = ByteArray(16)
        RANDOM.nextBytes(salt)
        return salt
    }

    fun sendMessage (code: Int){
        if (code == 1) println("1")
        if (code == 2) println("2")
        if (code == 3) println("3")
        if (code == 4) println("4")
    }
}