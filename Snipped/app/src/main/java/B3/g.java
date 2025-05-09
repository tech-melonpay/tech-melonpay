package b3;

import b3.l;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.a;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import i3.t;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: KeysetHandle.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.crypto.tink.proto.a f8297a;

    public g(com.google.crypto.tink.proto.a aVar) {
        this.f8297a = aVar;
    }

    public static final g b(B1.f fVar, InterfaceC0586a interfaceC0586a) {
        t x9 = t.x(fVar.s(), C0666m.a());
        if (x9.v().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            com.google.crypto.tink.proto.a A10 = com.google.crypto.tink.proto.a.A(interfaceC0586a.decrypt(x9.v().l(), new byte[0]), C0666m.a());
            if (A10.w() > 0) {
                return new g(A10);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final <P> P a(Class<P> cls) {
        byte[] array;
        m mVar = (m) p.f8313e.get(cls);
        Class a10 = mVar == null ? null : mVar.a();
        if (a10 == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i = q.f8314a;
        com.google.crypto.tink.proto.a aVar = this.f8297a;
        int y10 = aVar.y();
        Iterator<a.b> it = aVar.x().iterator();
        boolean z10 = true;
        int i9 = 0;
        boolean z11 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            KeyStatusType keyStatusType = KeyStatusType.ENABLED;
            if (!hasNext) {
                if (i9 == 0) {
                    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
                if (!z11 && !z10) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                l lVar = new l(a10);
                for (a.b bVar : aVar.x()) {
                    if (bVar.A() == keyStatusType) {
                        Object d10 = p.d(bVar.x().y(), bVar.x().z(), a10);
                        if (bVar.A() != keyStatusType) {
                            throw new GeneralSecurityException("only ENABLED key is allowed");
                        }
                        int ordinal = bVar.z().ordinal();
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    array = b.f8288a;
                                } else if (ordinal != 4) {
                                    throw new GeneralSecurityException("unknown output prefix type");
                                }
                            }
                            array = ByteBuffer.allocate(5).put((byte) 0).putInt(bVar.y()).array();
                        } else {
                            array = ByteBuffer.allocate(5).put((byte) 1).putInt(bVar.y()).array();
                        }
                        l.a<P> aVar2 = new l.a<>(d10, array, bVar.A(), bVar.z());
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(aVar2);
                        l.b bVar2 = new l.b(aVar2.a());
                        ConcurrentHashMap concurrentHashMap = lVar.f8300a;
                        List list = (List) concurrentHashMap.put(bVar2, Collections.unmodifiableList(arrayList));
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(list);
                            arrayList2.add(aVar2);
                            concurrentHashMap.put(bVar2, Collections.unmodifiableList(arrayList2));
                        }
                        if (bVar.y() != aVar.y()) {
                            continue;
                        } else {
                            if (aVar2.f8305c != keyStatusType) {
                                throw new IllegalArgumentException("the primary entry has to be ENABLED");
                            }
                            if (lVar.a(aVar2.a()).isEmpty()) {
                                throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                            }
                            lVar.f8301b = aVar2;
                        }
                    }
                }
                m mVar2 = (m) p.f8313e.get(cls);
                Class<P> cls2 = lVar.f8302c;
                if (mVar2 == null) {
                    throw new GeneralSecurityException("No wrapper found for ".concat(cls2.getName()));
                }
                if (mVar2.a().equals(cls2)) {
                    return (P) mVar2.c(lVar);
                }
                throw new GeneralSecurityException("Wrong input primitive class, expected " + mVar2.a() + ", got " + cls2);
            }
            a.b next = it.next();
            if (next.A() == keyStatusType) {
                if (!next.B()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(next.y())));
                }
                if (next.z() == OutputPrefixType.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(next.y())));
                }
                if (next.A() == KeyStatusType.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(next.y())));
                }
                if (next.y() == y10) {
                    if (z11) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z11 = true;
                }
                if (next.x().x() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    z10 = false;
                }
                i9++;
            }
        }
    }

    public final String toString() {
        return q.a(this.f8297a).toString();
    }
}
