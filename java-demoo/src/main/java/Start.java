import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author CBeann
 * @create 2020-02-20 2:49
 */
public class Start {

  public static void main(String[] args) throws Exception {}

  /**
   * @param str 字符串
   * @return 是否是数字
   */
  public static boolean isMobile(String str) {
    Pattern p = null;
    Matcher m = null;
    boolean b = false;
    // 验证手机号
    p = Pattern.compile("^[1][0-9]{10}$");
    m = p.matcher(str);
    b = m.matches();
    return b;
  }
}
