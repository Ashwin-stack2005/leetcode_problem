class Solution {
    public boolean checkRecord(String s) {
    int Absent=0; 
    int Late=0;
    for (int i=0; i < s.length(); i++) {
        if (s.charAt(i) == 'A') Absent++;
        if (s.charAt(i) == 'L') Late++;
        else Late = 0;
        if (Absent >= 2 || Late > 2) return false;
    }

        return true;
    }
}