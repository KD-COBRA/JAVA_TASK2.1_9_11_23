import java.util.Arrays;

public class TASK_2_1 {

    public static void main(String[] args) {
        String text = "We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative”";

        // charAt()
        char firstChar = text.charAt(0);
        System.out.println("First character: " + firstChar);

        // compareTo()
        String anotherText = "This is another text";
        int comparisonResult = text.compareTo(anotherText);
        if (comparisonResult < 0) {
            System.out.println(text + " comes before " + anotherText);
        } else if (comparisonResult > 0) {
            System.out.println(text + " comes after " + anotherText);
        } else {
            System.out.println(text + " is equal to " + anotherText);
        }

        // concat()
        String concatenatedText = text.concat(" and this is the continuation");
        System.out.println("Concatenated text: " + concatenatedText);

        // contains()
        boolean containsSubstring = text.contains("Bombay rain");
        System.out.println("Does the text contain 'Bombay rain': " + containsSubstring);

        // endsWith()
        boolean endsWithPeriod = text.endsWith(".");
        System.out.println("Does the text end with a period: " + endsWithPeriod);

        // equals()
        boolean isEqual = text.equals("We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative”");
        System.out.println("Is the text equal to itself: " + isEqual);

        // equalsIgnoreCase()
        boolean equalIgnoreCase = text.equalsIgnoreCase("WE REALIZES THAT WHILE OUR WORKERS WERE THRIVING, THE SURROUNDING VILLAGES WERE STILL SUFFERING. IT BECAME OUR GOAL TO UPLIFT THEIR QUALITY OF LIFE AS WELL. I REMEMBER SEEING A FAMILY OF 4 ON A MOTORBIKE IN THE HEAVY BOMBAY RAIN — I KNEW I WANTED TO DO MORE FOR THESE FAMILIES WHO WERE RISKING THEIR LIVES FOR LACK OF AN ALTERNATIVE”");
        System.out.println("Are the texts equal, ignoring case: " + equalIgnoreCase);

        // format()
        String formattedText = String.format("The text is: %s", text);
        System.out.println("Formatted text: " + formattedText);

        // getBytes()
        byte[] textBytes = text.getBytes();
        System.out.println("Text as bytes: " + Arrays.toString(textBytes));

        // getChars()
        char[] textChars = new char[text.length()];
        text.getChars(0, text.length(), textChars, 0);
        System.out.println("Text as chars: " + Arrays.toString(textChars));

        // indexOf()
        int index = text.indexOf("I remember");
        if (index >= 0) {
            System.out.println("'I remember' found at index: " + index);
        } else {
            System.out.println("'I remember' not found");
        }

        // intern()
        String internedText = text.intern();
        System.out.println("Interned text: " + internedText);

        // isEmpty()
        boolean isEmpty = text.isEmpty();
        System.out.println("Is the text empty: " + isEmpty);

        // join()
        String[] words = text.split(" ");
        String joinedWords = String.join(" ", words);
        System.out.println("Joined words: " + joinedWords);

        // lastIndexOf()
        int lastIndex = text.lastIndexOf("I remember");
        if (lastIndex >= 0) {
            System.out.println("'I remember' last found at index: " + lastIndex);
        } else {
            System.out.println("'I remember' not found");
        }

        // length()
        int textLength = text.length();
        System.out.println("Length of the text: " + textLength);

        // replace()
        String replacedText = text.replace("workers", "employees");
        System.out.println("Text with 'workers' replaced by 'employees': " + replacedText);

// replaceAll()
        String replacedAllText = text.replaceAll("were", "had been");
        System.out.println("Text with all occurrences of 'were' replaced by 'had been': " + replacedAllText);

// split()
        String[] splitWords = text.split(" ");
        System.out.println("Text split into words: " + Arrays.toString(splitWords));

// startsWith()
        boolean startsWithQuality = text.startsWith("quality");
        System.out.println("Does the text start with 'quality': " + startsWithQuality);

// substring()
        String substringText = text.substring(50, 80);
        System.out.println("Substring from index 50 to 80: " + substringText);

// toCharArray()
        char[] textCharArray = text.toCharArray();
        System.out.println("Text as char array: " + Arrays.toString(textCharArray));

// toLowerCase()
        String lowerCaseText = text.toLowerCase();
        System.out.println("Text in lowercase: " + lowerCaseText);

// toUpperCase()
        String upperCaseText = text.toUpperCase();
        System.out.println("Text in uppercase: " + upperCaseText);

// trim()
        String trimmedText = text.trim();
        System.out.println("Text with leading and trailing whitespaces removed: " + trimmedText);

// valueOf()
        String textFromString = text.valueOf(true);
        System.out.println("String representation of boolean value true: " + textFromString);

    }
}
