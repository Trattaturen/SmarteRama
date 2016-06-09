The anagram class works as follows:

- Get the input sentences
- Split sentence into words
- Reverse all letters in each words:
	- If symbol is a letter - push it to Stack and add 'L' letter to symbols Array
	- If symbol is not a letter - add it to symbols Array
	- Loop thru symbols array:
		- If 'L' letter appears - add a popped from stack letter to resulting string
		- Else - add symbols to resulting string
		- Return it to Main method
- Append all words (already reversed) back to one sentence
- Write resulting sentence to console.