import java.util.*;

public class CountingTriplets {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size");
        int n=s.nextInt();
        System.out.println("enter common ratio");
        long r=s.nextInt();
        System.out.println("enter list");
        List<Long> list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(s.nextLong());
        }
        System.out.println(countTriplets(list,r));
    }

    private static long check(List<Long> list, long r) {
        long count=0;
        HashMap<Long,Long> l=new HashMap<>();
        for (int i = 0; i <list.size() ; i++) {
            if (!l.containsKey(list.get(i)))
                l.put(list.get(i), (long) 1);
            else l.put(list.get(i), l.get(list.get(i))+1);
        }
        //System.out.println(l);
        for (int i = 0; i <list.size() ; i++) {
            if (l.containsKey(list.get(i)*r)){
                if (l.containsKey(list.get(i)*r*r))
                    if (l.get(list.get(i))==1)
                        count+=l.get(list.get(i)*r)*l.get(list.get(i)*r*r)*l.get(list.get(i));
                    else count+=l.get(list.get(i)*r)*l.get(list.get(i)*r*r);
            }
        }
        return count;
    }
    static long countTriplets(List<Long> list, long r) {
        Long arr[] = new Long[list.size()];
        arr=list.toArray(arr);
        long cnt = 0;
        Map<Long, Long> map = new HashMap<>();
        Map<Long, Long> rMap = new HashMap<>();
        for (long n : arr) {
            if (n % r == 0) {
                long pre = n / r;
                Long cnt2 = rMap.get(pre);
                if (cnt2 != null) cnt += cnt2;

                Long cnt1 = map.get(pre);
                if (cnt1 != null) rMap.put(n, rMap.getOrDefault(n, 0L) + cnt1);
            }
            map.put(n, map.getOrDefault(n, 0L) + 1);
        }
        return cnt;
    }

}
