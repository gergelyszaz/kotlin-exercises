val numbers = listOf(10, 12, 15, 17, 18, 19)

// external iterator

for(i in numbers) {
    if(i % 2 == 0) {
        print("$i, ") //10, 12, 18,
    }
}