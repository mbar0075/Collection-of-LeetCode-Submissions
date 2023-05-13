import java.util.*;

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> subdomainCounts = new HashMap<String, Integer>();
        for (String cpdomain : cpdomains) {
            String[] parts = cpdomain.split("\\s+"); // split count and domain
            int count = Integer.parseInt(parts[0]);
            String[] subdomains = parts[1].split("\\."); // split domain into subdomains
            String current = "";
            for (int i = subdomains.length - 1; i >= 0; i--) {
                current = subdomains[i] + (current.isEmpty() ? "" : ".") + current;
                subdomainCounts.put(current, subdomainCounts.getOrDefault(current, 0) + count);
            }
        }
        List<String> result = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : subdomainCounts.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }
        return result;
    }
}
