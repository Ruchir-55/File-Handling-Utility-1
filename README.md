# File-Handling-Utility-1

**COMPANY** : CODTECH IT SOLUTIONS 

**NAME** : RUCHIR SUKHATANKAR

**INTERN ID** : CT08KKY

**DOMAIN NAME** : JAVA PROGRAMMING

**BATCH DURATION** : JANUARY 10th, 2024 to FEBRUARY 10th, 2024

**MENTOR NAME** : NEELA SANTOSH KUMAR

**DESCRIPTION OF TASK PERFORMED** :

Explanation of the Program:

1. writeToFile(String fileName, String content):
This method takes the filename and content to write to the file. It uses a FileWriter to write the content and then closes the writer to save the changes.
2. readFromFile(String fileName):
This method reads all lines from the file using Files.readAllLines(Paths.get(fileName)) and appends them into a StringBuilder for easy output. The result is returned as a single string.
3. modifyFile(String fileName, String additionalContent):
This method appends content to an existing file. It opens the file in append mode using the FileWriter with a second parameter true, which indicates appending instead of overwriting the content.
4. main(String[] args):
This is the entry point of the program, which demonstrates the use of the above methods:
It first writes initial content to a file.
Then it reads the content and prints it.
After that, it appends more content to the file.
Finally, it reads and prints the modified content.

