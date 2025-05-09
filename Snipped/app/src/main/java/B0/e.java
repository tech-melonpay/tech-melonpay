package B0;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import y0.C1599c;
import y0.q;

/* compiled from: TextViewOnReceiveContentListener.java */
/* loaded from: classes.dex */
public final class e implements q {
    @Override // y0.q
    public final C1599c a(View view, C1599c c1599c) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c1599c);
        }
        if (c1599c.f31050a.d() == 2) {
            return c1599c;
        }
        C1599c.e eVar = c1599c.f31050a;
        ClipData a10 = eVar.a();
        int b9 = eVar.b();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z10 = false;
        for (int i = 0; i < a10.getItemCount(); i++) {
            ClipData.Item itemAt = a10.getItemAt(i);
            if ((b9 & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z10) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z10 = true;
                }
            }
        }
        return null;
    }
}
