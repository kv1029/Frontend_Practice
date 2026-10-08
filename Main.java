public class Main{
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k=2;
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] arr=new int[k];
        int x=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int a= entry.getValue();
            if (a>=k) {
                arr[x]=entry.getKey();
                x++;
            }
        }
        return arr;
    }
}