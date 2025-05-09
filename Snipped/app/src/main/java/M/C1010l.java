package m;

import K0.a;
import K0.g;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import g.C0756a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import pa.C1124b;

/* compiled from: AppCompatEmojiEditTextHelper.java */
/* renamed from: m.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1010l {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f23786a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.a f23787b;

    public C1010l(EditText editText) {
        this.f23786a = editText;
        this.f23787b = new K0.a(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        this.f23787b.f2214a.getClass();
        if (keyListener instanceof K0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new K0.e(keyListener);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f23786a.getContext().obtainStyledAttributes(attributeSet, C0756a.i, i, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final K0.c c(InputConnection inputConnection, EditorInfo editorInfo) {
        K0.a aVar = this.f23787b;
        if (inputConnection == null) {
            aVar.getClass();
            inputConnection = null;
        } else {
            a.C0029a c0029a = aVar.f2214a;
            c0029a.getClass();
            if (!(inputConnection instanceof K0.c)) {
                inputConnection = new K0.c(c0029a.f2215a, inputConnection, editorInfo);
            }
        }
        return (K0.c) inputConnection;
    }

    public final void d(boolean z10) {
        K0.g gVar = this.f23787b.f2214a.f2216b;
        if (gVar.f2236d != z10) {
            if (gVar.f2235c != null) {
                androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
                g.a aVar = gVar.f2235c;
                a10.getClass();
                C1124b.p(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.f6549a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.f6550b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            gVar.f2236d = z10;
            if (z10) {
                K0.g.a(gVar.f2233a, androidx.emoji2.text.d.a().b());
            }
        }
    }
}
