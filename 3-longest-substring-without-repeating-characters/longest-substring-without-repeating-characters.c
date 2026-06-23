int lengthOfLongestSubstring(char * s){
    int lastIndex[128]; // ASCII size
    int i,end;
    for (i = 0; i < 128; i++) {
        lastIndex[i] = -1;
    }

    int maxLen = 0;
    int start = 0;

    for (end = 0; s[end] != '\0'; end++) {
        char currentChar = s[end];

        // If character has been seen and is inside current window
        if (lastIndex[currentChar] >= start) {
            start = lastIndex[currentChar] + 1; // move start
        }

        // Update the last index of the character
        lastIndex[currentChar] = end;

        int windowLen = end - start + 1;
        if (windowLen > maxLen) {
            maxLen = windowLen;
        }
    }

    return maxLen;
}
