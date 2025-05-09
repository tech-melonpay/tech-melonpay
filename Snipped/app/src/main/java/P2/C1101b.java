package p2;

import j2.AbstractC0888g;
import j2.AbstractC0892k;

/* compiled from: AutoValue_PersistedEvent.java */
/* renamed from: p2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1101b extends h {

    /* renamed from: a, reason: collision with root package name */
    public final long f25592a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0892k f25593b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0888g f25594c;

    public C1101b(long j10, AbstractC0892k abstractC0892k, AbstractC0888g abstractC0888g) {
        this.f25592a = j10;
        if (abstractC0892k == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f25593b = abstractC0892k;
        if (abstractC0888g == null) {
            throw new NullPointerException("Null event");
        }
        this.f25594c = abstractC0888g;
    }

    @Override // p2.h
    public final AbstractC0888g a() {
        return this.f25594c;
    }

    @Override // p2.h
    public final long b() {
        return this.f25592a;
    }

    @Override // p2.h
    public final AbstractC0892k c() {
        return this.f25593b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f25592a == hVar.b() && this.f25593b.equals(hVar.c()) && this.f25594c.equals(hVar.a());
    }

    public final int hashCode() {
        long j10 = this.f25592a;
        return ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f25593b.hashCode()) * 1000003) ^ this.f25594c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f25592a + ", transportContext=" + this.f25593b + ", event=" + this.f25594c + "}";
    }
}
