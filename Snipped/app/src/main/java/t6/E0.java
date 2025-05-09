package t6;

import G0.c;
import android.text.InputFilter;
import android.view.View;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import java.util.Arrays;

/* compiled from: CellInputTextBindingImpl.java */
/* loaded from: classes2.dex */
public final class E0 extends D0 {

    /* renamed from: C, reason: collision with root package name */
    public long f27762C;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public E0(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            r0 = 4
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r11, r0, r1)
            r2 = 3
            r2 = r0[r2]
            r6 = r2
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r2 = 1
            r2 = r0[r2]
            r7 = r2
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r7 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r7
            r2 = 2
            r2 = r0[r2]
            r8 = r2
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r8 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = -1
            r9.f27762C = r2
            android.widget.ImageView r10 = r9.f27727n
            r10.setTag(r1)
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r10 = r9.f27728o
            r10.setTag(r1)
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r10 = r9.f27729p
            r10.setTag(r1)
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r10.setTag(r1)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 4096(0x1000, double:2.0237E-320)
            r9.f27762C = r10     // Catch: java.lang.Throwable -> L46
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L46
            r9.i()
            return
        L46:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L46
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.E0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        c.InterfaceC0016c interfaceC0016c;
        int intValue;
        synchronized (this) {
            j10 = this.f27762C;
            this.f27762C = 0L;
        }
        View.OnClickListener onClickListener = this.f27725A;
        Integer num = this.f27732s;
        Integer num2 = this.f27733t;
        Boolean bool = this.f27736w;
        Integer num3 = this.f27737x;
        c.InterfaceC0016c interfaceC0016c2 = this.f27726B;
        String str = this.f27731r;
        Boolean bool2 = this.f27735v;
        String str2 = this.f27730q;
        String str3 = this.f27734u;
        Boolean bool3 = this.f27739z;
        String str4 = this.f27738y;
        long j11 = j10 & 5121;
        boolean z10 = j11 != 0 ? !F0.f.k(bool3) : false;
        long j12 = j10 & 4098;
        int j13 = j12 != 0 ? F0.f.j(num) : 0;
        long j14 = j10 & 4100;
        long j15 = j10 & 4104;
        boolean z11 = j15 != 0 ? !F0.f.k(bool) : false;
        long j16 = j10 & 4112;
        long j17 = j10 & 4128;
        long j18 = j10 & 4160;
        long j19 = j10 & 4224;
        boolean k3 = j19 != 0 ? F0.f.k(bool2) : false;
        long j20 = j10 & 4352;
        long j21 = j10 & 4608;
        long j22 = j10 & 6144;
        if (j19 != 0) {
            interfaceC0016c = interfaceC0016c2;
            C8.a.b(this.f27727n, k3);
        } else {
            interfaceC0016c = interfaceC0016c2;
        }
        if (j20 != 0) {
            this.f27728o.setHint(str2);
        }
        if (j22 != 0) {
            this.f27728o.setError(str4);
        }
        if (j18 != 0) {
            G0.c.a(this.f27729p, str);
        }
        if (j12 != 0 && F0.f.f1141j >= 3) {
            this.f27729p.setInputType(j13);
        }
        if ((j10 & 5120) != 0) {
            this.f27729p.setCursorVisible(z10);
            this.f27729p.setFocusable(z10);
            this.f27729p.setFocusableInTouchMode(z10);
        }
        if (j15 != 0) {
            this.f27729p.setEnabled(z11);
        }
        if (j21 != 0) {
            this.f27729p.setCurrency(str3);
        }
        if (j14 != 0) {
            CustomTextInputEditText customTextInputEditText = this.f27729p;
            if (num2 != null && (intValue = num2.intValue()) >= 0 && intValue < 10) {
                customTextInputEditText.setMask(intValue);
            }
        }
        if (j16 != 0) {
            CustomTextInputEditText customTextInputEditText2 = this.f27729p;
            if (num3 != null && num3.intValue() > 0) {
                InputFilter[] filters = customTextInputEditText2.getFilters();
                InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(num3.intValue());
                int length = filters.length;
                Object[] copyOf = Arrays.copyOf(filters, length + 1);
                copyOf[length] = lengthFilter;
                customTextInputEditText2.setFilters((InputFilter[]) copyOf);
            }
        }
        if (j11 != 0) {
            CustomTextInputEditText customTextInputEditText3 = this.f27729p;
            customTextInputEditText3.setOnClickListener(onClickListener);
            customTextInputEditText3.setClickable(z10);
        }
        if (j17 != 0) {
            G0.c.b(this.f27729p, interfaceC0016c);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27762C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (111 == i) {
            this.f27725A = (View.OnClickListener) obj;
            synchronized (this) {
                this.f27762C |= 1;
            }
            a();
            i();
        } else if (47 == i) {
            this.f27732s = (Integer) obj;
            synchronized (this) {
                this.f27762C |= 2;
            }
            a();
            i();
        } else if (97 == i) {
            this.f27733t = (Integer) obj;
            synchronized (this) {
                this.f27762C |= 4;
            }
            a();
            i();
        } else if (55 == i) {
            this.f27736w = (Boolean) obj;
            synchronized (this) {
                this.f27762C |= 8;
            }
            a();
            i();
        } else if (98 == i) {
            this.f27737x = (Integer) obj;
            synchronized (this) {
                this.f27762C |= 16;
            }
            a();
            i();
        } else if (30 == i) {
            this.f27726B = (c.InterfaceC0016c) obj;
            synchronized (this) {
                this.f27762C |= 32;
            }
            a();
            i();
        } else if (154 == i) {
            this.f27731r = (String) obj;
            synchronized (this) {
                this.f27762C |= 64;
            }
            a();
            i();
        } else if (168 == i) {
            this.f27735v = (Boolean) obj;
            synchronized (this) {
                this.f27762C |= 128;
            }
            a();
            i();
        } else if (42 == i) {
            this.f27730q = (String) obj;
            synchronized (this) {
                this.f27762C |= 256;
            }
            a();
            i();
        } else if (21 == i) {
            this.f27734u = (String) obj;
            synchronized (this) {
                this.f27762C |= 512;
            }
            a();
            i();
        } else if (120 == i) {
            this.f27739z = (Boolean) obj;
            synchronized (this) {
                this.f27762C |= 1024;
            }
            a();
            i();
        } else {
            if (33 != i) {
                return false;
            }
            this.f27738y = (String) obj;
            synchronized (this) {
                this.f27762C |= 2048;
            }
            a();
            i();
        }
        return true;
    }
}
