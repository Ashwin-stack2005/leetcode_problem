class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (char c : magazine.toCharArray()) {
            ransomNote = ransomNote.replaceFirst(String.valueOf(c), "");
        }
        return ransomNote.isEmpty();
    }
}