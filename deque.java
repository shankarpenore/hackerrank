    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque <Integer>deque = new ArrayDeque<Integer>();
            HashSet <Integer> hs = new HashSet<>();

            int max = 0;
            int n = in.nextInt();
            int m = in.nextInt();

            for (int i = 0; i < n; i++) 
            {
                int num = in.nextInt();
                deque.add(num);
                hs.add(num);
                if(deque.size() == m)
                {
                 if(hs.size() > max )max = hs.size();
                 System.out.println(deque);
                 System.out.println(hs);
                 int poped_el = deque.remove();
                if(!hs.contains(poped_el))hs.remove(poped_el);
                }
                if (max == m)
                break;
            }
            System.out.println(max);
}
    }




