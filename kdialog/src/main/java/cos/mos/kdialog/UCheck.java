package cos.mos.kdialog;

/**
 * @Description: <p>
 * @Author: Kosmos
 * @Date: 2019.04.12 15:10
 * @Email: KosmoSakura@gmail.com
 */
public class UCheck {
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0 || str.trim().length() == 0 || str.equalsIgnoreCase("null");
    }

    public static String isNull(String str) {
        return isEmpty(str) ? "" : str;
    }

    public static String isNull(String str, final String defaul) {
        return isEmpty(str) ? defaul : str;
    }
}
