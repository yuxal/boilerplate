package boulderstudios.com.boilerplate.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
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

    public static Bitmap scaleBitmap(Bitmap bitmap, int maxWidth,int maxHeight) {
        int currentHeight = bitmap.getHeight();
        int currentWidth = bitmap.getWidth();
        int newHeight = currentHeight;
        int newWidth = currentWidth;

        if (currentHeight > maxHeight) {
            newHeight = maxHeight;
            newWidth = currentWidth * newHeight / currentHeight;
            currentWidth = newWidth;
        }
        if (newWidth > maxWidth) {
            newWidth = maxWidth;
            newHeight = newHeight * newWidth / currentWidth;
        }
        if (newWidth == bitmap.getWidth() && newHeight == bitmap.getHeight()) {
            return bitmap;
        }
        return Bitmap.createScaledBitmap(bitmap, newWidth, newHeight, false);
    }
}
