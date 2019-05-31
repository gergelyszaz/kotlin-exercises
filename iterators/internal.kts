// internal iterator

numbers.filter { e -> e % 2 == 0 }
    .forEach { e -> print("$e, ") } //10, 12, 18,
