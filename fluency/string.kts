fun String.Companion.toURL(link: String) = java.net.URL(link)

// elsewhere

val url: java.net.URL = String.toURL("https://pragprog.com")