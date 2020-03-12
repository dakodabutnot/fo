# fo

## usage
```kotlin
class BookResolver : FakeOf<Book>(resolvesTo = Book(
    id = UUID.randomUUID().toString(),
    title = "mocked: title",
    author = "mocked: author"
))
```
or maybe even use it with MockK
```kotlin
class BookResolver : FakeOf<Book>(resolvesTo = mockk())
```
whatever you want :)
