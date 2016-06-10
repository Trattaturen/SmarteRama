The anagram class works as follows:

- Get the input sentences
- Split sentence into words
- Reverse all letters in each words:
	- Break a word into Char array
	- Loop thru every character in array and place all non-letter characters to same positions of "Reversed" array
	- Loop thru every character in array again and find letters:
		- If last spot in "Reversed" array is empty - place it there
		- If last spot in "Reversed" array already contains a character - move left till find free spot
- Append all words (already reversed) back to one sentence
- Write resulting sentence to console.