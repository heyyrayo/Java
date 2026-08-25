# Java Programs

This repository contains simple Java practice programs.

## Programs

### 1. Hello World
File: `first.java`

Output:
```text
Hello, World!
```

### 2. Star Pattern 1
File: `star1.java`

Output:
```text
*
**
***
****
```

### 3. Star Pattern 2
File: `star2.java`

Output:
```text
****
***
**
*
```

## Star Pattern Collection

The repository also includes 13 individual star pattern programs:

1. `StarPattern01.java` - Right triangle
2. `StarPattern02.java` - Inverted triangle
3. `StarPattern03.java` - Centered pyramid
4. `StarPattern04.java` - Inverted pyramid
5. `StarPattern05.java` - Diamond
6. `StarPattern06.java` - Hollow square
7. `StarPattern07.java` - Hollow triangle
8. `StarPattern08.java` - Hollow pyramid
9. `StarPattern09.java` - Butterfly
10. `StarPattern10.java` - X pattern
11. `StarPattern11.java` - Plus pattern
12. `StarPattern12.java` - Hourglass
13. `StarPattern13.java` - Hollow diamond

Compile and run any pattern with:

```bash
javac StarPattern05.java
java StarPattern05
```

## How to run

```bash
javac *.java
java first
java star1
java star2
```

## Practice Notes

- Star patterns are built with nested loops: an outer loop controls rows and an inner loop controls each row's content.
- The variable `n` defines the pattern size, so changing it is an easy way to practice different dimensions.
- Increasing the leading-space loop moves characters toward the center and creates pyramid-shaped output.
- Odd-width rows such as `1, 3, 5` stars keep a pyramid visually centered around its middle column.
- Hollow patterns replace most interior stars with spaces while keeping the border visible.
- A conditional inside the inner loop can choose between printing `*` for an edge and a space for an interior position.
- Reversing a loop's direction changes an increasing pattern into a decreasing pattern without changing the output character.
- Diagonal patterns compare the current row and column indexes, which makes the X and plus shapes easy to express.
- Run `javac *.java` after edits to catch syntax errors across the complete practice collection.
