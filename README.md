The anagram class works as follows:

- Get the input sentence
- Split sentence into words
- Reverse all letters in each words:
	- Break a word into Char array
	- Compare left and right borders
	- Swap them if they are both letters
	- Move borders
- Append all words (already reversed) back to one sentence
- Write resulting sentence to console.