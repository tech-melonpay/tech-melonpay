package ka;

import da.InterfaceC0701a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Strings.kt */
/* renamed from: ka.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0958c implements Iterator<String>, InterfaceC0701a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f23067a;

    /* renamed from: b, reason: collision with root package name */
    public int f23068b;

    /* renamed from: c, reason: collision with root package name */
    public int f23069c;

    /* renamed from: d, reason: collision with root package name */
    public int f23070d;

    /* renamed from: e, reason: collision with root package name */
    public int f23071e;

    public C0958c(CharSequence charSequence) {
        this.f23067a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i9;
        int i10 = this.f23068b;
        if (i10 != 0) {
            return i10 == 1;
        }
        if (this.f23071e < 0) {
            this.f23068b = 2;
            return false;
        }
        CharSequence charSequence = this.f23067a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i11 = this.f23069c; i11 < length2; i11++) {
            char charAt = charSequence.charAt(i11);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i9 = i11 + 1) < charSequence.length() && charSequence.charAt(i9) == '\n') ? 2 : 1;
                length = i11;
                this.f23068b = 1;
                this.f23071e = i;
                this.f23070d = length;
                return true;
            }
        }
        i = -1;
        this.f23068b = 1;
        this.f23071e = i;
        this.f23070d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f23068b = 0;
        int i = this.f23070d;
        int i9 = this.f23069c;
        this.f23069c = this.f23071e + i;
        return this.f23067a.subSequence(i9, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
