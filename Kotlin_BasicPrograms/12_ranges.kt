/*
    Ranges:
        With the for loop, you can also create ranges of values with "..".
*/

fun main()
{

    for (chars in 'a'..'z') {
        print("$chars ")
    }

    print("\n")

    for (nums in 5..15) {
        print("$nums ")
    }

    print("\n")

    // Break or Continue a Range:
    //     You can also use the break and continue keywords in a range/for loop.

    for (nums in 5..15) {
        if (nums == 10) {
            break
        }
        print("$nums ")
    }

    print("\n")

    for (nums in 5..15) {
        if (nums == 10) {
            continue
        }
        print("$nums ")
    }
}