class Solution {
    public int compress(char[] chars) {
        String s = String.valueOf(chars);
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            Integer count=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;

            }
             sb.append(s.charAt(i));
       if (count > 1) {
                sb.append(count); //treats digits as number
            }
        }
           
        char[] compressedChars = sb.toString().toCharArray();
                for (int i = 0; i < compressedChars.length; i++) {
                    chars[i] = compressedChars[i];
                }
        
        return sb.length();
    }
   
    }