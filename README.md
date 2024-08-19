# Avocado
Avocado is a programming language created to simplify learning the basics of low level languages like C.

## What
Avocado was created to simplify the process of learning low level languages.
Avocado allows the developer to get hands on a virtual memory and has syntax quite similar to C/C++,
  which gives the developer a realistic feeling of writing code in a low level language.

> Note: Avocado isn't a tool to directly learn low level languages however it's more of a simple programming
> language that gives you a taste of low level languages via it's syntax and it's features.

# Documentation
> Note: Before going any further, it's best if you already have knowledge on core features within programming languages
## End of code
Just like C when you have finished writing your code you must add a ';' at the end to let the language know that it's 
complete.
```
some_function(some_param: some_type); # This is valid
some_function(some_param: some_type)  # This is invalid
some_function(some_function())        # This is invalid
some_function(some_function());       # This is valid
```
## Comments
To write a comment within your code, you must use the '#' special symbol.
You can only do single line comments and there is no way to do multiple line comments.
```
# This is a single line comment
# This is the single line comment continued on
```
## Types
Avocado offers 4 different types to keep things simple, these being; string, int, char and float.
### String
### Int
Int, also known as integer, is a type that stores a bunch of digits, since avocado is a fairly simple language, that means 
no long was implemented meaning int can be used for all sizes of integers ranging from 64bit to 8bit, in both positive and negative.
When writing the value of an int you must just write it out fully without any " or '.
```
int x = 123;                       # This is valid
int y = '123';                     # This is invalid
int z = "123";                     # This is invalid
int s = -1;                        # This is valid
int l = 9,223,372,036,854,775,808; # This is valid
```
### Char
Char, also known as character, is a type that stores 1 character and requires the the value to be encapsulated within a 
opening ' and closing '.
```
char x = 'x';   # This is valid
char y = "y";   # This is NOT valid
char z = "xyc"; # This is NOT valid
```
### Float
