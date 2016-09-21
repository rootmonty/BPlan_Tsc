package badebaba.myapplication.Db_Authentication;

/**
 * Created by badebaba on 9/21/2016.
 */

public class Config {
    //URLs to register.php and confirm.php file
    public static final String REGISTER_URL = "http://192.168.1.4:5090/androidotp/register.php";
    public static final String CONFIRM_URL = "http://192.168.1.4:5090/androidotp/confirm.php";

    //Keys to send username, password, phone and otp
    public static final String KEY_USERNAME = "username";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PHONE = "phone";
    public static final String KEY_OTP = "otp";

    //JSON Tag from response from server
    public static final String TAG_RESPONSE = "ErrorMessage";
}
