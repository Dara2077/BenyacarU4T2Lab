
        public class StringLoops
        {
            // default constructor; no instance variables
            public StringLoops() { }

            /* Returns the number of times "character" appears in "searchString"
               This should be NON-case sensitive!

               Examples:
               - if character = "a" and searchString = "Apple and banana",
                 this method returns 5 (it finds BOTH "A" and "a")
               - if character = "A" and searchString = "Apple and banana",
                 this method returns 5 (it finds BOTH "A" and "a")
               - if character = "!" and searchString = "Hello! Nice day!",
                 this method returns 2

                DO THIS WITH A FOR LOOP!
              */
            public int countCharacters(String character, String searchString) {
                int count = 0;
                String upper = character.toUpperCase();
                String lower = character.toLowerCase();
                for (int i = 0; i < searchString.length(); i ++){
                    if ((searchString.substring(i, i+1)).equals(upper) || ((searchString.substring(i, i+1)).equals(lower))){
                        count ++;
                    }
                }
                return count;
            }

            /* Returns the original string reversed

             Examples:
             - if origString = "hello!" this method returns "!olleh"
             - if origString = "Apples and bananas" this method returns "sananab dna selppA"
            */
            public String reverseString(String origString) {
                String tempString = "";
                for (int i = origString.length() -1; i >= 0; i--){
                    tempString += origString.substring(i, i+ 1);
                }
                return tempString;
            }
        }

