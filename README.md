* The anagram class works as follows:
1. Get the input sentences
2. Split sentence into words
3. Reverse all letters in each words:
	3.1 If symbol is a letter - push it to Stack and add 'L' letter to symbols Array
	3.2 If symbol is not a letter - add it to symbols Array
	3.3 Loop thru symbols array:
		3.3.1 If 'L' letter appears - add a popped from stack letter to resulting string
		3.3.2 Else - add symbols to resulting string
		3.3.3 Return it to Main method
4. Append all words (already reversed) back to one sentence
5. Write resulting sentence to console.