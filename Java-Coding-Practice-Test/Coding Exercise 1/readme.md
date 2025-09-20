# Java Program to Determine the ASCII Value of a Character

---


## Challenge Description (English)

### Introduction

In this challenge, you will create a Java program to determine the ASCII value of a given character. ASCII (American Standard Code for Information Interchange) is a standard that assigns unique numerical values to characters, enabling computers to process and represent text. By completing this challenge, you will learn how to perform typecasting in Java to convert a char into its corresponding ASCII integer value. This task emphasizes understanding basic data type conversions and writing modular, reusable functions.

#### Requirements

To complete this challenge, you must implement the following:

- **Function Name:** `findAsciiValue`

	  - Accepts a single character as input.
	  - Returns the ASCII integer value of the character using typecasting.
- **Function Name:** `getAsciiValue`

	  - Calls the `findAsciiValue` function and returns the ASCII value of the input character.

#### Input

The program should accept a single character as input. The input may include:

- Lowercase and uppercase alphabets (a to z, A to Z).
- Digits (0 to 9).
- Special characters (e.g., space, !, @, etc.).
- Extended ASCII characters (values 128–255).
- Edge cases like the null character (`\0`) and DEL character (127).

#### Output

The program should return the ASCII integer value of the input character.

#### Examples

```java
// Example 1: Lowercase alphabet
Input: 'a'
Output: 97

// Example 2: Uppercase alphabet
Input: 'Z'
Output: 90

// Example 3: Digit
Input: '5'
Output: 53

// Example 4: Special character
Input: '@'
Output: 64

// Example 5: Space character
Input: ' '
Output: 32

// Example 6: Null character
Input: '\0'
Output: 0

// Example 7: Extended ASCII character
Input: (char) 128
Output: 128
```

#### Constraints

- The input will always be a single character.
- The character can belong to the standard ASCII range (0–127) or extended ASCII range (128–255).
- The program should handle edge cases like the null character (`\0`) and DEL character (127).

#### Expected Time Complexity

- **Time Complexity:** O(1).

	  - Typecasting a char to an int is a constant-time operation.

#### Expected Auxiliary Space

- **Space Complexity:** O(1).

	  - The program uses a fixed amount of memory regardless of the input size.

#### Hint

Use typecasting to convert a char into its corresponding ASCII integer value. For example, `(int) character` will give you the ASCII value of the character. Modularize your code by separating the logic for finding the ASCII value into its own function.

## Introduction

En este desafío, crearás un programa en Java para determinar el valor ASCII de un carácter dado. ASCII (American Standard Code for Information Interchange) es un estándar que asigna valores numéricos únicos a los caracteres, permitiendo a las computadoras procesar y representar texto. Al completar este reto, aprenderás a realizar conversiones de tipo en Java para convertir un `char` en su valor entero ASCII correspondiente. Esta tarea enfatiza la comprensión de conversiones básicas de tipos de datos y la escritura de funciones modulares y reutilizables.

## Requisitos

Para completar este desafío, debes implementar lo siguiente:

- **Nombre de la función:** `findAsciiValue`
	- Acepta un solo carácter como entrada.
	- Devuelve el valor entero ASCII del carácter usando typecasting.
- **Nombre de la función:** `getAsciiValue`
	- Llama a la función `findAsciiValue` y retorna el valor ASCII del carácter de entrada.

## Entrada

El programa debe aceptar un solo carácter como entrada. La entrada puede incluir:

- Letras minúsculas y mayúsculas (a-z, A-Z).
- Dígitos (0-9).
- Caracteres especiales (por ejemplo, espacio, !, @, etc.).
- Caracteres ASCII extendidos (valores 128–255).
- Casos límite como el carácter nulo (`\0`) y el carácter DEL (127).

## Salida

El programa debe retornar el valor entero ASCII del carácter de entrada.

## Ejemplos

```java
// Ejemplo 1: Letra minúscula
Input: 'a'
Output: 97

// Ejemplo 2: Letra mayúscula
Input: 'Z'
Output: 90

// Ejemplo 3: Dígito
Input: '5'
Output: 53

// Ejemplo 4: Carácter especial
Input: '@'
Output: 64

// Ejemplo 5: Espacio
Input: ' '
Output: 32

// Ejemplo 6: Carácter nulo
Input: '\0'
Output: 0

// Ejemplo 7: Carácter ASCII extendido
Input: (char) 128
Output: 128
```

## Restricciones

- La entrada siempre será un solo carácter.
- El carácter puede pertenecer al rango ASCII estándar (0–127) o extendido (128–255).
- El programa debe manejar casos límite como el carácter nulo (`\0`) y el carácter DEL (127).

## Complejidad esperada

- **Complejidad temporal:** O(1)
	- Convertir un `char` a `int` es una operación de tiempo constante.
- **Espacio auxiliar:** O(1)
	- El programa utiliza una cantidad fija de memoria sin importar el tamaño de la entrada.

## Pista

Utiliza typecasting para convertir un `char` en su valor entero ASCII correspondiente. Por ejemplo, `(int) character` te dará el valor ASCII del carácter. Modula tu código separando la lógica para encontrar el valor ASCII en su propia función.
