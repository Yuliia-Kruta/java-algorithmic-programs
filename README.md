<h1 align="center">Turing Test</h1>

<h2>Project description</h2>
This Java program simulates a Turing machine, a theoretical computational model that manipulates symbols on an infinite tape according to a set of rules. The Turing machine in this project can be used to perform various operations on strings.
<br/><br/>
Key Concepts:<br/><br/>
<b>Alphabet:</b> The Turing machine uses a set of symbols to represent the tape's content.<br/>
<b>States:</b> The machine operates in states, and transitions between them based on the current symbol and state.<br/>
<b>Rules:</b> The transition rules dictate how the machine should behave when it encounters a specific symbol in a particular state.

<h2>Examples included</h2>
<h3>TuringTestBasic - Bitwise NOT</h3>
<b>Alphabet:</b> LinkedHashSet<Character> alphabet = new LinkedHashSet<>(Arrays.asList('0', '1', '_'));<br/>
<b>States:</b> int[] states = {1, 2};<br/>
<b>Rules:</b><br/>
Rule[][] rules = new Rule[alphabet.size()][states.length];<br/>
&nbsp&nbsp    rules[2][0] = new Rule('_', Move.R, 1);<br/>
&nbsp&nbsp    rules[0][1] = new Rule('1', Move.R, 1);<br/>
&nbsp&nbsp    rules[1][1] = new Rule('0', Move.R, 1);<br/>
&nbsp&nbsp    rules[2][1] = new Rule('_', Move.N, -1);  <br/>
<b>Input string: </b>"11100010"<br/>
<b>Output:</b><br/>
<img align="center" src="./TuringTestBasic.png" width="10%" height="auto"/>
<h3>TuringTestAdvanced</h3>
<b>Alphabet:</b> LinkedHashSet<Character> alphabet = new LinkedHashSet<>(Arrays.asList('a', 'b', '_','Н','|'));<br/>
<b>States:</b> int[] states = {1,2,3,4};
<h4>Example 1 - Remove last symbol</h4>
<b>Rules:</b><br/>
Rule[][] rulesEx1 = new Rule[alphabet.size()][states.length];<br/>
&nbsp&nbsp    rulesEx1[2][0] = new Rule('_', Move.R, 1);<br/>
&nbsp&nbsp    rulesEx1[0][1] = new Rule('a', Move.R, 1);<br/>
&nbsp&nbsp    rulesEx1[1][1] = new Rule('b', Move.R, 1);<br/>
&nbsp&nbsp    rulesEx1[2][1] = new Rule('_', Move.L, 0);<br/>
&nbsp&nbsp    rulesEx1[0][0] = new Rule('_', Move.N, -1);<br/>
&nbsp&nbsp    rulesEx1[1][0] = new Rule('_', Move.N, -1);<br/>
<b>Input string: </b>"abba"<br/>
<b>Output:</b>
<img align="center" src="./TuringTestAdvanced1.png" width="10%" height="auto"/>
<h4>Example 2 - Add last symbol</h4>
<b>Rules:</b>
Rule[][] rulesEx2 = new Rule[alphabet.size()][states.length];<br/>
&nbsp&nbsp    rulesEx2[2][0] = new Rule('_', Move.R, 1);<br/>
&nbsp&nbsp    rulesEx2[2][1] = new Rule('_', Move.N, -1);<br/>
&nbsp&nbsp    rulesEx2[0][1] = new Rule('a', Move.R, 2); //for first a<br/>
&nbsp&nbsp    rulesEx2[1][1] = new Rule('b', Move.R, 3); //for first b<br/>
&nbsp&nbsp    rulesEx2[0][2] = new Rule('a', Move.R, 2);<br/>
&nbsp&nbsp    rulesEx2[1][2] = new Rule('b', Move.R, 2);<br/>
&nbsp&nbsp    rulesEx2[2][2] = new Rule('a', Move.N, -1);<br/>
&nbsp&nbsp    rulesEx2[0][3] = new Rule('a', Move.R, 3);<br/>
&nbsp&nbsp    rulesEx2[1][3] = new Rule('b', Move.R, 3);<br/>
&nbsp&nbsp    rulesEx2[2][3] = new Rule('b', Move.N, -1);<br/>
<b>Input string: </b>"abb"<br/>
<b>Output:</b>
<img align="center" src="./TuringTestAdvanced2.png" width="10%" height="auto"/>
<h4>Example 3 - Count symbols</h4>
<b>Rules:</b><br/>
Rule[][] rulesEx3 = new Rule[alphabet.size()][states.length];<br/>
&nbsp&nbsp    rulesEx3[2][0] = new Rule('_', Move.R, 1);<br/>
&nbsp&nbsp    rulesEx3[2][1] = new Rule('_', Move.N, -1);<br/>
&nbsp&nbsp    rulesEx3[4][1] = new Rule('_', Move.R, 1);<br/>
<b>Input string: </b>"|||"<br/>
<b>Output:</b>
<img align="center" src="./TuringTestAdvanced3.png" width="10%" height="auto"/>
<h2>Technologies Used</h2>
<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>

<h2>Getting Started</h2>
To get a local copy up and running, follow these simple steps:
<br/>

Clone the turing-test branch.<br/><br/>
Compile the program using javac:<br/>
javac ProgramName.java<br/><br/>
Run the compiled program using java:<br/>
java ProgramName

<h2>License</h2>
Distributed under the MIT License. See LICENSE for more information.
