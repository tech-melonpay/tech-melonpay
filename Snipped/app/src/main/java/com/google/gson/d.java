package com.google.gson;

import com.google.gson.stream.JsonToken;
import r3.C1149a;

/* compiled from: Gson.java */
/* loaded from: classes.dex */
public final class d extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10325a;

    public /* synthetic */ d(int i) {
        this.f10325a = i;
    }

    @Override // com.google.gson.r
    public final Object a(C1149a c1149a) {
        switch (this.f10325a) {
            case 0:
                if (c1149a.k0() != JsonToken.i) {
                    return Double.valueOf(c1149a.P());
                }
                c1149a.Y();
                return null;
            default:
                if (c1149a.k0() != JsonToken.i) {
                    return Float.valueOf((float) c1149a.P());
                }
                c1149a.Y();
                return null;
        }
    }

    @Override // com.google.gson.r
    public final void b(r3.b bVar, Object obj) {
        switch (this.f10325a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double doubleValue = number.doubleValue();
                    g.a(doubleValue);
                    bVar.P(doubleValue);
                    break;
                } else {
                    bVar.E();
                    break;
                }
            default:
                Number number2 = (Number) obj;
                if (number2 != null) {
                    float floatValue = number2.floatValue();
                    g.a(floatValue);
                    if (!(number2 instanceof Float)) {
                        number2 = Float.valueOf(floatValue);
                    }
                    bVar.V(number2);
                    break;
                } else {
                    bVar.E();
                    break;
                }
        }
    }
}
