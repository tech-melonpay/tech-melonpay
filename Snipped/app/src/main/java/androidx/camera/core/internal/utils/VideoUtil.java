package androidx.camera.core.internal.utils;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.camera.core.Logger;

/* loaded from: classes.dex */
public final class VideoUtil {
    private static final String TAG = "VideoUtil";

    private VideoUtil() {
    }

    public static String getAbsolutePathFromUri(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            try {
                Cursor query = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
                query.getClass();
                cursor = query;
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
                cursor.moveToFirst();
                String string = cursor.getString(columnIndexOrThrow);
                cursor.close();
                return string;
            } catch (RuntimeException e10) {
                Logger.e(TAG, "Failed in getting absolute path for Uri " + uri.toString() + " with Exception " + e10.toString());
                if (cursor != null) {
                    cursor.close();
                }
                return "";
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
