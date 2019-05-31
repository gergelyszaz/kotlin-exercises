class Mailer {
    val details = StringBuilder()
    fun from(addr: String) = details.append("from $addr...\n")
    fun to(addr: String) = details.append("to $addr...\n")
    fun subject(line: String) = details.append("subject $line...\n")
    fun body(message: String) = details.append("body $message...\n")
    fun send() = "...sending...\n$details"
}

val mailer = Mailer()
mailer.from("builder@agiledeveloper.com")
mailer.to("venkats@agiledeveloper.com")
mailer.subject("Your code sucks")
mailer.body("...details...")
val result = mailer.send()
println(result)


// clean

val mailer =
Mailer()
    .apply { from("builder@agiledeveloper.com") }
    .apply { to("venkats@agiledeveloper.com") }
    .apply { subject("Your code sucks") }
    .apply { body("details") }
val result = mailer.send()
println(result)

// even cleaner

val mailer = Mailer().apply {
    from("builder@agiledeveloper.com")
    to("venkats@agiledeveloper.com")
    subject("Your code sucks")
    body("details")
}
val result = mailer.send()
println(result)

// plz stahp

val result = Mailer().run {
    from("builder@agiledeveloper.com")
    to("venkats@agiledeveloper.com")
    subject("Your code sucks")
    body("details")
    send()
}

// oh god no

fun prepareMailer(mailer: Mailer):Unit {
    mailer.run {
        from("builder@agiledeveloper.com")
        to("venkats@agiledeveloper.com")
        subject("Your code suks")
        body("details")
    }
}
fun sendMail(mailer: Mailer): Unit {
    mailer.send()
    println("Mail sent")
}

createMailer()
    .also(::prepareMailer)
    .also(::sendMail)