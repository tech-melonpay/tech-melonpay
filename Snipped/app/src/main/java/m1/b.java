package m1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel.java */
/* loaded from: classes.dex */
public final class b extends AbstractC1025a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f23882d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f23883e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23884f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23885g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23886h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f23887j;

    /* renamed from: k, reason: collision with root package name */
    public int f23888k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // m1.AbstractC1025a
    public final b a() {
        Parcel parcel = this.f23883e;
        int dataPosition = parcel.dataPosition();
        int i = this.f23887j;
        if (i == this.f23884f) {
            i = this.f23885g;
        }
        return new b(parcel, dataPosition, i, androidx.camera.core.impl.utils.a.n(new StringBuilder(), this.f23886h, "  "), this.f23879a, this.f23880b, this.f23881c);
    }

    @Override // m1.AbstractC1025a
    public final boolean e() {
        return this.f23883e.readInt() != 0;
    }

    @Override // m1.AbstractC1025a
    public final byte[] f() {
        Parcel parcel = this.f23883e;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // m1.AbstractC1025a
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f23883e);
    }

    @Override // m1.AbstractC1025a
    public final boolean h(int i) {
        while (this.f23887j < this.f23885g) {
            int i9 = this.f23888k;
            if (i9 == i) {
                return true;
            }
            if (String.valueOf(i9).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i10 = this.f23887j;
            Parcel parcel = this.f23883e;
            parcel.setDataPosition(i10);
            int readInt = parcel.readInt();
            this.f23888k = parcel.readInt();
            this.f23887j += readInt;
        }
        return this.f23888k == i;
    }

    @Override // m1.AbstractC1025a
    public final int i() {
        return this.f23883e.readInt();
    }

    @Override // m1.AbstractC1025a
    public final <T extends Parcelable> T k() {
        return (T) this.f23883e.readParcelable(b.class.getClassLoader());
    }

    @Override // m1.AbstractC1025a
    public final String l() {
        return this.f23883e.readString();
    }

    @Override // m1.AbstractC1025a
    public final void n(int i) {
        w();
        this.i = i;
        this.f23882d.put(i, this.f23883e.dataPosition());
        r(0);
        r(i);
    }

    @Override // m1.AbstractC1025a
    public final void o(boolean z10) {
        this.f23883e.writeInt(z10 ? 1 : 0);
    }

    @Override // m1.AbstractC1025a
    public final void p(byte[] bArr) {
        Parcel parcel = this.f23883e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // m1.AbstractC1025a
    public final void q(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f23883e, 0);
    }

    @Override // m1.AbstractC1025a
    public final void r(int i) {
        this.f23883e.writeInt(i);
    }

    @Override // m1.AbstractC1025a
    public final void t(Parcelable parcelable) {
        this.f23883e.writeParcelable(parcelable, 0);
    }

    @Override // m1.AbstractC1025a
    public final void u(String str) {
        this.f23883e.writeString(str);
    }

    public final void w() {
        int i = this.i;
        if (i >= 0) {
            int i9 = this.f23882d.get(i);
            Parcel parcel = this.f23883e;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i9);
            parcel.writeInt(dataPosition - i9);
            parcel.setDataPosition(dataPosition);
        }
    }

    public b(Parcel parcel, int i, int i9, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f23882d = new SparseIntArray();
        this.i = -1;
        this.f23888k = -1;
        this.f23883e = parcel;
        this.f23884f = i;
        this.f23885g = i9;
        this.f23887j = i;
        this.f23886h = str;
    }
}
