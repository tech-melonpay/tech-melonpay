package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.MalformedJsonException;
import r3.C1149a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class ToNumberPolicy implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final ToNumberPolicy f10317a;

    /* renamed from: b, reason: collision with root package name */
    public static final ToNumberPolicy f10318b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ToNumberPolicy[] f10319c;

    static {
        ToNumberPolicy toNumberPolicy = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.1
            @Override // com.google.gson.q
            public final Number a(C1149a c1149a) {
                return Double.valueOf(c1149a.P());
            }
        };
        f10317a = toNumberPolicy;
        ToNumberPolicy toNumberPolicy2 = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.2
            @Override // com.google.gson.q
            public final Number a(C1149a c1149a) {
                return new LazilyParsedNumber(c1149a.d0());
            }
        };
        f10318b = toNumberPolicy2;
        f10319c = new ToNumberPolicy[]{toNumberPolicy, toNumberPolicy2, new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.3
            public static Double c(String str, C1149a c1149a) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    if (c1149a.f26150b != Strictness.f10313a) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + c1149a.E());
                    }
                    return valueOf;
                } catch (NumberFormatException e10) {
                    StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Cannot parse ", str, "; at path ");
                    m2.append(c1149a.E());
                    throw new JsonParseException(m2.toString(), e10);
                }
            }

            @Override // com.google.gson.q
            public final Number a(C1149a c1149a) {
                String d02 = c1149a.d0();
                if (d02.indexOf(46) >= 0) {
                    return c(d02, c1149a);
                }
                try {
                    return Long.valueOf(Long.parseLong(d02));
                } catch (NumberFormatException unused) {
                    return c(d02, c1149a);
                }
            }
        }, new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.4
            @Override // com.google.gson.q
            public final Number a(C1149a c1149a) {
                String d02 = c1149a.d0();
                try {
                    return j3.e.A(d02);
                } catch (NumberFormatException e10) {
                    StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Cannot parse ", d02, "; at path ");
                    m2.append(c1149a.E());
                    throw new JsonParseException(m2.toString(), e10);
                }
            }
        }};
    }

    public ToNumberPolicy() {
        throw null;
    }

    public static ToNumberPolicy valueOf(String str) {
        return (ToNumberPolicy) Enum.valueOf(ToNumberPolicy.class, str);
    }

    public static ToNumberPolicy[] values() {
        return (ToNumberPolicy[]) f10319c.clone();
    }
}
