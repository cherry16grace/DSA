import java.util.*;

public class groupAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();
        String[] arr = new String[n];

        // Input strings
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // Edge case
        if (arr == null || n == 0) {
            System.out.println("empty");
            return;
        }

        // Map to store grouped anagrams
        Map<String, List<String>> res = new HashMap<>();

        // Main logic
        for (String s : arr) {
            char[] count = new char[26];

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int num : count) {
                sb.append(num).append('#');
            }

            String key = sb.toString();

            if (!res.containsKey(key)) {
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(s);
        }

        // Print result
        for (List<String> group : res.values()) {
            System.out.println(group);
        }

        sc.close();
    }
}
