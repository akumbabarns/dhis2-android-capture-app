package org.dhis2.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import androidx.appcompat.content.res.AppCompatResources;

public class ObjectStyleUtils {

    public static Drawable getIconResource(Context context, String resourceName, int defaultResource) {
        Resources resources = context.getResources();
        String iconName = resourceName.startsWith("ic_") ? resourceName : "ic_" + resourceName;
        int iconResource = resources.getIdentifier(iconName, "drawable", context.getPackageName());

        Drawable defaultDrawable = AppCompatResources.getDrawable(context, defaultResource);
        Drawable drawable = AppCompatResources.getDrawable(context, iconResource);

        return drawable != null ? drawable : defaultDrawable;
    }

}
