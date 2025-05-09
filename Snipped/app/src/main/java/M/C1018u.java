package m;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import y0.C1596C;
import y0.C1599c;

/* compiled from: AppCompatReceiveContentHelper.java */
/* renamed from: m.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018u {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        C1599c.b bVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                bVar = new C1599c.a(clipData, 3);
            } else {
                C1599c.C0482c c0482c = new C1599c.C0482c();
                c0482c.f31052a = clipData;
                c0482c.f31053b = 3;
                bVar = c0482c;
            }
            C1596C.k(textView, bVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        C1599c.b bVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            bVar = new C1599c.a(clipData, 3);
        } else {
            C1599c.C0482c c0482c = new C1599c.C0482c();
            c0482c.f31052a = clipData;
            c0482c.f31053b = 3;
            bVar = c0482c;
        }
        C1596C.k(view, bVar.build());
        return true;
    }
}
