public class Codec {

    Map<String, String> map = new HashMap<>();
    int counter=0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        counter++;
        String shortUrl = "http://tinyurl.com/" + Integer.toHexString(counter);
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));