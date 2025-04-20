# Table of contents
- [About this repository](#about-this-repository)
- [Functional programming](#functional-programming)
- [About Streams](#about-streams)
- [Comparing Streams with Collections](#comparing-streams-with-collections)
- [How do these functions work under the hood?](#how-do-these-functions-work-under-the-hood)
- [How does java implement Functional Programming?](#how-does-java-implement-functional-programming)


## About this repository
This repository contains a brief discussion on what `functional programming` is and how it's applied in `Streams` and their respective operations. Also, there is a comparison between `Streams` and `Collections` with a brief description on how do Streams work behind the scenes. 

A few implementations can be found inside the `src` folder.

## Functional programming
Functional Programming is a style of programming that has `immutable` functions as its main building block.

Here are some of the characteristics:

* <b>Functions are immutable:</b> they don't alter the state of the object they operate on. For example, you can pass an instance of a Collection to it and perform an operation on its elements without altering the original instance's state.

* <b>Functions avoid side-effects: </b> you can't pass global scope variables and alter their state, for example, incrementing a value of a variable inside a function.

* <b>Use of higher-order functions: </b> functions that operate and return another function.

* <b>You can combine functions: </b> because they are both immutable and higher-order you can use them sequentially, one after another to chain a series of well-defined, predictable operations on your data.

* <b>Preference for pure-functions: </b> meaning they receive an input and return the same output.

Functional programming focuses on <i>what</i> should be done, an approach called `declarative`, while operations in Collections, for example, are called `imperative`, meaning they focus on <i>how</i> to do stuff.

## About Streams
In simple terms, a Stream is a sequence of elements that can be processed over time using a `functional-style` approach. A Stream can take a Collection of elements and perform multiple operations on it, by combining immutable functions, such as the famous `.map()`, `.reduce()` and `.filter()`, producing at the end of the chain a new Collection.

This is done because these functions operate on Streams and they themselves also return another Stream, therefore other functions can process the incoming data, like a pipeline until you decide to stop it

## Comparing Streams with Collections
At first glance it appears that Collections and Streams are similiar in a way, and although at times they can be applied to the same use cases they are fundamentally different regarding lots of aspects.

As mentioned above, Streams are focused on `operations` on data. Collections are `containers` of data, they persist information inside them, while Streams and they operations focus only, producing other streams or a final, separete collection.

The following table provides a comparison between the two of them:

<table>

<tr>
    <th>Feature</th>
    <th>Collection</th>
    <th>Stream</th>
</tr>

<tr>
    <td>Nature</td>
    <td>Data structure (stores elements)</td>
    <td>Abstraction for processing data</td>
</tr>

<tr>
    <td>Storage</td>
    <td>Yes (holds elements in memory)</td>
    <td>No (it doesn't store, just processes data)</td>
</tr>

<tr>
    <td>Traversal</td>
    <td>External iteration (using loops, etc.)</td>
    <td>	Internal iteration (handled by the stream)</td>
</tr>

<tr>
    <td>Mutability</td>
    <td>Usually it's mutable</td>
    <td>Immutable operations</td>
</tr>

<tr>
    <td>Reusability</td>
    <td>Can be re-used indefinitly</td>
    <td>One-time use only</td>
</tr>

<tr>
    <td>Lazy vs Eager</td>
    <td>Eager (all elements are computed)</td>
    <td>Lazy (operations are computed on demand)</td>
</tr>

<tr>
    <td>Paralellism</td>
    <td>Only via threads</td>
    <td>Built-in via .parallelStream() method</td>
</tr>

</table>

Streams and their operations provide a concise, easy-to-read method to process data.

One thing that might not be obivous is know the `lazy vs eager` approaches differs between them. Let's take the this example:

``` java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

Stream<Integer> lazyStream = numbers
    .stream()
    .filter(n -> {
        System.out.println("Filtering " + n);
        return n % 2 == 0;
    });

// No output yet — nothing is actually happening!

lazyStream.forEach(System.out::println); 
// NOW it runs, prints filtering messages and even numbers
```

They are lazy because they don't run until a <b>terminal operation</b> (like `collect()`, `forEach()`, or `count()` ) is called. Once this terminal operation get's the called the <b>whole</b> chain or pipeline get's executed at once. 

Because of this property you can declare a pipeline before and use it when it's actually (if at all) necessary.  

## How do these functions work under the hood?

## How does java implement Functional Programming?
Although Java is a class based, object-oriented language, since Java 8 support for functional programming was added, and with time a lot of features were implemented:

* Lambda expressions
* Method references
* Streams API
* Functional interfaces, like Predicate, Function...
* Optional
* Immutability with final and unmodifiable collections