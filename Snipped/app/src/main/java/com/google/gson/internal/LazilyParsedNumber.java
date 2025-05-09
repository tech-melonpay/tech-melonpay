package com.google.gson.internal;

import j3.e;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes.dex */
public final class LazilyParsedNumber extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f10383a;

    public LazilyParsedNumber(String str) {
        this.f10383a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return e.A(this.f10383a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f10383a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazilyParsedNumber) {
            return this.f10383a.equals(((LazilyParsedNumber) obj).f10383a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f10383a);
    }

    public final int hashCode() {
        return this.f10383a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f10383a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return e.A(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f10383a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return e.A(str).longValue();
        }
    }

    public final String toString() {
        return this.f10383a;
    }
}
