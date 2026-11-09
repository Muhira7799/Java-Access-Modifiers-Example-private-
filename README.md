# Java Access Modifiers Example (`private`)

A small Java program that demonstrates how the `private` access modifier stops one class from using another class's method.

## What It Demonstrates

```java
class A {
    private void show() {
        System.out.println("Hello");
    }
}

public class B {
    public static void main(String[] args) {
        A a = new A();
        a.show();   // compile error
    }
}
```

The method `show()` in class `A` is `private`, so it can only be used inside class `A`. Class `B` is a different class, so it cannot call it.

## Important: This Code Does Not Compile

Compiling gives an error like this:

```
B.java:10: error: show() has private access in A
        a.show();
         ^
1 error
```

The comment in the code says `private` was changed to `public`, but the method is still declared `private`, so the error remains.

## The Fix

Change `private` to `public` (or remove it to use package-private access, which works because both classes are in the same file/package):

```java
class A {
    public void show() {
        System.out.println("Hello");
    }
}
```

After the fix, the output is:

```
Hello
```

## Access Modifiers at a Glance

| Modifier | Same class | Same package | Subclass | Everywhere |
|----------|:----------:|:------------:|:--------:|:----------:|
| `private` | Yes | No | No | No |
| (none) | Yes | Yes | No | No |
| `protected` | Yes | Yes | Yes | No |
| `public` | Yes | Yes | Yes | Yes |

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

### Clone the repository

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
```

### Compile

```bash
javac B.java
```

### Run

```bash
java B
```

## Project Structure

```
.
├── B.java
└── README.md
```

## Next Steps

- Keep the field or method `private` and add a public getter or setter instead
- Try `protected` with a subclass
- Move class `A` into its own file
