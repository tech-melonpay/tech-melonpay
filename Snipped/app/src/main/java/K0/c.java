package K0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.d;

/* compiled from: EmojiInputConnection.java */
/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2220a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2221b;

    /* compiled from: EmojiInputConnection.java */
    public static class a {
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0049, code lost:
        
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0086, code lost:
        
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0079, code lost:
        
            if (r11 != false) goto L48;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean a(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: K0.c.a.a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        a aVar = new a();
        this.f2220a = editText;
        this.f2221b = aVar;
        if (androidx.emoji2.text.d.f6548k != null) {
            androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
            if (a10.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            d.a aVar2 = a10.f6553e;
            aVar2.getClass();
            Bundle bundle = editorInfo.extras;
            J0.b bVar = aVar2.f6558c.f6590a;
            int a11 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a11 != 0 ? bVar.f2099b.getInt(a11 + bVar.f2098a) : 0);
            Bundle bundle2 = editorInfo.extras;
            aVar2.f6559a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i9) {
        Editable editableText = this.f2220a.getEditableText();
        this.f2221b.getClass();
        return a.a(this, editableText, i, i9, false) || super.deleteSurroundingText(i, i9);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i9) {
        Editable editableText = this.f2220a.getEditableText();
        this.f2221b.getClass();
        return a.a(this, editableText, i, i9, true) || super.deleteSurroundingTextInCodePoints(i, i9);
    }
}
