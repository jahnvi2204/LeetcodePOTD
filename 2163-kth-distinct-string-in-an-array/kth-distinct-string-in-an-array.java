class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> nums = new ArrayList<>();
        for(String s : arr){
            map.put(s,map.getOrDefault(s,0)+1);

        }
        for(String s:arr){
            if(map.get(s)==1){
                nums.add(s);
            }
        }
        int i=0;
        for(String s : nums){
            if(i==k-1){
                return s;
            }
            i++;
        }
        return "";
            
        }
        
    }
