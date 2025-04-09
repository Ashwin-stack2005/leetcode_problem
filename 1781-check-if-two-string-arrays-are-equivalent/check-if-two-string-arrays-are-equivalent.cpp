class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
        int i=0,j=0;
        string str1 = "";
        string str2 = "";
        while(i<word1.size()){
            str1 += word1[i];
            i++;
        }
        while(j<word2.size()){
            str2 += word2[j];
            j++;
        }
        if(str1 == str2) return true;
        return false;
    }
};