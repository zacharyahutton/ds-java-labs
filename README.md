# DS Java Labs

DS Java Labs is a **portfolio demonstration** collection of classic data structure implementations in Java, with JUnit 5 tests and short complexity notes. It supports UTech-style coursework learning goals without shipping proprietary exam materials.

## What it does

Each class implements a small, readable ADT from scratch (no `java.util` map/list replacements in the lab code). Tests document expected behavior; `docs/ComplexityNotes.md` summarizes Big-O for common operations.

## Stack

- Java 17+
- JUnit 5
- Maven

## Prerequisites

- JDK 17 or newer
- Apache Maven 3.9+

## Setup

```bash
git clone https://github.com/zacharyahutton/ds-java-labs.git
cd ds-java-labs
```

## How to run tests

```bash
mvn test
```

Expected: all tests in `src/test/java` pass (BST, linked list, hash map).

## What each class demonstrates

| Class | Topics |
|-------|--------|
| `BinarySearchTree` | BST insert/search, size, in-order traversal |
| `LinkedList` | Singly linked list, O(1) prepend, iteration |
| `ChainedHashMap` | Separate chaining, put/get/overwrite |

See `docs/ComplexityNotes.md` for operation costs.

## Project structure

```
src/main/java/com/zacharyahutton/ds/   Implementations
src/test/java/com/zacharyahutton/ds/   JUnit tests
docs/ComplexityNotes.md                Big-O reference
pom.xml                                Maven config
```

## Portfolio disclaimer

Linked from my [portfolio](https://github.com/zacharyahutton/portfolio). These are **learning samples**, not production libraries and not copies of graded exam submissions.

## Future improvements

- AVL or red-black tree balancing lab
- Iterator remove operations
- Gradle build option

## License

MIT
