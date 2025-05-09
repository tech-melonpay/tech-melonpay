package com.sumsub.sns.internal.core.domain;

import C.v;
import java.io.File;

/* loaded from: classes2.dex */
public final class d extends com.sumsub.sns.internal.core.domain.base.a<File, a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.cache.a f16380a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f16381a;

        public a(String str) {
            this.f16381a = str;
        }

        public final String b() {
            return this.f16381a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.f.b(this.f16381a, ((a) obj).f16381a);
        }

        public int hashCode() {
            return this.f16381a.hashCode();
        }

        public String toString() {
            return v.q(new StringBuilder("Params(name="), this.f16381a, ')');
        }
    }

    public d(com.sumsub.sns.internal.core.data.source.cache.a aVar) {
        this.f16380a = aVar;
    }

    public Object a(a aVar, T9.a<? super File> aVar2) {
        return this.f16380a.a(aVar.b(), aVar2);
    }

    public d(com.sumsub.sns.internal.core.a aVar) {
        this(aVar.k());
    }
}
