class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t== null|| s.length()!=t.length()){
            return false;

        }
        char[] a1= s.toLowerCase().toCharArray();
        char[] a2= t.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }

}
