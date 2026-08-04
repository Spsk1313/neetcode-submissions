class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            StringBuilder length = new StringBuilder();

            while (str.charAt(i) != '#') {
                length.append(str.charAt(i));
                i++;
            }

            i++;
           int len = Integer.parseInt(length.toString());
           strs.add(str.substring(i, i + len));

            i += len;
        }

        return strs;
    }
}