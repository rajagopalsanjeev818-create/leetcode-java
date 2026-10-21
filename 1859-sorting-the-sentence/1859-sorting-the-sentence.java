class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] arr = new String[words.length];
        for (String word : words) {
            int position= word.charAt(word.length()-1)-'0';
            String sub = word.substring(0,word.length()-1);
            arr[position - 1] = sub;
        }
        return String.join(" ", arr);
    }
}