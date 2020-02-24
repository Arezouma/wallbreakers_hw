public List<String> subdomainVisits(String[] cpdomains) {
    Map<String, Integer> map = new HashMap<>();
    List<String> result = new ArrayList<>();
    for (String domain : cpdomains) {
        String[] domains = domain.split(" ");
        int count = Integer.parseInt(domains[0]);
        String[] subDomain = domains[1].split("\\.");
        String str = "";
        for (int i=subDomain.length - 1; i>=0; i--) {
            str = subDomain[i] + str;
            int existing = map.getOrDefault(str, 0);
            map.put(str, existing + count);
            str = "." + str;
        }          
    }
    
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        result.add(entry.getValue() + " " + entry.getKey());
    }
    return result;
    
}