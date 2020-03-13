# fo

[![](https://jitpack.io/v/dakodabutnot/fo.svg)](https://jitpack.io/#dakodabutnot/fo)

## installation
add repository to build file
```kotlin
maven("https://jitpack.io")
```
and add dependency
```kotlin
testImplementation("com.github.dakodabutnot:fo:1.0.1")
```

## usage

`FakeOf` as a `ParameterResolver` shortcut

```kotlin
class BookResolver : FakeOf<Book>(resolvesTo = Book(
    id = UUID.randomUUID().toString(),
    title = "mocked: title",
    author = "mocked: author"
))
```
or even use it with *MockK*
```kotlin
class BookResolver : FakeOf<Book>(resolvesTo = mockk())
```

there are some aliases if you want it to make more sense when reading based on context, your choice!

```kotlin
class BookResolver : ResolverOf<Book>(resolvesTo = mockk())
```
```kotlin
class BookResolver : QuickResolver<Book>(resolvesTo = mockk())
```
