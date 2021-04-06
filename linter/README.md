# javascript Linter
method `javaScriptLinter()` takes in a file and scan it to check whether a line that should ends with a semicolon, didn't.

the method `javaScriptLinter()`uses helper method called `check()` that takes in a string and character to check if the string ends with that chacacter.

to run the code use the command `./gradlew run` in the terminal from within the linter directory

there are 5 different cases to test the method `javaScriptLinter()`
1. a file that has only one missed semicolon [one.js](./one.js)
2. a file that is empty [empty.js](./empty.js)
3. a file with a few error (2 missed semicolons) [few.js](./few.js)
4. a file that has no errors [correct.js](./correct.js)
5. a file that has 46 missed semicolon [gates.js](./gates.js)

when you run the code you will see the last file error messages(line number + a message that says missing a semicolon) as shown below:

Line 3: Missing semicolon.

Line 7: Missing semicolon.

Line 12: Missing semicolon.

Line 3: Missing semicolon.

.

.

.



