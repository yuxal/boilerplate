package boulderstudios.com.boilerplate.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
/**
 * Created by yuval on 2/24/18.
 */

public class GraphicUtils {

    public static int convertDpToPixel(Context context, int dp){
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return Math.round(dp * ((float)metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT));
    }

    public static int convertPixelsToDp(int px, Context context){
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return Math.round(px / ((float)metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT));
    }
}
