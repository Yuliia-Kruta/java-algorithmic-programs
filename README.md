<h1 align="center">String Transformations</h1>
<h2>Branch description</h2>
This branch consists of a series of Java programs that perform various string transformations based on predefined sets of rules defined in a two-dimensional array called 'states'. Each program takes an input string and applies a series of transformations using regular expressions.<br/><br/>
Example of 'states' and input string:<br/>
String[][] states = {{"a|", "|ba"},{"a", ""},{"b|", "|b"},{"|*", "*a"},{"*", "c"},{"c|", "c"},{"cb", "|c"},{"c", "."}};<br/>
String str = "||||*|||";<br/><br/>
The programs included are:<br/><br/>

1. **AddEndSymbol**: The program adds 1 more symbol to the end of the string.
<img align="center" src="./img/AddEndSymbol.png" width="25%" height="auto"/>

2. **ClearEndSymbol**: The program removes the last symbol of the string.
<img align="center" src="./img/ClearEndSymbol.png" width="25%" height="auto"/>

3. **DuplicateString**: The program duplicates the input string.
<img align="center" src="./img/DuplicateString.png" width="25%" height="auto"/>

4. **CountBars**: The program counts the number of vertical bars in the string and displays the count as a decimal.
<img align="center" src="./img/CountBars.png" width="60%" height="auto"/>

5. **CalcExpression**: The program calculates the expression within the string.
<img align="center" src="./img/CalcExpression.png" width="25%" height="auto"/>

6. **CalcMultiplication**: The program calculates a simple multiplication expression.
<img align="left" src="./img/CalcMultiplication1.png" width="30%" height="auto"/>
<img align="center" src="./img/CalcMultiplication2.png" width="30%" height="auto"/>

7. **CalcMultiplicationExpr**: The program calculates a more advanced multiplication expression.<br/>

Images order:<br/>
1  2<br/>
3  4

<img align="left" src="./img/CalcMultiplicationExpr1.png" width="30.8%" height="auto"/>
<img align="center" src="./img/CalcMultiplicationExpr2.png" width="25%" height="auto"/>
<img align="left" src="./img/CalcMultiplicationExpr3.png" width="28.1%" height="auto"/>
<img align="center" src="./img/CalcMultiplicationExpr4.png" width="25%" height="auto"/>

9. **DivideBy3Quotient**: A program finds a quotient of the division by 3.
<img align="center" src="./img/DivideBy3Quotient.png" width="25%" height="auto"/>

10. **FindRemainder**: A program finds the remainder of a division.
<img align="left" src="./img/FindRemainder1.png" width="30%" height="auto"/>
<img align="center" src="./img/FindRemainder2.png" width="30%" height="auto"/><br/><br/><br/>

11. **GCD**: A program finds the greatest common divisor of 2 numbers.
<img align="left" src="./img/GCD1.png" width="30%" height="auto"/>
<img align="center" src="./img/GCD2.png" width="30%" height="auto"/><br/><br/><br/><br/><br/>


<h2>Technologies Used</h2>
<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>

<h2>Getting Started</h2>
To get a local copy up and running, follow these simple steps:
<br/><br/>

Clone the java-algorithmic-programs repository:<br/>
git clone https://github.com/Yuliia-Kruta/java-algorithmic-programs.git<br/><br/>
Navigate to the project directory:<br/>
cd java-algorithmic-programs<br/><br/>
Checkout the branch:<br/>
git checkout string-transformations<br/><br/>
Open the project in your preferred IDE.

<h2>License</h2>
Distributed under the MIT License. See LICENSE for more information.
