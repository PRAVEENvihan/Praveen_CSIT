class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=null;
        for(int i=0;i<numRows;i++){
            list=new ArrayList<>();
            int start=0;
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    list.add(1);
                    continue;
                }list.add(result.get(i-1).get(start)+result.get(i-1).get(start+1));
                start++;
            }
            result.add(list);
        }
        return result;
    }
}
