# Java Pool - Module 00
## Primitive types, IO, String, Arrays

> **⚠️ NO AI USED DOING THIS POOL**

This repository contains solutions for Java Pool Module 00 exercises, completed without any AI assistance. All code was written manually to understand Java fundamentals and master primitive types, I/O operations, strings, and arrays.

## Table of Contents
- [Module Overview](#module-overview)
- [Project Structure](#project-structure)
- [Exercises](#exercises)
  - [Exercise 00: Sum of Digits](#exercise-00--sum-of-digits)
  - [Exercise 01: Really Prime Number](#exercise-01--really-prime-number)
  - [Exercise 02: Endless Sequence (or not?)](#exercise-02--endless-sequence-or-not)
  - [Exercise 03: A Little Bit of Statistics](#exercise-03--a-little-bit-of-statistics)
  - [Exercise 04: A Bit More of Statistics](#exercise-04--a-bit-more-of-statistics)
  - [Exercise 05: Schedule](#exercise-05--schedule)
- [Compilation & Execution](#compilation--execution)
- [Learning Outcomes](#learning-outcomes)

---

## Module Overview

**Summary**: In this first module, the focus is on solving both trivial and more challenging business tasks using basic Java language constructs.

### Key Topics Covered:
- **Primitive types**: boolean, char, byte, short, int, long, float, double
- **Input/Output**: System.out, System.err, Scanner
- **Control structures**: loops, conditionals, iterations
- **String manipulation**: equals, toCharArray, length
- **Arrays**: basic array operations and data storage
- **Algorithms**: prime checking, frequency analysis, data visualization

### Module Constraints:
- User-defined methods and classes are prohibited (except static functions in main class)
- Only ALLOWED language constructs per exercise may be used
- System::exit may be used for all exercises
- Solutions must match specified output examples exactly

**Disclaimer**: All exercises in this pool were completed manually without the use of AI tools, relying solely on Java documentation, the Böhm-Jacopini theorem, personal knowledge, and problem-solving skills.

---

## Project Structure

```
Java-Pool/
└── Java - Module 00/
    ├── ex00/
    │   └── Program.java          # Sum of digits (6-digit number)
    ├── ex01/
    │   └── Program.java          # Prime number checker with iterations
    ├── ex02/
    │   └── Program.java          # Coffee request query counter
    ├── ex03/
    │   └── Program.java          # Student progress visualizer
    ├── ex04/                     # Character frequency histogram (TODO)
    └── ex05/                     # Class schedule timetable (TODO)
```

**Status**: ✅ Exercises 00-03 completed | ⏳ Exercises 04-05 pending

---

## Exercises

### Exercise 00 : Sum of Digits

**Turn-in directory**: `ex00/`  
**Files**: `Program.java`

**Allowed constructs**:
- Input/Output: `System.out`
- Types: Primitive types
- Operators: Standard operations of primitive types

**Objective**: Calculate the sum of digits of a six-digit int number.

**Description**:  
Java is a strictly typed programming language with eight primitive types. This exercise focuses on working with the `int` type. The number value is set directly in the code by explicitly initializing the number variable.

**Implementation**:
- Hardcoded number: `479598`
- Uses modulo (%) to extract digits
- Uses division (/) to remove processed digits
- Accumulates sum in a variable

**Example output**:
```
$> java Program
42
$>
```

**Key Concept**: Understanding primitive integer types and basic arithmetic operations.

---

### Exercise 01 : Really Prime Number

**Turn-in directory**: `ex01/`  
**Files**: `Program.java`

**Allowed constructs**:
- Input/Output: `System.out`, `System.err`, `Scanner(System.in)`
- Types: Primitive types
- Operators: Standard operations, conditions, loops

**Objective**: Determine if an input number is prime using the Böhm-Jacopini theorem (sequence, selection, iteration).

**Description**:  
A prime number has no divisors other than itself and 1. The program accepts keyboard input, checks primality, and displays the number of iterations (comparison operations) required.

**Special cases**:
- For negative numbers, 0, and 1: display "IllegalArgument" and exit with code -1

**Algorithm**:
- Read number from input
- Validate (must be ≥ 2)
- Check divisibility from 2 up to √n
- Count each comparison as one iteration
- Display result and iteration count

**Example output**:
```
$> java Program
-> 169
false 12

$> java Program
-> 113
true 10

$> java Program
-> -100
IllegalArgument
```

**Key Concept**: Böhm-Jacopini theorem application and efficient prime checking.

---

### Exercise 02 : Endless Sequence (or not?)

**Turn-in directory**: `ex02/`  
**Files**: `Program.java`

**Allowed constructs**:
- Input/Output: `System.out`, `System.err`, `Scanner(System.in)`
- Types: Primitive types
- Operators: Standard operations, conditions, loops

**Objective**: Count queries where the sum of digits is a prime number (simulating Google search query analysis).

**Description**:  
Process an infinite sequence of search queries (natural numbers) without storing them. A query is "coffee-related" if its digit-sum is prime. The sequence terminates when `42` is entered.

**Business context**: Process data streams efficiently without wasting resources on irrelevant queries.

**Algorithm**:
1. Read number
2. Calculate sum of its digits
3. Check if digit-sum is prime
4. Increment counter if true
5. Repeat until `42` is entered
6. Display count

**Example output**:
```
$> java Program
-> 198131
-> 12901212
-> 11122
-> 42
Count of coffee-request : 2
```

**Key Concept**: Stream processing and digit manipulation without data storage.

---

### Exercise 03 : A Little Bit of Statistics

**Turn-in directory**: `ex03/`  
**Files**: `Program.java`

**Allowed constructs**:
- Input/Output: `System.out`, `System.err`, `Scanner(System.in)`
- Types: Primitive types, String
- Operators: Standard operations, conditions, loops
- Methods: `String::equals`

**Objective**: Visualize student progress over multiple weeks using ASCII bar charts.

**Description**:  
Educational organizations need visual analytics. This program tracks minimum grades for 5 tests per week and displays a progress chart. Each test is graded 1-9.

**Constraints**:
- Maximum 18 weeks
- Exactly 5 tests per week (guaranteed)
- Weeks may be entered out of order
- Display "IllegalArgument" and exit with -1 if order is wrong
- Input terminates with `42`
- **Do NOT use arrays** - find alternative storage methods
- Avoid string concatenation in loops (performance issue)

**Validation**:
- Week header must be exactly "Week N" where N matches expected sequence
- Each grade must be between 1 and 9

**Example output**:
```
$> java Program
-> Week 1
-> 4 5 2 4 2
-> Week 2
-> 7 7 7 7 6
-> Week 3
-> 4 3 4 9 8
-> Week 4
-> 9 9 4 6 7
-> 42
Week 1 ==>
Week 2 ======>
Week 3 ===>
Week 4 ====>
```

**Key Concept**: Data visualization, non-array storage techniques, and input validation.

---

### Exercise 04 : A Bit More of Statistics

**Turn-in directory**: `ex04/`  
**Files**: `Program.java`

**Allowed constructs**:
- Input/Output: `System.out`, `System.err`, `Scanner(System.in)`
- Types: Primitive types, String, arrays
- Operators: Standard operations, conditions, loops
- Methods: `String::equals`, `String::toCharArray`, `String::length`

**Objective**: Implement frequency analysis for character occurrences (feel like a hacker!).

**Description**:  
Analyze character frequency in text and display results as a scalable histogram showing the 10 most frequent characters.

**Requirements**:
- Display top 10 most frequent characters in descending order
- If frequencies are equal, sort lexicographically
- Scalable chart: max height = 10, min height = 0
- Input: single string ending with `\n`
- Maximum character occurrences: 999
- Characters must fit in `char` (Unicode BMP, max code 65535)
- Sequence terminates with `42`

**Performance constraint**:
- **Must NOT** use multiple iterations over source text
- Avoid sorting and removing repetitions (too slow)
- Use efficient information processing methods

**Example output**:
```
$> java Program
-> AAAAAAAAAA...WWWWWWOOOOOOO42
36
# 35
# #
# # 27
# # #
# # #
# # # 14 12
# # # # #
# # # # #
# # # # #
D A S W L

9
#
#
K

7
#
O

4
#
T

2
E

2
R
```

**Key Concept**: Frequency analysis, histogram generation, and algorithm optimization.

**Status**: ⏳ Not yet implemented

---

### Exercise 05 : Schedule

**Turn-in directory**: `ex05/`  
**Files**: `Program.java`

**Allowed constructs**:
- Input/Output: `System.out`, `System.err`, `Scanner(System.in)`
- Types: Primitive types, String, arrays
- Operators: Standard operations, conditions, loops
- Methods: `String::equals`, `String::toCharArray`, `String::length`

**Objective**: Create a class timetable system for September 2020.

**Description**:  
Build an MVP timetable for a school opening in September 2020. Manage students, class schedules, and attendance tracking.

**Constraints**:
- Classes: Monday-Sunday, 1 PM - 6 PM
- Multiple classes per day allowed
- Maximum 10 classes per week
- Maximum 10 students
- Maximum student name length: 10 characters (no spaces)
- Attendance status: HERE, NOT_HERE

**Application lifecycle**:
1. **Student list creation**: Enter student names
2. **Timetable population**: Enter class times and weekdays
3. **Attendance recording**: Mark attendance for specific dates
4. **Display**: Show timetable with attendance in tabular format

**Stage separator**: `.` (period)

**Example output**:
```
$> java Program
-> John
-> Mike
-> .
-> 2 MO
-> 4 WE
-> .
-> Mike 2 28 NOT_HERE
-> John 4 9 HERE
-> Mike 4 9 HERE
-> .
4:00 WE 2| 2:00 MO 7|4:00 WE 9|2:00 MO 14|4:00 WE 16|2:00 MO 21|4:00 WE 23|2:00 MO 28|2:00 MO 30|
John      |         |        1|         |         |         |         |         |         |
Mike      |         |        1|         |         |         |         |       -1|         |
```

**Key Concept**: Complex data structures, scheduling algorithms, and table formatting.

**Status**: ⏳ Not yet implemented

---

## Compilation & Execution

### Requirements
- **Java Version**: Latest LTS version (Java 17 or higher recommended)
- **Runtime**: Both JVM and GraalVM for running code
- **IDE**: IntelliJ IDEA (recommended)
- **Code Style**: Oracle standards

### General Commands

```bash
# Navigate to exercise directory
cd "Java - Module 00/ex00"

# Compile
javac Program.java

# Run with JVM
java Program

# Run with GraalVM (if installed)
graalvm/bin/java Program

# Clean up
rm *.class
```

### Exercise-Specific Examples

**Exercise 00** (Hardcoded value):
```bash
cd "Java - Module 00/ex00"
javac Program.java
java Program
# Output: 42
```

**Exercise 01** (Interactive - Prime checker):
```bash
cd "Java - Module 00/ex01"
javac Program.java
java Program
# -> 169
# false 12
```

**Exercise 02** (Interactive - Coffee requests):
```bash
cd "Java - Module 00/ex02"
javac Program.java
java Program
# Enter numbers, type 42 to finish
# Output: Count of coffee-request : X
```

**Exercise 03** (Interactive - Student progress):
```bash
cd "Java - Module 00/ex03"
javac Program.java
java Program
# -> Week 1
# -> 4 5 2 4 2
# Continue entering weeks, type 42 to display chart
```

**Exercise 04** (Interactive - Frequency analysis):
```bash
cd "Java - Module 00/ex04"
javac Program.java
java Program
# Enter a long string ending with 42
# Displays character frequency histogram
```

**Exercise 05** (Interactive - Schedule):
```bash
cd "Java - Module 00/ex05"
javac Program.java
java Program
# Follow 3-stage lifecycle: students, timetable, attendance
# Use . (period) to separate stages
```

---

## Learning Outcomes

Through completing these exercises manually (without AI assistance), I gained deep understanding of:

### Core Java Fundamentals
- ✅ **Primitive types**: boolean, char, byte, short, int, long, float, double
- ✅ **Type safety**: Java's strictly typed nature
- ✅ **Control structures**: sequence, selection, iteration (Böhm-Jacopini theorem)
- ✅ **Input/Output**: System.out, System.err, Scanner

### Algorithm Design & Optimization
- ✅ **Prime number checking**: Efficient √n optimization
- ✅ **Iteration counting**: Understanding algorithm complexity
- ✅ **Stream processing**: Handling infinite sequences without storage
- ✅ **Frequency analysis**: Single-pass text processing
- ✅ **Data visualization**: ASCII chart generation

### Problem-Solving Constraints
- ✅ **No user-defined classes**: Working within strict limitations
- ✅ **Alternative storage**: Non-array data structures
- ✅ **Performance optimization**: Avoiding string concatenation in loops
- ✅ **Single-pass processing**: Minimizing iterations

### Real-World Applications
- ✅ **Search query analysis**: Google-style data stream processing
- ✅ **Educational analytics**: Student progress tracking
- ✅ **Cryptanalysis**: Frequency analysis for text decryption
- ✅ **Scheduling systems**: Timetable management
- ✅ **Input validation**: Robust error handling

### Java-Specific Skills
- ✅ **String methods**: equals(), toCharArray(), length()
- ✅ **Scanner usage**: Keyboard input and parsing
- ✅ **Exit codes**: Proper program termination (System::exit)
- ✅ **Array manipulation**: Basic to advanced operations
- ✅ **Unicode handling**: Character code processing (BMP)

### Software Engineering Practices
- ✅ **Code formatting**: Oracle standards compliance
- ✅ **Version control**: Git repository management
- ✅ **Documentation**: Clear code comments and output formatting
- ✅ **Testing**: Matching exact output specifications

---

## Technical Challenges Overcome

### Exercise 03 Highlights
- **No arrays allowed**: Implemented storage using primitive type composition
- **String concatenation performance**: Avoided loops to prevent slowdown
- **Out-of-order input**: Sequential validation logic

### Exercise 04 Highlights (Pending)
- **Single-pass requirement**: No multiple iterations over text
- **Efficient sorting**: Frequency + lexicographic ordering
- **Scalable visualization**: Dynamic histogram height calculation

### Exercise 05 Highlights (Pending)
- **Complex state management**: 3-stage lifecycle without OOP
- **Calendar logic**: September 2020 date calculations
- **Table formatting**: ASCII-based timetable display

---

## Project Metadata

- **Module**: Java - Module 00
- **Topic**: Primitive types, IO, String, Arrays
- **Version**: 1.00
- **Exercises Completed**: 4/6 (ex00-ex03)
- **Exercises Pending**: 2/6 (ex04-ex05)
- **Date**: November 30, 2025
- **Repository**: Java-Pool
- **Branch**: main

---

## Development Environment

- **OS**: Linux
- **Shell**: bash
- **Java LTS Version**: Latest
- **Runtime**: JVM + GraalVM
- **IDE**: IntelliJ IDEA
- **Code Style**: Oracle Standards
- **Version Control**: Git

---

## Author

**ky05h1n** - All work completed independently without AI assistance

GitHub: [@ky05h1n](https://github.com/ky05h1n)

---

## Acknowledgments

This pool was completed through:
- ✅ Reading official Java documentation
- ✅ Understanding the Böhm-Jacopini theorem
- ✅ Manual algorithmic problem-solving
- ✅ Trial and error debugging
- ✅ Applying Oracle coding standards
- ✅ Learning from errors and compiler messages

### Resources Used (No AI)
- Official Java SE Documentation
- Oracle Java Tutorials
- Stackoverflow (for specific syntax questions)
- Java Language Specification
- Böhm-Jacopini theorem references

---

## Important Notes

⚠️ **Absolutely NO artificial intelligence or code generation tools were used in the creation of these solutions.**

This includes:
- ❌ No ChatGPT, Claude, or other LLM assistants
- ❌ No GitHub Copilot or AI code completion
- ❌ No automated code generators
- ✅ Only human brain, Java docs, and determination

The struggles, bugs, and victories were all genuine learning experiences.

---

## License

This project is for educational purposes as part of the Java Pool curriculum.
