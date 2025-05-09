package androidx.camera.core.impl.utils;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

/* loaded from: classes.dex */
public final class ContextUtil {

    public static class Api30Impl {
        private Api30Impl() {
        }

        public static Context createAttributionContext(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String getAttributionTag(Context context) {
            return context.getAttributionTag();
        }
    }

    private ContextUtil() {
    }

    public static Context getApplicationContext(Context context) {
        String attributionTag;
        Context applicationContext = context.getApplicationContext();
        return (Build.VERSION.SDK_INT < 30 || (attributionTag = Api30Impl.getAttributionTag(context)) == null) ? applicationContext : Api30Impl.createAttributionContext(applicationContext, attributionTag);
    }

    public static Application getApplicationFromContext(Context context) {
        for (Context applicationContext = getApplicationContext(context); applicationContext instanceof ContextWrapper; applicationContext = getBaseContext((ContextWrapper) applicationContext)) {
            if (applicationContext instanceof Application) {
                return (Application) applicationContext;
            }
        }
        return null;
    }

    public static Context getBaseContext(ContextWrapper contextWrapper) {
        String attributionTag;
        Context baseContext = contextWrapper.getBaseContext();
        return (Build.VERSION.SDK_INT < 30 || (attributionTag = Api30Impl.getAttributionTag(contextWrapper)) == null) ? baseContext : Api30Impl.createAttributionContext(baseContext, attributionTag);
    }
}
