package d1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;

/* compiled from: SupportSQLiteCompat.kt */
/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683b {
    public static final List<Uri> a(Cursor cursor) {
        return cursor.getNotificationUris();
    }

    public static final void b(Cursor cursor, ContentResolver contentResolver, List<? extends Uri> list) {
        cursor.setNotificationUris(contentResolver, list);
    }
}
