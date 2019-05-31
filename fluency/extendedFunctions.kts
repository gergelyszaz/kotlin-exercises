fun <T, R, U> ((T) -> R).andThen(next: (R) -> U): (T) -> U {
    return { input: T -> next(this(input)) }
}