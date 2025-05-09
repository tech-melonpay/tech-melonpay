package q;

import androidx.lifecycle.A;

/* compiled from: FingerprintDialogFragment.java */
/* loaded from: classes.dex */
public final class o implements A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f25827b;

    public /* synthetic */ o(n nVar, int i) {
        this.f25826a = i;
        this.f25827b = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r1 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        if (r1 == 3) goto L28;
     */
    @Override // androidx.lifecycle.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onChanged(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f25826a
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            q.n r0 = r10.f25827b
            android.os.Handler r1 = r0.f25817f0
            q.n$a r2 = r0.f25818g0
            r1.removeCallbacks(r2)
            android.widget.TextView r1 = r0.f25823l0
            if (r1 == 0) goto L17
            r1.setText(r11)
        L17:
            android.os.Handler r11 = r0.f25817f0
            r0 = 2000(0x7d0, double:9.88E-321)
            r11.postDelayed(r2, r0)
            return
        L1f:
            java.lang.Integer r11 = (java.lang.Integer) r11
            q.n r0 = r10.f25827b
            android.os.Handler r1 = r0.f25817f0
            q.n$a r2 = r0.f25818g0
            r1.removeCallbacks(r2)
            int r1 = r11.intValue()
            android.widget.ImageView r3 = r0.f25822k0
            r4 = 2
            if (r3 != 0) goto L34
            goto L83
        L34:
            q.k r3 = r0.f25819h0
            int r3 = r3.f25806V0
            android.content.Context r5 = r0.getContext()
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L48
            java.lang.String r5 = "FingerprintFragment"
            java.lang.String r8 = "Unable to get asset. Context is null."
            android.util.Log.w(r5, r8)
            goto L66
        L48:
            r8 = 2131231108(0x7f080184, float:1.8078288E38)
            if (r3 != 0) goto L50
            if (r1 != r6) goto L50
            goto L62
        L50:
            if (r3 != r6) goto L58
            if (r1 != r4) goto L58
            r8 = 2131231107(0x7f080183, float:1.8078286E38)
            goto L62
        L58:
            if (r3 != r4) goto L5d
            if (r1 != r6) goto L5d
            goto L62
        L5d:
            if (r3 != r6) goto L66
            r9 = 3
            if (r1 != r9) goto L66
        L62:
            android.graphics.drawable.Drawable r7 = k0.C0913a.getDrawable(r5, r8)
        L66:
            if (r7 != 0) goto L69
            goto L83
        L69:
            android.widget.ImageView r5 = r0.f25822k0
            r5.setImageDrawable(r7)
            if (r3 != 0) goto L73
            if (r1 != r6) goto L73
            goto L7f
        L73:
            if (r3 != r6) goto L78
            if (r1 != r4) goto L78
            goto L7c
        L78:
            if (r3 != r4) goto L7f
            if (r1 != r6) goto L7f
        L7c:
            q.n.c.a(r7)
        L7f:
            q.k r3 = r0.f25819h0
            r3.f25806V0 = r1
        L83:
            int r11 = r11.intValue()
            android.widget.TextView r1 = r0.f25823l0
            if (r1 == 0) goto L95
            if (r11 != r4) goto L90
            int r11 = r0.f25820i0
            goto L92
        L90:
            int r11 = r0.f25821j0
        L92:
            r1.setTextColor(r11)
        L95:
            android.os.Handler r11 = r0.f25817f0
            r0 = 2000(0x7d0, double:9.88E-321)
            r11.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.o.onChanged(java.lang.Object):void");
    }
}
