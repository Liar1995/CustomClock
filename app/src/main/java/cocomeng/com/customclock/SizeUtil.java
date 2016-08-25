package cocomeng.com.customclock;

import android.content.Context;

/**
 * Created by Sunmeng Data:2016-08-25
 * E-Mail:Sunmeng1995@outlook.com
 * Description:
 */
public class SizeUtil {
    private final static String DEFAULT_DBNAME = "SizeUtil";
    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int Dp2Px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int Sp2Px(Context context, float spValue) {
        final float scale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * scale + 0.5f);
    }
}
