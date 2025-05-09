package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes.dex */
public final class o extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Serializable f10409a;

    public o(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f10409a = bool;
    }

    public static boolean g(o oVar) {
        Serializable serializable = oVar.f10409a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.l
    public final String a() {
        Serializable serializable = this.f10409a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return f().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger b() {
        Serializable serializable = this.f10409a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (g(this)) {
            return BigInteger.valueOf(f().longValue());
        }
        String a10 = a();
        j3.e.d(a10);
        return new BigInteger(a10);
    }

    public final boolean c() {
        Serializable serializable = this.f10409a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(a());
    }

    public final double e() {
        return this.f10409a instanceof Number ? f().doubleValue() : Double.parseDouble(a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        Serializable serializable = this.f10409a;
        Serializable serializable2 = oVar.f10409a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (g(this) && g(oVar)) {
            return ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) ? b().equals(oVar.b()) : f().longValue() == oVar.f().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return (serializable instanceof BigDecimal ? (BigDecimal) serializable : j3.e.A(a())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : j3.e.A(oVar.a())) == 0;
        }
        double e10 = e();
        double e11 = oVar.e();
        if (e10 != e11) {
            return Double.isNaN(e10) && Double.isNaN(e11);
        }
        return true;
    }

    public final Number f() {
        Serializable serializable = this.f10409a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new LazilyParsedNumber((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f10409a;
        if (serializable == null) {
            return 31;
        }
        if (g(this)) {
            doubleToLongBits = f().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(f().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public o(Number number) {
        Objects.requireNonNull(number);
        this.f10409a = number;
    }

    public o(String str) {
        Objects.requireNonNull(str);
        this.f10409a = str;
    }
}
