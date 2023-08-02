package ContainsDuplicate;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       int[] nums = {1,2,3,1};
       Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));

        System.out.println(set.size()!=nums.length);

    }
}
