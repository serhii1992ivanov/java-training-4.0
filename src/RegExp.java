import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        // Regular expression for matching IPv4 addresses
        String ipPattern =
            "(?<![0-9])" +                               // Ensure that the IP is not part of a longer number
                "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +  // Match the first three octets
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(?![0-9])";  // Match the fourth octet
        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }
        return "";
    }
}