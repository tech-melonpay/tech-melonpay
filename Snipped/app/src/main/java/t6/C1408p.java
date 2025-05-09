package t6;

import android.text.SpannedString;
import android.util.SparseIntArray;
import android.view.View;
import com.luminary.mobile.R;

/* compiled from: CellAccountCryptoDetailsTopBindingImpl.java */
/* renamed from: t6.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1408p extends AbstractC1400o {

    /* renamed from: F, reason: collision with root package name */
    public static final SparseIntArray f29438F;

    /* renamed from: E, reason: collision with root package name */
    public long f29439E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29438F = sparseIntArray;
        sparseIntArray.put(R.id.tvFreeze, 9);
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f29439E;
            this.f29439E = 0L;
        }
        Integer num = this.f29388y;
        View.OnClickListener onClickListener = this.f29373A;
        View.OnClickListener onClickListener2 = this.f29376D;
        View.OnClickListener onClickListener3 = this.f29374B;
        String str = this.f29386w;
        View.OnClickListener onClickListener4 = this.f29389z;
        SpannedString spannedString = this.f29387x;
        View.OnClickListener onClickListener5 = this.f29375C;
        long j11 = 2049 & j10;
        long j12 = 2050 & j10;
        long j13 = 2052 & j10;
        long j14 = j10 & 2064;
        long j15 = j10 & 2112;
        long j16 = j10 & 2176;
        long j17 = j10 & 2304;
        long j18 = j10 & 3072;
        if (j14 != 0) {
            this.f29377n.setOnClickListener(onClickListener3);
        }
        if (j11 != 0) {
            C8.a.d(this.f29378o, num);
        }
        if (j16 != 0) {
            this.f29379p.setOnClickListener(onClickListener4);
        }
        if (j12 != 0) {
            this.f29380q.setOnClickListener(onClickListener);
        }
        if (j15 != 0) {
            G0.c.a(this.f29382s, str);
        }
        if (j17 != 0) {
            this.f29383t.setText(spannedString);
        }
        if (j13 != 0) {
            this.f29384u.setOnClickListener(onClickListener2);
        }
        if (j18 != 0) {
            this.f29385v.setOnClickListener(onClickListener5);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29439E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (44 == i) {
            this.f29388y = (Integer) obj;
            synchronized (this) {
                this.f29439E |= 1;
            }
            a();
            i();
        } else if (115 == i) {
            this.f29373A = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29439E |= 2;
            }
            a();
            i();
        } else if (116 == i) {
            this.f29376D = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29439E |= 4;
            }
            a();
            i();
        } else if (72 == i) {
        } else if (108 == i) {
            this.f29374B = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29439E |= 16;
            }
            a();
            i();
        } else if (70 == i) {
        } else if (101 == i) {
            this.f29386w = (String) obj;
            synchronized (this) {
                this.f29439E |= 64;
            }
            a();
            i();
        } else if (112 == i) {
            this.f29389z = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29439E |= 128;
            }
            a();
            i();
        } else if (3 == i) {
            this.f29387x = (SpannedString) obj;
            synchronized (this) {
                this.f29439E |= 256;
            }
            a();
            i();
        } else if (83 == i) {
        } else {
            if (117 != i) {
                return false;
            }
            this.f29375C = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29439E |= 1024;
            }
            a();
            i();
        }
        return true;
    }
}
